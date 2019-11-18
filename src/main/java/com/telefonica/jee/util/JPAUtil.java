package com.telefonica.jee.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Utility Class for manage JPA connections
 * @author alan.sastre
 */
public class JPAUtil {

	private static final EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("servlets-employee");
	

	public static EntityManager getEntityManager() {
		return emFactory.createEntityManager();
	}

}
