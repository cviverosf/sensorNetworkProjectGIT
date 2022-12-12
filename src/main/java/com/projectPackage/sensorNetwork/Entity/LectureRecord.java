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
@Entity
public class LectureRecord {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLectura;
	
	@OneToMany(targetEntity = LectureDetail.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "idLecturaFK", referencedColumnName = "idLectura")
	private List<LectureDetail> lectureDetail;
	
	private Date beginLectureDate;
	private Date lastLectureDate;
	
	public Long getIdLectura() {
		return idLectura;
	}
	public void setIdLectura(Long idLectura) {
		this.idLectura = idLectura;
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
}
