package com.jsp.hibernate_one_to_one_unidirection.dao;

import java.util.List;


import com.jsp.hibernate_one_to_one_unidirection.entity.Voter;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class VoterDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");

	EntityManager em = emf.createEntityManager();

	EntityTransaction et = em.getTransaction();
	
      //insert voter
	public Voter saveVoterDao(Voter voter) {

		et.begin();
		em.persist(voter);
		et.commit();

		return voter;
	}
	
      //get voter
	public Voter getVoterByIdDao(int personId) {

		Voter voter = em.find(Voter.class, personId);

		return voter;

	}

	//delete voter
	public boolean deleteVoterByIdDao(int personId) {

		Voter voter = getVoterByIdDao(personId);

		if (voter != null) {

			et.begin();

			em.remove(voter);

			et.commit();

			return true;
		} else {
			return false;
		}

	}

	public Voter updateVoterByIdDao(int personId, String fathername) {

		Voter voter = getVoterByIdDao(personId);

		if (voter != null) {

			voter.setFatherName(fathername);

			et.begin();

			em.merge(voter);

			et.commit();

			return voter;
		} else {
			return null;
		}
	}

	public List<Voter> displayAllVoterDao() {

		return em.createQuery("FROM Voter").getResultList();

		// return query.getResultList();
	}

	public Voter getVoterByNameDao(String name, Object Voter) {

		jakarta.persistence.Query query = em.createQuery("Select e FROM Voter e Where e.name=?1");

		query.setParameter(1, name);

		try {
			return (Voter) query.getSingleResult();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("catch block");
			return null;
		}
	}

	public Voter getVoterByEmailDao(String EMAIL, Object email) {

		Query query = em.createQuery("Select e FROM Voter e Where e.email=?1");

		query.setParameter(1, email);

		try {
			return (Voter) query.getSingleResult();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("catch block");
			return null;
		}
	}

	public List<Voter> getVoterByIdDao(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
