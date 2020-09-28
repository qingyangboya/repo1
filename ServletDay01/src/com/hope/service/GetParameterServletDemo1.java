package com.hope.service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *从浏览器中获取请求参数信息
 * 在浏览器的表单中填入不同的人名后，实现服务器对提交的内容的输出
 * @author:陈超
 * @date:2020/7/31
 */
public class GetParameterServletDemo1 extends HttpServlet {
    //重写service()方法
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        //获取请求参数中的人名
        String username=request.getParameter("username");
        out.println("请求参数中的人名为:"+username);
        out.close();
    }
}
