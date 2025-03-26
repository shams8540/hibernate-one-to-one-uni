package com.jsp.hibernate_one_to_one_unidirection.dao;

import java.util.List;

import com.jsp.hibernate_one_to_one_unidirection.entity.Person;
import com.jsp.hibernate_one_to_one_unidirection.entity.Voter;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

//
public class PersonVoterDao {
	//to read 
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate");
			
			// dml
			EntityManager em=emf.createEntityManager();
			
			//open or close sesson
			EntityTransaction et=em.getTransaction();
			
	//insert
	public Person savePersonVoterDao(Voter voter,Person person) {
		try {
			et.begin();
			em.persist(person);
			//em.persist(voter);         //cascading
			et.commit();
			System.out.println("inserted");
			return person;
		} catch (Exception e) {
			e.printStackTrace();
			
			return null;
		}
	}
	
	
	//save persondao
	public Person savePersonDao(Person person,int voterId) {
		try {
			Voter voter=em.find(Voter.class, voterId);
			if(voter!=null) {
				person.setVoter(voter);
				et.begin();
				em.persist(person);
				et.commit();
				return person;
			}
			System.out.println("else block");
			return null;
			
		} catch (Exception e) {
			System.out.println("catch block ");
			return null;
		}
	}
	
	//get both data person and voter
	public Person getPersonById(int personId) {
		return em.find(Person.class, personId);
	}
	
	
	//delete voter using Voterid
	public boolean deleteVoterByIdDao(int voterId) {
		
	Voter voter= em.find(Voter.class, voterId);
		if(voter!=null) {
			Person person=(Person) em.createNativeQuery("select * from person where voter_id=?1",Person.class)
					.setParameter(1, voter.getId())
					.getSingleResult();
			person.setVoter(null);  //for update from null
			
			et.begin();
			em.merge(person);
			em.remove(voter);
			et.commit();
			return true;
			
		}else {
			return false;
		}
		 
		
	}
	
	//cascade person delete to usee cascadetype .all
	public boolean deletePersonByIdDao(int personId) {
		Person person=em.find(Person.class, personId);
		if(person!=null) {
			et.begin();
			em.remove(person);
			et.commit();
			return true;
			
		}else {
			return false;
		}
	}
	//
	
	//get all person voter data dao
	public List<Person> getAllPersonVoterDataDao() {
		
		return em.createQuery("from Person").getResultList();
		
		
	}
	
	

}
