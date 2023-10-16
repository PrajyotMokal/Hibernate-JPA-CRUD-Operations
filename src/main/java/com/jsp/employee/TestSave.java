package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prajyot");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Employee employee = new Employee();
		employee.setName("RAJ");
		employee.setEmail("raj@mail.com");
		employee.setCno(7418529637l);

		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}
}
