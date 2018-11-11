package com.ava.controller;

import com.jfinal.core.Controller;

public class AdminController extends Controller {
	public void index() {
		setAttr("msg", "欢迎来到后台管理页面");
		renderTemplate("index.html");
	}
}
