package com.lic.epgs.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.common.model.CommonStatus;
import com.lic.epgs.common.repository.CommonStatusRepository;

@Service
public class CommonStatusService {

	@Autowired
	private CommonStatusRepository commonStatusRepository;

	public List<CommonStatus> findByType(String type) {
		return commonStatusRepository.findByType(type);
	}
	
	public List<CommonStatus> findActiveCommonStatuses() {
		return commonStatusRepository.findActiveCommonStatuses();
	}
	
	public CommonStatus findById(Long id) {
		return commonStatusRepository.findById(id);
	}

}