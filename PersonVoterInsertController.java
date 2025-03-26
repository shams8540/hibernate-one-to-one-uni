package com.jsp.hibernate_one_to_one_unidirection.controller;

import java.time.LocalDate;

import com.jsp.hibernate_one_to_one_unidirection.dao.PersonVoterDao;
import com.jsp.hibernate_one_to_one_unidirection.entity.Person;
import com.jsp.hibernate_one_to_one_unidirection.entity.Voter;

public class PersonVoterInsertController {
	public static void main(String[] args) {
		
		PersonVoterDao dao=new PersonVoterDao();
		
		Voter voter=new Voter(9999, "saim", 22, LocalDate.parse("2002-08-13"), "saiyad",LocalDate.parse("1997-08-11"), "male");
		Person person=new Person(999, "saim", "saim@gmial.com",853890, voter);
		
		dao.savePersonVoterDao(voter, person);
		
		
		//cascading  
		//it is same for cascade
		
	}
}
