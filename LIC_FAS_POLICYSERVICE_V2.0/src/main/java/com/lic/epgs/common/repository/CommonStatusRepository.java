package com.lic.epgs.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.common.model.CommonStatus;

@Repository
public interface CommonStatusRepository extends JpaRepository<CommonStatus, Long> {
	
	/**
	 * This method returns a list of CommonStatus objects for the given type
	 * 
	 * @param type The type of the CommonStatus
	 * @return A list of CommonStatus objects
	 */
	@Query("SELECT cs FROM CommonStatus cs WHERE cs.type = ?1")
	public List<CommonStatus> findByType(String type);
	
	/**
	 * This method returns a list of CommonStatus objects that are active
	 * 
	 * @return A list of CommonStatus objects
	 */
	@Query("SELECT cs FROM CommonStatus cs WHERE cs.isActive = true")
	public List<CommonStatus> findActiveCommonStatuses();
	
	/**
	 * This method returns a CommonStatus object for the given id
	 * 
	 * @param id The id of the CommonStatus
	 * @return The CommonStatus object
	 */
	public CommonStatus findById(Long id);

}