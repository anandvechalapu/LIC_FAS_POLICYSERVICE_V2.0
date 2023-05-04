package com.lic.epgs.common.controller;

import com.lic.epgs.common.model.CommonStatus;
import com.lic.epgs.common.service.CommonStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/commonStatus")
public class CommonStatusController {

    @Autowired
    private CommonStatusService commonStatusService;

    @GetMapping
    public List<CommonStatus> findAll() {
        return commonStatusService.findAll();
    }

    @GetMapping("/type/{type}")
    public List<CommonStatus> findByType(@PathVariable String type) {
        return commonStatusService.findByType(type);
    }

    @GetMapping("/active/{isActive}")
    public List<CommonStatus> findByIsActive(@PathVariable boolean isActive) {
        return commonStatusService.findByIsActive(isActive);
    }

    @GetMapping("/id/{id}")
    public CommonStatus findById(@PathVariable Long id) {
        return commonStatusService.findById(id);
    }

    @GetMapping("/code/{code}")
    public CommonStatus findByCode(@PathVariable String code) {
        return commonStatusService.findByCode(code);
    }

}