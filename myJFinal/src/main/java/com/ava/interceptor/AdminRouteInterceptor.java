package com.ava.interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

public class AdminRouteInterceptor implements Interceptor {

	public void intercept(Invocation inv) {
		// TODO Auto-generated method stub
		System.out.println(inv.getController().getRequest().getRemoteAddr());
		inv.invoke();
	}

}
