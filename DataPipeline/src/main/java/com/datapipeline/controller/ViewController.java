package com.datapipeline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class ViewController {
	
	@GetMapping("/townhall")
	public String index() {
		return "app/component/listtownhall";
	}
	
	@GetMapping("/unit")
	public String unit() {
		return "app/component/listUnit";
	}
	
	@GetMapping("/history")
	public String history() {
		return "app/component/history";
	}
	
	@GetMapping("/unittownhall")
	public String unittownhall() {
		return "app/component/unittownhall";
	}

}
