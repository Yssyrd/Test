package com.nrs.db;

import static org.hamcrest.CoreMatchers.nullValue;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author ����
 *
 * @date: 2018��6��27�� ����8:19:09
 */
public class StatusJudge {

	public String getStatus(){
		
		Session session = HibernateUtil.getInstance().getSession();
		Transaction transaction = session.beginTransaction();
		
		String hql = "";
		
		Object obj = session.createSQLQuery(hql).uniqueResult();
		
		transaction.commit();
		return obj.toString();
	}
	
}
