package lesson03.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 서블릿 인터페이스 규칙을 통해서 만든 클래스만이 서블릿 클래스가 된다.
 * @author kjlee
 *
 */
public class HelloWorld implements Servlet {

    ServletConfig config;
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init");
        this.config = config;
    }
    
    @Override
    public void destroy() {
        System.out.println("destroy");
    }
    
    @Override
    public void service(ServletRequest arg0, ServletResponse arg1)
            throws ServletException, IOException {
        System.out.println("service");
        
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("getServletConfig");
        return this.config;
    }

    @Override
    public String getServletInfo() {
        System.out.println("getServletInfo");
        return "HelloWorld Servlet";
    }

}
