package com.mycompany.findthecelebrity.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.findthecelebrity.dao.PartyRepository;
import com.mycompany.findthecelebrity.model.Party;

@Service
public class PartyService {
	
	@Autowired
	private PartyRepository partyRepository;
	
	public Party insert(Party party) {
		return partyRepository.save(party);
	}	
}
