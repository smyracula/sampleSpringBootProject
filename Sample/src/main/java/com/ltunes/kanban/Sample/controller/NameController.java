package com.ltunes.kanban.Sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ltunes.kanban.Sample.service.NameService;

@RestController
@RequestMapping("/api/Name")
public class NameController {

	@Autowired
	NameService nameService;
	
	public NameController(NameService nameService) {
		this.nameService = nameService;
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public String getName() {
		return nameService.getName();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public Boolean setName(String name) {
		return nameService.setName(name);
	}
}
