package com.movan.controller;

import com.movan.modal.Campaign;
import com.movan.repository.CampaignRepository;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author annguyen
 */

@RestController
@RequestMapping("/api/v1")
public class CampaignController {

    @Autowired
    CampaignRepository campaign;

    @GetMapping(value ="/")
    public List<Campaign> index(){

        return campaign.getAll();
    }

    @GetMapping(value ="/campaign/{id}")
    public Campaign getCampaignId(@PathVariable("id") String id){
        return campaign.getById(id);
    }
}
