package com.ava.controller;

import com.ava.model.Blog;
import com.jfinal.core.Controller;

public class IndexController extends Controller {
	public void index() {
		String msg = getPara("msg","defaultMsg");
		String[] choices = getParaValues("choice");//接受checkbox类型的值
		setAttr("msg", "Hello JFinal "+msg + choices);
		renderTemplate("index.html");
	}
	public void add() {
		renderTemplate("add.html");
	}
	public void doAdd() {
		Blog blog = getModel(Blog.class);
		System.out.println(blog);
		blog.save();
//		forwardAction("/index");//服务器端跳转
//		redirect("/index");//浏览器重定向
		renderText("提交成功");
	}
	
	public void sqlManager() {
		String sql = Blog.dao.getSql("blogList");
		renderJson(Blog.dao.find(sql));
	}
}
