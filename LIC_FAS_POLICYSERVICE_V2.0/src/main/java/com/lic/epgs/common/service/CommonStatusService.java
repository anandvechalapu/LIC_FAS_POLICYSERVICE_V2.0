package com.lic.epgs.common.service;

import com.lic.epgs.common.model.CommonStatus;
import com.lic.epgs.common.repository.CommonStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonStatusService {

    @Autowired
    private CommonStatusRepository commonStatusRepository;

    //Return a list of all common statuses
    public List<CommonStatus> findAll() {
        return commonStatusRepository.findAll();
    }

    //Return a list of common statuses with a specific type
    public List<CommonStatus> findByType(String type) {
        return commonStatusRepository.findByType(type);
    }

    //Return a list of active common statuses
    public List<CommonStatus> findByIsActive(boolean isActive) {
        return commonStatusRepository.findByIsActive(isActive);
    }

    //Return a common status with a specific id
    public CommonStatus findById(Long id) {
        return commonStatusRepository.findById(id);
    }

    //Return a common status with a specific code
    public CommonStatus findByCode(String code) {
        return commonStatusRepository.findByCode(code);
    }
}