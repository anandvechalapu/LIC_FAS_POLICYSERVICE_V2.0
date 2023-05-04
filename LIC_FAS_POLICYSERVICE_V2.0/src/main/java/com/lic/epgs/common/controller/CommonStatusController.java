package com.lic.epgs.common.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.model.CommonStatus;
import com.lic.epgs.common.service.CommonStatusService;

@RestController
@RequestMapping("/common-status")
public class CommonStatusController {

	@Autowired
	CommonStatusService commonStatusService;
	
	// Method to get list of all common statuses
	@GetMapping("/all")
	public List<CommonStatus> getAllCommonStatuses(){
		return commonStatusService.findAll();
	}
	
	// Method to get common status by id
	@GetMapping("/{id}")
	public Optional<CommonStatus> getCommonStatusById(@PathVariable Long id){
		return commonStatusService.findById(id);
	}
	
	// Method to get common status by code
	@GetMapping("/code/{code}")
	public Optional<CommonStatus> getCommonStatusByCode(@PathVariable String code){
		return commonStatusService.findByCode(code);
	}
	
	// Method to get common status by type
	@GetMapping("/type/{type}")
	public List<CommonStatus> getCommonStatusByType(@PathVariable String type){
		return commonStatusService.findByType(type);
	}
	
	// Method to get common status by description
	@GetMapping("/description/{description}")
	public List<CommonStatus> getCommonStatusByDescription(@PathVariable String description){
		return commonStatusService.findByDescription(description);
	}
	
	// Method to get common status by description1
	@GetMapping("/description1/{description1}")
	public List<CommonStatus> getCommonStatusByDescription1(@PathVariable String description1){
		return commonStatusService.findByDescription1(description1);
	}
	
	// Method to get common status by name
	@GetMapping("/name/{name}")
	public Optional<CommonStatus> getCommonStatusByName(@PathVariable String name){
		return commonStatusService.findByName(name);
	}
	
	// Method to get common status by isActive
	@GetMapping("/isActive/{isActive}")
	public List<CommonStatus> getCommonStatusByIsActive(@PathVariable Boolean isActive){
		return commonStatusService.findByIsActive(isActive);
	}
	
}