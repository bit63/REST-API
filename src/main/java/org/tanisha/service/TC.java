/*package org.tanisha.service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TC {
	
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

*/