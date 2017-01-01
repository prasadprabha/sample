package com.migration.spring.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.migration.spring.service.PersonService;

@Controller
public class HomePageController {
	
	//private MigrationReportService migrationReportService;
	@Autowired
	private PersonService personService;
	
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		return "home";
	}
	
	
	@ModelAttribute("circuitTypes")
	public Map<String,String> getCircuitTypes() {
		Map<String,String> circuitTypes = new HashMap<String,String>();
		circuitTypes.put("UNI CFS", "uniCFS");
		circuitTypes.put("NLAN Circuit", "nlanCircuit");
		return circuitTypes;
	}
		
	@ModelAttribute("rsiDataSources")
	public Map<String,String> getRSIDataSources() {
		Map<String,String> rsiDataSources = new HashMap<String,String>();
		rsiDataSources.put("ERDBPC", "erdbpc");
		return rsiDataSources;
	}
	
	@ModelAttribute("asriDataSources")
	public Map<String,String> getASRIDataSources() {
		Map<String,String> asriDataSources = new HashMap<String,String>();
		asriDataSources.put("MIG05", "mig05");
		asriDataSources.put("MIG06", "mig06");
		return asriDataSources;
	}
	
	
	/*public MigrationReportService getMigrationReportService() {
		return migrationReportService;
	}

	@Autowired(required=true)
	@Qualifier(value="migrationReportService")
	public void setMigrationReportService(
			MigrationReportService migrationReportService) {
		this.migrationReportService = migrationReportService;
	}*/
	

}
