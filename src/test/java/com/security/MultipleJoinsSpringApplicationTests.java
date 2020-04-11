package com.security;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.security.model.Phone;

import java.util.*;

@SpringBootTest
class MultipleJoinsSpringApplicationTests {

	@Autowired
	private EntityManager entityManager;

	@Test
	void contextLoads() {
	}

	@Test
	public void whenMultipleEntitiesAreListedWithJoin_createsMultipleJoins() {
		TypedQuery<Phone> query = entityManager.createQuery("SELECT ph from Employee e JOIN e.department d JOIN e.phone ph where d.name is not NULL",Phone.class);
		List<Phone> resultList = query.getResultList();
		
	}
}
