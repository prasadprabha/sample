package com.migration.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.migration.spring.model.DataTableObject;
import com.migration.spring.model.Person;
import com.migration.spring.service.PersonService;

@Controller
public class DataTableController {

	
	@Autowired
	private PersonService personService;
	
	@RequestMapping(value = "/listPersons", method = RequestMethod.GET)
	public @ResponseBody DataTableObject listPersons(Model model) {
		model.addAttribute("person", new Person());
		model.addAttribute("listPersons", this.personService.listPersons());
		//response.setContentType('application/json');
		 // PrintWriter out = response.getWriter();
		 // List<Student> lisOfStudent = StudentDataService.getStudentList();
		  
		  DataTableObject dataTableObject = new DataTableObject();
		  dataTableObject.setAaData(this.personService.listPersons());
		  
		  Gson gson = new GsonBuilder().setPrettyPrinting().create();
		  String json = gson.toJson(dataTableObject);
		//  out.print(json);
		
		return dataTableObject;
	}
}
