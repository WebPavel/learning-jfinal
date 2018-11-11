package com.ava.interceptor;

import javax.servlet.http.HttpServletRequest;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;
import com.jfinal.core.Controller;

public class FrontRouteInterceptor implements Interceptor {

	public void intercept(Invocation invocation) {
		// TODO Auto-generated method stub
		Controller controller = invocation.getController();
		HttpServletRequest request = controller.getRequest();
		String url = request.getRequestURL().toString();
		String host = request.getRemoteHost();
		String ip = request.getRemoteAddr();
		System.out.println(url);
		System.out.println(host+"\t"+ip);
		invocation.invoke();	
	}

}
