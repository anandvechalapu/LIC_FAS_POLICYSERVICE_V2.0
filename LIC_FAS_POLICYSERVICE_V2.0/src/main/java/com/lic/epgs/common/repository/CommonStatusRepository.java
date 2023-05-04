package com.lic.epgs.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.model.CommonStatus;

@Repository
public interface CommonStatusRepository extends JpaRepository<CommonStatus, Long> {
	
	// Method to find list of common statuses
	public List<CommonStatus> findAll();
	
	// Method to find common status by id
	public Optional<CommonStatus> findById(Long id);
	
	// Method to find common status by code
	public Optional<CommonStatus> findByCode(String code);
	
	// Method to find common status by type
	public List<CommonStatus> findByType(String type);
	
	// Method to find common status by description
	public List<CommonStatus> findByDescription(String description);
	
	// Method to find common status by description1
	public List<CommonStatus> findByDescription1(String description1);
	
	// Method to find common status by name
	public Optional<CommonStatus> findByName(String name);
	
	// Method to find common status by isActive
	public List<CommonStatus> findByIsActive(Boolean isActive);
	
}