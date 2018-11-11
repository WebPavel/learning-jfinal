package com.ava.route;

import com.ava.controller.FileUploadController;
import com.ava.controller.IndexController;
import com.ava.interceptor.FrontRouteInterceptor;
import com.jfinal.config.Routes;

public class FrontRoute extends Routes {

	@Override
	public void config() {
		// TODO Auto-generated method stub
		setBaseViewPath("/front");
		addInterceptor(new FrontRouteInterceptor());
		add("/",IndexController.class);
		add("/file/upload",FileUploadController.class);
	}

}
