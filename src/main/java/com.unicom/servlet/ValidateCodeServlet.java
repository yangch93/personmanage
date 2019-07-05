package com.unicom.servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ValidateCodeServlet")
public class ValidateCodeServlet extends HttpServlet
{

	private static final long serialVersionUID = 1L;

	public ValidateCodeServlet()
	{
		super();
	}

	public void destroy()
	{
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// 禁止页面缓存
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-control", "No-cache");
		// 设置过期的时间
		response.setDateHeader("Expires", 0);
		response.setContentType("image/jpeg"); // 设置响应正文的MIME类型为图片
		int width = 60, height = 20;
		// 创建一个位于缓存的图像，宽度为60，高度为20
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);
		// 用于处理图形上下文的对象，相当于画笔
		Graphics g = image.getGraphics();
		// 创建一个生成随机数的对象
		Random random = new Random();
		// 设置画像的背景色
		g.setColor(getRandomColor(200, 250));
		// 画一个矩形，坐标为(0,0),宽度为60，高度为20
		g.fillRect(0, 0, width, height);
		// 设置字体格式
		g.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		g.setColor(getRandomColor(160, 200));
		// 产生100条随机的干扰线
		for (int i = 0; i < 100; i++)
		{
			int x = random.nextInt(width);
			int y = random.nextInt(height);
			int x1 = random.nextInt(12);
			int y1 = random.nextInt(12);
			// 在图形坐标间绘制干扰线
			g.drawLine(x, y, x1, y1);
		}

		String strCode = "";
		for (int i = 0; i < 4; i++)
		{
			String strNumber = String.valueOf(random.nextInt(10));
			// 拼接生成的验证码
			strCode = strCode + strNumber;
			// 设置字体颜色
			g.setColor(new Color(15 + random.nextInt(120), 15 + random.nextInt(120), 15 + random.nextInt(120)));
			// 将验证码一次画到图像上
			g.drawString(strNumber, 13 * i + 6, 16);
		}
		// 将验证码放到session中
		request.getSession().setAttribute("code", strCode);
		// System.out.println(strCode);
		g.dispose();
		// 输出JPEG格式的图片
		ImageIO.write(image, "JPEG", response.getOutputStream());
		// 刷新输出流
		response.getOutputStream().flush();
		// 关闭输出流
		response.getOutputStream().close();
	}

	/**
	 * 获取随机颜色
	 * 
	 * @param i
	 * @param j
	 * @return
	 */
	private Color getRandomColor(int fc, int fb)
	{
		Random random = new Random();
		Color randomColor = null;
		if (fc > 255)
		{
			fc = 255;
		}
		if (fb > 255)
		{
			fb = 255;
		}
		// 设置0-255之间的随机颜色值
		int r = fc + random.nextInt(fb - fc);
		int g = fc + random.nextInt(fb - fc);
		int b = fc + random.nextInt(fb - fc);
		randomColor = new Color(r, g, b);

		return randomColor;
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		this.doPost(request, response);

	}

	public String getServletInfo()
	{
		return "This is my default servlet created by Eclipse";
	}

	public void init() throws ServletException
	{
		// Put your code here
	}

}
