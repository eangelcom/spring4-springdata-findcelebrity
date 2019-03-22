package com.mycompany.findthecelebrity.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.findthecelebrity.model.Party;

public interface PartyRepository extends JpaRepository<Party, Long>  {

}
