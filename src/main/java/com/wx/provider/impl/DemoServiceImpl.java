package com.wx.provider.impl;

import com.wx.provider.DemoService;

public class DemoServiceImpl implements DemoService{

	@Override
	public String getStr(String first, String second) {
		return first+" ___" +second+"___";
	}
}
