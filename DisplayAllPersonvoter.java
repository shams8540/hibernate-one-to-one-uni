package com.jsp.hibernate_one_to_one_unidirection.controller;

import java.util.List;

import com.jsp.hibernate_one_to_one_unidirection.dao.PersonVoterDao;
import com.jsp.hibernate_one_to_one_unidirection.entity.Person;

public class DisplayAllPersonvoter {

	public static void main(String[] args) {
      PersonVoterDao dao=new PersonVoterDao();
      
      List<Person>person=dao.getAllPersonVoterDataDao();
      if(person!=null) {
    	  for (Person person2 : person) {
			System.out.println(person2);
		}
      }
      else {
    	  System.out.println("no person present");
      }
	}

}
