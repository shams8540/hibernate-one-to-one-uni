package com.jsp.hibernate_one_to_one_unidirection.controller;

import com.jsp.hibernate_one_to_one_unidirection.dao.PersonVoterDao;

public class DeleteVoterById {

	public static void main(String[] args) {
		PersonVoterDao dao = new PersonVoterDao();
		boolean b=dao.deleteVoterByIdDao(666);
		if(b) {
			System.out.println("data deleted");
		}
		else {
			System.out.println("given id is not found");
		}
		
		
		//cascadetype.all delete person by id 
//		PersonVoterDao dao = new PersonVoterDao();
//		boolean b=dao.deletePersonByIdDao(999);
//		if(b) {
//			System.out.println("data deleted");
//		}
//		else {
//			System.out.println("given id is not found");
//		}
	}

}
