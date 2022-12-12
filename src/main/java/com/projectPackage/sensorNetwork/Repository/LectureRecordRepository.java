package com.projectPackage.sensorNetwork.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectPackage.sensorNetwork.Entity.LectureRecord;

public interface LectureRecordRepository extends JpaRepository<LectureRecord, Long>{

}
