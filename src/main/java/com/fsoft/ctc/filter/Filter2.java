package com.fsoft.ctc.filter;
//package com.vn.fsoft.ctc.filter;
//
//import java.io.IOException;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;
//
//@WebFilter(value = "/*", filterName = "Filter2")
//public class Filter2 implements Filter {
//
//	@Override
//	public void init(FilterConfig filterConfig) throws ServletException {
//	}
//
//	@Override
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//			throws IOException, ServletException {
//		System.out.println("Filter2");
//		chain.doFilter(request, response);
//	}
//
//	@Override
//	public void destroy() {
//	}
//
//}