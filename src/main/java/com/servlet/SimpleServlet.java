package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
//@WebServlet(value = "hello")
//@WebServlet(urlPatterns = "hello")
//@WebServlet({"/hello","/simple"})
//@WebServlet(urlPatterns = {"/hello","/simple"})
public class SimpleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>Simple Servlet</h1>");
        out.println("</body></html>");

    }
}

