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
	 
	 public Topic getInfo(String id) {
		 return (Topic) topiclist.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	 }
	 
	 public void addTopic(Topic topic) {
		topiclist.add(topic);
	 }
	 
	 public void delTopic(String id) {
			topiclist.removeIf(t -> t.getId().equals(id));
		 }

	public boolean updateTopic(Topic topic, String id) {
		for(int iter = 0; iter < topiclist.size(); iter++) {
			Topic t = topiclist.get(iter);
			if(t.getId().equals(id)) {
				topiclist.set(iter, topic);
				return true;
			}
			
		}
		return false;
	}
	
}