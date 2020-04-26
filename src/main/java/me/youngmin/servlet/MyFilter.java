package me.youngmin.servlet;

import javax.servlet.*;
import java.io.IOException;

// filter나 listener를 사용하기 위해서는 web.xml에 listener와 filter / filter-mapping 설정을 해줘야한다.
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter Init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter");
        filterChain.doFilter(servletRequest, servletResponse); // 반드시 이걸로 체이닝을 해줘야함. 즉, 다음필터로 연결하거나 마지막 필터라면 servlet으로 연결함.
    }

    @Override
    public void destroy() {
        System.out.println("Filter Destroy");
    }
}
