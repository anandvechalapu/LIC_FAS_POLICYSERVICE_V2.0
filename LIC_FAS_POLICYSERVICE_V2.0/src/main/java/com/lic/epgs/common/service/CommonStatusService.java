package com.lic.epgs.common.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.model.CommonStatus;
import com.lic.epgs.common.repository.CommonStatusRepository;

@Service
public class CommonStatusService {

	@Autowired
	CommonStatusRepository commonStatusRepo;
	
	// Method to find list of common statuses
	public List<CommonStatus> findAll(){
		return commonStatusRepo.findAll();
	}
	
	// Method to find common status by id
	public Optional<CommonStatus> findById(Long id){
		return commonStatusRepo.findById(id);
	}
	
	// Method to find common status by code
	public Optional<CommonStatus> findByCode(String code){
		return commonStatusRepo.findByCode(code);
	}
	
	// Method to find common status by type
	public List<CommonStatus> findByType(String type){
		return commonStatusRepo.findByType(type);
	}
	
	// Method to find common status by description
	public List<CommonStatus> findByDescription(String description){
		return commonStatusRepo.findByDescription(description);
	}
	
	// Method to find common status by description1
	public List<CommonStatus> findByDescription1(String description1){
		return commonStatusRepo.findByDescription1(description1);
	}
	
	// Method to find common status by name
	public Optional<CommonStatus> findByName(String name){
		return commonStatusRepo.findByName(name);
	}
	
	// Method to find common status by isActive
	public List<CommonStatus> findByIsActive(Boolean isActive){
		return commonStatusRepo.findByIsActive(isActive);
	}
	
}