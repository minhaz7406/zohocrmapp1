package com.zohocrmapp1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrmapp1.entities.Lead;
import com.zohocrmapp1.repository.LeadRepository;
@Service
public class LeadServiceImpl implements LeadService {
   @Autowired
   private LeadRepository leadRepo;
	@Override
	public void saveOneLead(Lead lead) {
	leadRepo.save(lead);
		
	}

}
