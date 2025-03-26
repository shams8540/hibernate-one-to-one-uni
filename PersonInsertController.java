package com.jsp.hibernate_one_to_one_unidirection.controller;

import com.jsp.hibernate_one_to_one_unidirection.dao.PersonVoterDao;
import com.jsp.hibernate_one_to_one_unidirection.entity.Person;
import com.jsp.hibernate_one_to_one_unidirection.entity.Voter;

public class PersonInsertController {
	public static void main(String[] args) {
         PersonVoterDao dao=new PersonVoterDao();
         Person person=new Person(12233, "anil", "anil@gmia.com", 45678910, null);
         dao.savePersonDao(person, 11000);
	}
}
