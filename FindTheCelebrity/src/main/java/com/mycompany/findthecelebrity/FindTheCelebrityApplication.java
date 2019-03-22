package com.mycompany.findthecelebrity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mycompany.findthecelebrity.business.MatrixService;
import com.mycompany.findthecelebrity.model.Party;

@SpringBootApplication
public class FindTheCelebrityApplication implements CommandLineRunner {
	
	private static final Logger log = LoggerFactory.getLogger(FindTheCelebrityApplication.class);
	
	@Autowired
	private MatrixService matrixService;
	
	public static void main(String[] args) {
		SpringApplication.run(FindTheCelebrityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			
		final int case1[][] = { 
				{ 0, 0, 1, 0 }, 
                { 0, 0, 1, 0 }, 
                { 0, 0, 0, 0 },  
                { 0, 0, 1, 0 } 
        }; 		
		Party party1 = matrixService.insert(case1);	
		int id = matrixService.solveCelebrityProblem(party1);		
		log.info("Party id="+party1.getId()+" Celebrity id="+id);
		
	}

}
