package com.boot.dataController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.entity.Userdata;
import com.boot.service.Serviceclass;

//import model.Userdata;

import java.util.List;

@RestController
@RequestMapping("/register")
@CrossOrigin
public class TestController {
    
	@Autowired
	private Serviceclass sc;
	
	@RequestMapping("/test")
    @ResponseBody	
	public String first() {
		return "hey finally ittt star";
	}
	
	@RequestMapping("/")	
	public String home() {
		return "home";
	}
	

//	@RequestMapping("/register")
//	public String register() {
//		 return "register";
//	}
//	
	
		//	@RequestMapping(value="/submit",method=RequestMethod.GET)
		////	@RequestMapping("/register")
		//	public String register(@RequestBody Userdata data) {
		//		String s= sc.update(data);
		//		return s;
		//	}
	
//		@PostMapping(path="/submitpage")
//		@ResponseBody
//		public String submit(@ModelAttribute("submitdata") Userdata submitdata) {
//			this.sc.update(submitdata);
//			System.out.println(submitdata);
//			return "new data added";
//		}
		

		@PostMapping(path="/submitpage")
		@ResponseBody
		public String submit(@RequestBody Userdata submitdata) {
			sc.update(submitdata);
			System.out.println(submitdata);
			return "new data added";
		}
	
		@GetMapping("/getAll")
		@ResponseBody
		public List<Userdata> get() {
		   return sc.getAllData();
		}
	
	
	
	
}
