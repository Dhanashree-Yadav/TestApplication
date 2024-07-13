package com.springboot.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.practice.model.Provider;
import com.springboot.practice.response.ProviderResponse;
import com.springboot.practice.service.ProviderService;

@RestController
@RequestMapping("provider")
public class ProviderController {

	@Autowired
	ProviderService pService;

	 @GetMapping("/search")
	    public List<ProviderResponse> searchProviders(
	            @RequestParam String sid,
	            @RequestParam String keyword) {
	        return pService.searchProviders(sid, keyword);
	    }
}
