package com.khadri.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//GET ../order/tiffen/11/100/idly 

@Controller
@RequestMapping(value = { "/order/tiffen", "/order/breakfast" , "/order/swalpaharam"  }) // Shared URL for all handler mappers in the same class
public class OrderController {

	@RequestMapping(value = "/idly")
	@ResponseBody
	public String tiffen() {
		return "IDLY";
	}
}
