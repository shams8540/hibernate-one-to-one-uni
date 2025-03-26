package com.jsp.hibernate_one_to_one_unidirection.controller;

import java.time.LocalDate;

import com.jsp.hibernate_one_to_one_unidirection.dao.VoterDao;
import com.jsp.hibernate_one_to_one_unidirection.entity.Voter;

public class InsertVoterController {
	public static void main(String[] args) {
		VoterDao dao = new VoterDao();
		
		Voter voter = new Voter(992211,"noida sector 2",21,LocalDate.parse("2003-09-13"),"kishan-kumar",LocalDate.parse("1947-09-09"),"Male");
    	
		
		dao.saveVoterDao(voter);
	}
}
