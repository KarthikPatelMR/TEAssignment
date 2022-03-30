package com.te.hibernatedummy.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernatedummy.dto.Employee;

//To create a Table
public class HibernateInsert {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmpId(101);
		employee.setEmpName("Karthik");
		employee.setEmpAddress("Shivamogga");
		employee.setEmpPassword("donno");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.persist(employee);
		transaction.commit();
	}
}
