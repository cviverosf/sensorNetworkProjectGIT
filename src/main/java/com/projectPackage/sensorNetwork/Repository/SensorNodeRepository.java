package com.projectPackage.sensorNetwork.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectPackage.sensorNetwork.Entity.SensorNode;

public interface SensorNodeRepository extends JpaRepository<SensorNode, Long>{

}
