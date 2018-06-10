package org.tanisha.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tanisha.service.Topic;
import org.tanisha.service.TopicService;


@RestController
public class TopicController {
	
	@RequestMapping("/home")
	public String homepage() {
		return "Welcome";
	}
	
	@Autowired
	private TopicService topicservice;// = new TopicService();
	
	@RequestMapping("/topicsinfo")
	public List<Topic> getAll(){
		return topicservice.getAllTopics();
	}

}
