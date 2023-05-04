package com.lic.epgs.common.service;

import com.lic.epgs.common.entity.StatusCommon;
import com.lic.epgs.common.repository.StatusCommonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StatusCommonService {

    @Autowired
    private StatusCommonRepository statusCommonRepository;

    // Get all common statuses
    public List<StatusCommon> findAllByOrderByIdAsc(){
        return statusCommonRepository.findAllByOrderByIdAsc();
    }

    // Get a common status by its id
    public Optional<StatusCommon> findById(Long id){
        return statusCommonRepository.findById(id);
    }

    // Get a list of common statuses by code
    public List<StatusCommon> findByCodeOrderByIdAsc(String code){
        return statusCommonRepository.findByCodeOrderByIdAsc(code);
    }

    // Get a list of common statuses by type
    public List<StatusCommon> findByTypeOrderByIdAsc(String type){
        return statusCommonRepository.findByTypeOrderByIdAsc(type);
    }

    // Get a list of active common statuses
    public List<StatusCommon> findByIsActiveTrueOrderByIdAsc(){
        return statusCommonRepository.findByIsActiveTrueOrderByIdAsc();
    }

    // Get a list of inactive common statuses
    public List<StatusCommon> findByIsActiveFalseOrderByIdAsc(){
        return statusCommonRepository.findByIsActiveFalseOrderByIdAsc();
    }
}