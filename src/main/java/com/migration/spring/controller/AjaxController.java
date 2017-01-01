package com.migration.spring.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {

	@RequestMapping(value = "/conditions", method = RequestMethod.GET)
	public @ResponseBody Map<String,String> conditions(Model model,@RequestParam String circuitType) {
		System.out.println(circuitType);
		Map<String,String> conditions = new HashMap<String,String>();
		if("uniCFS".equals(circuitType)) {
			conditions.put("Disconnected???", "removeDisconnect");
			conditions.put("Remove all Pending", "portCircuitRelated");
		} else if ("nlanCircuit".equals(circuitType)) {
			conditions.put("Avoid Disconnected", "removeDisconnect");
			conditions.put("Select if it is associated with Port Circuit", "portCircuitRelated");
		}
		
		return conditions;
	}
	
	
}
