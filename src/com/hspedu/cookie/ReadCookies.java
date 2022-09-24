package com.hspedu.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 项目名：    cookie-session
 * 创建时间：   2022/9/24  15:19
 *
 * @author Mamenchisat
 * @verison 1.0
 */
@WebServlet(name = "ReadCookies", value = {"/readCookies"})
public class ReadCookies extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        if (cookies != null &&cookies.length > 0) {
            for (Cookie cookie :cookies) {
                System.out.println(cookie.getName()+cookie.getValue());
            }

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
