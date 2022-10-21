package com.spring.core.service;

import java.util.ArrayList;
import java.util.List;

import com.spring.core.entity.Learner;

public class LearnerService {

	List<Learner> LearnerList=new ArrayList<>();

	public List<Learner> getLearnerList() {
		Learner l1=new Learner(1, "Ankita");
		Learner l2=new Learner(2, "Shreya");
		Learner l3=new Learner(3, "Apoorva");
		Learner l4=new Learner(4, "Pallavi");
		LearnerList.add(l1);
		LearnerList.add(l2);
		LearnerList.add(l3);
		LearnerList.add(l4);
		return LearnerList;
	}
}
