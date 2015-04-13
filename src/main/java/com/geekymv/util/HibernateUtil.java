package com.geekymv.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactory = new Configuration() //
													.configure() //
													.buildSessionFactory();
	/**
	 * 获得Session
	 * @return
	 */
	public static Session getSession() {
		return sessionFactory.openSession();
	}
	
	/**
	 * 关闭Session
	 * @param session
	 */
	public static void closeSession(Session session){
		if(session != null) {
			session.close();
		}
	}
}
