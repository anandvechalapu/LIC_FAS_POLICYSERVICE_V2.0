package com.lic.epgs.common.model;

import javax.persistence.*;

@Entity
@Table(name = "common_status")
public class CommonStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "status_code")
	private String statusCode;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "is_active")
	private boolean isActive;
	
	public CommonStatus() {
		
	}
	
	public CommonStatus(String type, String statusCode, String status, boolean isActive) {
		this.type = type;
		this.statusCode = statusCode;
		this.status = status;
		this.isActive = isActive;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getStatusCode() {
		return statusCode;
	}
	
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public boolean isActive() {
		return isActive;
	}
	
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
}