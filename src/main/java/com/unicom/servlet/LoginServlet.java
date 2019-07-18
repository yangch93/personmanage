package com.unicom.servlet;

import com.unicom.dao.LoginDao;
import com.unicom.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private User user;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String useraccount = req.getParameter("useraccount");
        String password = req.getParameter("password");
        LoginDao loginDao = new LoginDao();
        user = loginDao.LoginById(useraccount);

        if (user != null && useraccount.equals(user.getUserAccount()) && password.equals(user.getUserPassword())) {
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        } else {
            resp.setContentType("text/html; charset=UTF-8"); //转码
            PrintWriter out = resp.getWriter();
            out.flush();
            out.print("<script>alert('用户名或密码有误，请重新输入！'); window.location='login.jsp' </script>");
            out.flush();
            out.close();
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
