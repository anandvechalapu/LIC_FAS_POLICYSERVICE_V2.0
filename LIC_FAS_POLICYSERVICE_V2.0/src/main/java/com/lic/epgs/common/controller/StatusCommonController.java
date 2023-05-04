package com.lic.epgs.common.controller;

import com.lic.epgs.common.entity.StatusCommon;
import com.lic.epgs.common.service.StatusCommonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/status-common")
public class StatusCommonController {

    @Autowired
    private StatusCommonService statusCommonService;

    // Get all common statuses
    @GetMapping("/all")
    public List<StatusCommon> findAllByOrderByIdAsc(){
        return statusCommonService.findAllByOrderByIdAsc();
    }

    // Get a common status by its id
    @GetMapping("/id")
    public Optional<StatusCommon> findById(@RequestParam(value="id") Long id){
        return statusCommonService.findById(id);
    }

    // Get a list of common statuses by code
    @GetMapping("/code")
    public List<StatusCommon> findByCodeOrderByIdAsc(@RequestParam(value="code") String code){
        return statusCommonService.findByCodeOrderByIdAsc(code);
    }

    // Get a list of common statuses by type
    @GetMapping("/type")
    public List<StatusCommon> findByTypeOrderByIdAsc(@RequestParam(value="type") String type){
        return statusCommonService.findByTypeOrderByIdAsc(type);
    }

    // Get a list of active common statuses
    @GetMapping("/active")
    public List<StatusCommon> findByIsActiveTrueOrderByIdAsc(){
        return statusCommonService.findByIsActiveTrueOrderByIdAsc();
    }

    // Get a list of inactive common statuses
    @GetMapping("/inactive")
    public List<StatusCommon> findByIsActiveFalseOrderByIdAsc(){
        return statusCommonService.findByIsActiveFalseOrderByIdAsc();
    }
}