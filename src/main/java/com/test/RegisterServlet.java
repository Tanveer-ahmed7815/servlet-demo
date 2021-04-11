package com.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Deepak Moudgil
 */
@WebServlet(urlPatterns = "/registeruser", loadOnStartup = 1, displayName = "Register Servlet")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Inside servlet | This message will be printed inside tomcat logs");

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.write("User Name: "+req.getParameter("user_name")+"</br>");
        writer.write("Password: "+req.getParameter("user_password"));

        writer.write("\n\n<h1 style=\"color:blue;\">Happy?<h1>");
    }
}
