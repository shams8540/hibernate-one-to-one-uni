package com.jsp.hibernate_one_to_one_unidirection.controller;

import com.jsp.hibernate_one_to_one_unidirection.dao.PersonVoterDao;
import com.jsp.hibernate_one_to_one_unidirection.entity.Person;
import com.jsp.hibernate_one_to_one_unidirection.entity.Voter;

public class DisplayPersonAdharDetailsByPersonIdController {
	public static void main(String[] args) {

		PersonVoterDao dao=new PersonVoterDao();
		//for both person and voter data display using data annotation tostring() call
		Person person=dao.getPersonById(1234);
				if(person!=null) {
					System.out.println(person);
				}
				
				
				//remove @Data and generate manuallly toString() and @getter @setter 
				
//		Person person=dao.getPersonById(1234);
//				if(person!=null) {
//					System.out.println(person);
//					Voter voter =person.getVoter();
//					if(voter!=null) {
//						System.out.println(voter);
//					}
//				}
//			
				
				//cascading display all person voter data
				
				
	}
}
