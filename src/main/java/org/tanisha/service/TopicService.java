package org.tanisha.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
		
	 public List<Topic> topiclist= new ArrayList<Topic>(Arrays.asList(
						new Topic("spring", "Spring Framework", "Spring framework description."),
						new Topic("java", "Core Java", "Core Java description.")));			
	 
	 public List<Topic> getAllTopics(){
		 return topiclist;
	 }
	 
	 
	 

	
}
