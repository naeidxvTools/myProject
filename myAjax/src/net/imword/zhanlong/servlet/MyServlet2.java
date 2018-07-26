package net.imword.zhanlong.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "a",urlPatterns ="/MyServlet2",initParams = {@WebInitParam
        (name="name1",value = "zhanlong")})
//@WebInitParam(name="name1",value = "zhanlong")
public class MyServlet2 extends HttpServlet
{
    @Override
    public void init(ServletConfig config) throws ServletException
    {
        System.out.println(config.getInitParameter("name1"));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse
            response)  throws ServletException, IOException
    {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse
            response)  throws ServletException, IOException
    {

    }
}
