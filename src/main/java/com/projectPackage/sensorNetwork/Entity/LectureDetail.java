package com.projectPackage.sensorNetwork.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="LectureDetail")
public class LectureDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTrama;
	
	private Long dataInformation;

	public Long getIdTrama() {
		return idTrama;
	}
	public void setIdTrama(Long idTrama) {
		this.idTrama = idTrama;
	}
	public Long getDataInformation() {
		return dataInformation;
	}
	public void setDataInformation(Long dataInformation) {
		this.dataInformation = dataInformation;
	}
}
