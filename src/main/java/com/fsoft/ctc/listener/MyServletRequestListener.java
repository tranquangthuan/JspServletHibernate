//package com.fsoft.ctc.listener;
//
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletRequestEvent;
//import javax.servlet.ServletRequestListener;
//import javax.servlet.annotation.WebListener;
//
//@WebListener
//public class MyServletRequestListener implements ServletRequestListener {
//
//	@Override
//	public void requestDestroyed(ServletRequestEvent sre) {
//		ServletRequest servletRequest = sre.getServletRequest();
//		System.out.println(
//				"MyServletRequestListener ServletRequest destroyed. Remote IP=" + servletRequest.getRemoteAddr());
//	}
//
//	@Override
//	public void requestInitialized(ServletRequestEvent sre) {
//		ServletRequest servletRequest = sre.getServletRequest();
//		System.out.println(
//				"MyServletRequestListener ServletRequest initialized. Remote IP=" + servletRequest.getRemoteAddr());
//
//	}
//
//}
