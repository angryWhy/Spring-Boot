package mainProject.MyServlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.logging.LogRecord;
@Slf4j
@WebFilter(urlPatterns = {"/css/*","/images/*"})
public class MyFIlter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("filter-init");
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest,servletResponse);
        HttpServletRequest httpServletRequest = (HttpServletRequest)servletRequest;
        System.out.println(httpServletRequest.getRequestURL());
        log.info("filter-dpFilter");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
