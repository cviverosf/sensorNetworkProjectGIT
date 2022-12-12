package com.projectPackage.sensorNetwork.Entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="SensorNode")
public class SensorNode {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idSensor;
	
	@OneToMany(targetEntity = LectureRecord.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "idSensorFK", referencedColumnName = "idSensor")
	private List<LectureRecord> lectureRecord;
	
	private String nameSensor;
	private String locateSensor;
	private Date beginLectureDate;
	private Date lastLectureDate;
	private Long masterSensor;
	private Boolean active;
	
	public Long getIdSensor() {
		return idSensor;
	}
	public void setIdSensor(Long idSensor) {
		this.idSensor = idSensor;
	}
	public String getNameSensor() {
		return nameSensor;
	}
	public void setNameSensor(String nameSensor) {
		this.nameSensor = nameSensor;
	}
	public String getLocateSensor() {
		return locateSensor;
	}
	public void setLocateSensor(String locateSensor) {
		this.locateSensor = locateSensor;
	}
	public Date getBeginLectureDate() {
		return beginLectureDate;
	}
	public void setBeginLectureDate(Date beginLectureDate) {
		this.beginLectureDate = beginLectureDate;
	}
	public Date getLastLectureDate() {
		return lastLectureDate;
	}
	public void setLastLectureDate(Date lastLectureDate) {
		this.lastLectureDate = lastLectureDate;
	}
	public Long getMasterSensor() {
		return masterSensor;
	}
	public void setMasterSensor(Long masterSensor) {
		this.masterSensor = masterSensor;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
}
