package mainProject.MyServlet;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//继承httpservlet开发原生的servlet
//@WebServlet标识servlet会注入
//对servlet做了映射的路径
//注入的原生的servlet，不会被springboot拦截
//需要servletComponentScan扫描原生的包，才能注入进去
//@WebServlet(urlPatterns = {"/servlet01","/servlet02"})
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
