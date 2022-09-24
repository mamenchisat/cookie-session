package com.hspedu.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 项目名：    cookie-session
 * 创建时间：   2022/9/24  11:30
 *
 * @author Mamenchisat
 * @verison 1.0
 */
@WebServlet(name = "CreatCookie", value = {"/creatCookie"})
public class CreatCookie extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //这时这个cookie在服务端
        Cookie cookie = new Cookie("username", "hsp");
        //将该cookie发送到浏览器
        response.setContentType("text/html;charset=utf-8");
        response.addCookie(cookie);
        PrintWriter writer = response.getWriter();
        writer.println("<h1>创建cookie成功</h1>");
        writer.flush();
        writer.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
