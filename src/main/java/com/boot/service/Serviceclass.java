package com.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.entity.Userdata;
import com.boot.repo.UserRepo;


@Service
public class Serviceclass {
    
	@Autowired
	private UserRepo user_repo;
	
	
	public List<Userdata> getAllData(){
		return (List<Userdata>) user_repo.findAll();
	}
	
	
	public Userdata update(Userdata data) {
		    System.out.println("data added");
		return user_repo.save(data);
	}
	
}
