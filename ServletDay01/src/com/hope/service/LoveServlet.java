package com.hope.service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * HttpServletResponse对象操作
 * @author:陈超
 * @date:2020/7/31
 */
public class LoveServlet extends HttpServlet {
    //重写service()方法
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        PrintWriter out=response.getWriter();
        /*
        * 为表单增加爱好的复选框，随着提交内容的不同实现服务器对提交内容的输出
         * */
       String[] str= request.getParameterValues("love");
       for(int i=0;i<str.length;i++){
           out.println(str[i]+"<br>");
       }
       out.close();
    }
}
