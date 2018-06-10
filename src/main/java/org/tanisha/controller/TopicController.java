package org.tanisha.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	private TopicService topicservice= new TopicService();

	@RequestMapping("/topicsinfo")
	public List<Topic> getAll(){
		return topicservice.getAllTopics();
	}

	@RequestMapping("/topic/{id}")
	public Topic getIdInfo(@PathVariable String id) {
		return topicservice.getInfo(id);
	}

	@RequestMapping(method=RequestMethod.POST, value="/topicsinfo")
	public String addTopic(@RequestBody Topic topic) {
		topicservice.addTopic(topic);
		String response = "{\"success\": true, \"message\": Topic has been added successfully.}";
		return response;
	}

	@RequestMapping(method=RequestMethod.DELETE, value="/delete/{id}")
	public String addTopic(@PathVariable String id) {
		topicservice.delTopic(id);
		String response = "{\"success\": true, \"message\": Topic has been deleted successfully.}";
		return response;
	}

	@RequestMapping(method=RequestMethod.PUT, value="update/{id}")
	public String updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		String response;
		if(topicservice.updateTopic(topic, id))
			return  response = "{\"success\": true, \"message\": Topic has been updated successfully.}";
		else
			return response = "{\"success\": false, \"message\": Not found.}";	
		//return response;
	}
}
