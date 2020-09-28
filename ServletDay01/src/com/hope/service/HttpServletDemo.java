package com.hope.service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * HttpServletRequest对象操作
 * @author:陈超
 * @date:2020/7/31
 */
public class HttpServletDemo extends HttpServlet {
    //重写service()方法
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        out.println("头部名称为:"+request.getHeaderNames());
        out.println("<br>提交方式为:"+request.getMethod());
        out.println("<br>请求路径为:"+request.getRequestURI());
    }
}
