package com.lic.epgs.common.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.common.model.CommonStatus;
import com.lic.epgs.common.service.CommonStatusService;

@RestController
@RequestMapping("/commonStatus")
public class CommonStatusController {

	@Autowired
	private CommonStatusService commonStatusService;
	
	@GetMapping("/{type}")
	public List<CommonStatus> findByType(@PathVariable String type) {
		return commonStatusService.findByType(type);
	}
	
	@GetMapping("/active")
	public List<CommonStatus> findActiveCommonStatuses() {
		return commonStatusService.findActiveCommonStatuses();
	}
	
	@GetMapping("/{id}")
	public CommonStatus findById(@PathVariable Long id) {
		return commonStatusService.findById(id);
	}

}