package com.ava.controller;

import com.jfinal.core.Controller;
import com.jfinal.upload.UploadFile;

public class FileUploadController extends Controller {
	public void save() {
		UploadFile file = getFile();
		System.out.println(file.getFileName());
		renderText(file.getOriginalFileName());
	}
}
