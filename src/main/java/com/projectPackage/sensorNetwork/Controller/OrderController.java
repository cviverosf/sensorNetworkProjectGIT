package com.projectPackage.sensorNetwork.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectPackage.sensorNetwork.Repository.LectureDetailRepository;
import com.projectPackage.sensorNetwork.Repository.LectureRecordRepository;
import com.projectPackage.sensorNetwork.Repository.SensorNodeRepository;

@RestController
public class OrderController {
	@Autowired
	private LectureDetailRepository lectureDetailRepository;
	@Autowired
	private LectureRecordRepository lectureRecordRepository;
	@Autowired
	private SensorNodeRepository sensorNodeRepository;
	
	
}
