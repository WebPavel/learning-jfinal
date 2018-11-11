package com.ava.common;

import com.ava.model.Blog;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

public class _MappingKit {

	public static void mapping(ActiveRecordPlugin activeRecordPlugin) {
		// TODO Auto-generated method stub
		activeRecordPlugin.addMapping("t_blog", Blog.class);
	}

}
