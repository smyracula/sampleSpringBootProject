package com.ltunes.kanban.Sample.service;

import org.springframework.stereotype.Service;

@Service
public class NameServiceImp implements NameService {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "KORCAN";
	}

	@Override
	public Boolean setName(String name) {
		// TODO Auto-generated method stub
		return true;
	}

}
