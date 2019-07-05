package com.unicom.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.unicom.bean.User;
import com.unicom.dao.UserDaoImpl;
import com.unicom.service.UserService;
import com.unicom.service.impl.UserServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
        
    }
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String useraccount = request.getParameter("useraccount");
		String userpassword = request.getParameter("userpassword");
		String code = request.getParameter("code");

		User user = null;
		HttpSession session = request.getSession();
		String originCode=(String) session.getAttribute("code");

		//判断验证码
		if(originCode.equals(code)) {
			UserDaoImpl userService = new UserDaoImpl();
			user = userService.login(useraccount, userpassword);
			//判断根据用户名和密码是否查询到用户存在
			if (user != null)
			{
				//更新登录时间
				boolean update=userService.updateLastLoginTime(useraccount);
				// 对Session进行初始化，把合法用户的部分信息放入Session中
				initSession(session, user);
				request.setAttribute("reMsg", "用户验证成功");
				request.getRequestDispatcher("index.jsp").forward(request, response);
			} else
			{
				request.setAttribute("reMsgwar", "用户验证失败，用户名或密码错误");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}else {
			request.setAttribute("reMsgwar", "用户验证失败，验证码错误");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
	}
	


}
