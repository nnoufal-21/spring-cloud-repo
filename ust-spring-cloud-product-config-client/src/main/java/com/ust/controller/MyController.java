package com.ust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.model.ConfigProps;

@RestController
public class MyController {

	@Autowired
	ConfigProps configProps;
	
	
	@RequestMapping("/ust/projectDetails")
	public String projectDetails()
	{
		return "ProjectId: "+configProps.getProjectId()+"<br>ProjectName: "+configProps.getProjectName()+"<br>ProjectLocation: "+configProps.getProjectLocation()+"<br>ProjectCost: "+configProps.getProjectCost()+"<br>ProjectStatus: "+configProps.getProjectStatus(); 
	}
	
}
