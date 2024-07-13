package com.springboot.practice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.practice.model.Pqueue;
import com.springboot.practice.model.Provider;
import com.springboot.practice.repository.PqueueRepo;
import com.springboot.practice.repository.ProviderRepo;
import com.springboot.practice.response.ProviderResponse;

@Service
public class ProviderService {

	@Autowired
	ProviderRepo pRepo;

	@Autowired
	PqueueRepo pqRepo;

	public List<ProviderResponse> searchProviders(String sid, String keyword) {

		Pqueue pQueue = pqRepo.findBySid(sid);

		List<Provider> providers;
        if (pQueue == null || pQueue.getPid() == null) {
            // Return all providers where isBlocked is false
            providers = pRepo.findAll().stream()
                    .filter(provider -> !provider.isIsblock())
                    .collect(Collectors.toList());
        }
		else {

		String assignedProvider = pQueue.getPid();

		 providers = pRepo.findAll().stream()
                 .filter(provider -> !provider.getId().equals(assignedProvider))
                 .collect(Collectors.toList());
		}
        
		
		if (keyword != null && !keyword.isEmpty()) {
			String lowerCaseKeyword = keyword.toLowerCase();
			providers = providers.stream()
					.filter(provider -> provider.getFname().toLowerCase().contains(lowerCaseKeyword)
							|| provider.getLname().toLowerCase().contains(lowerCaseKeyword)
							|| provider.getCity().toLowerCase().contains(lowerCaseKeyword)
							|| provider.getPhone().toLowerCase().contains(lowerCaseKeyword))

					.collect(Collectors.toList());
		}
		List<ProviderResponse> responseList = providers.stream().map(provider -> new ProviderResponse(provider.getId(),
				provider.getFname(), provider.getLname(), provider.getCity(), provider.getPhone()
		// Add more fields as needed
		)).collect(Collectors.toList());

		return responseList;
	}

}
