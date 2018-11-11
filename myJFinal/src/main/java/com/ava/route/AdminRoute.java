package com.ava.route;

import com.ava.controller.AdminController;
import com.ava.interceptor.AdminRouteInterceptor;
import com.jfinal.config.Routes;

public class AdminRoute extends Routes {

	@Override
	public void config() {
		// TODO Auto-generated method stub
		setBaseViewPath("/WEB-INF");
		addInterceptor(new AdminRouteInterceptor());
		add("/admin",AdminController.class);
	}

}
