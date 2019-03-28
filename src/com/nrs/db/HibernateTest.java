package com.nrs.db;

import java.sql.Timestamp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Test;

import com.nrs.entites.Data;
import com.nrs.entites.DataMapping;



public class HibernateTest {

	@Test
	public void test() throws InterruptedException {

		SessionFactory sessionFactory = null;
		

		Configuration configuration = new Configuration().configure();
		

		

		ServiceRegistry serviceRegistry = 
				new ServiceRegistryBuilder().applySettings(configuration.getProperties())
				                            .buildServiceRegistry();

		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		

		Session session = sessionFactory.openSession();
		

		Transaction transaction = session.beginTransaction();
		
		String[] arr = {"0","1"};
		java.util.Random r=new java.util.Random();		
		
		Timestamp begin = Timestamp.valueOf("2018-05-09 21:43:20");
		
		long s = begin.getTime();
		
		int i = 0;
		while(i<159900){
			
			s += 10000;
			Data adata = new Data();
			adata.setLeftSide(arr[r.nextInt(2)]);
			adata.setFrontSide(arr[r.nextInt(2)]);
			adata.setOppositeSide(arr[r.nextInt(2)]);
			adata.setRightSide(arr[r.nextInt(2)]);
			
			session.save(adata);
			
			Data bdata = new Data();
			bdata.setFrontSide(arr[r.nextInt(2)]);
			bdata.setOppositeSide(arr[r.nextInt(2)]);
			bdata.setLeftSide(arr[r.nextInt(2)]);
			bdata.setRightSide(arr[r.nextInt(2)]);
			
			session.save(bdata);
			
			Data rdata = new Data();
			rdata.setFrontSide(String.valueOf(198 + r.nextInt(5)));
			rdata.setOppositeSide(String.valueOf(198 + r.nextInt(5)));
			rdata.setLeftSide(String.valueOf(198 + r.nextInt(5)));
			rdata.setRightSide(String.valueOf(198 + r.nextInt(5)));
			
			session.save(rdata);
			
			DataMapping map = new DataMapping();
			
			map.setAddress("中国测试技术研究院");
			map.setInstrumentId("8");
			map.setaThreshold("0");
			map.setbThreshold("0");
			map.setrThreshold("0");
			map.setLoginDate(new Timestamp(s));
			map.setRemark("此仪器安全。");
			map.setSerials("");
			
			map.setaRadial(adata.getId().toString());
			map.setbRadial(bdata.getId().toString());
			map.setrRadial(rdata.getId().toString());
			
			session.save(map);
			
			if(i%20 == 0){
				session.flush();
				session.clear();
			}
			i++;
			
			Thread.sleep(100);
		}
		i = 0;
		while(i<160000){
			
			s += 10000;
			Data adata = new Data();
			adata.setLeftSide(arr[r.nextInt(2)]);
			adata.setFrontSide(arr[r.nextInt(2)]);
			adata.setOppositeSide(arr[r.nextInt(2)]);
			adata.setRightSide(arr[r.nextInt(2)]);
			
			session.save(adata);
			
			Data bdata = new Data();
			bdata.setFrontSide(arr[r.nextInt(2)]);
			bdata.setOppositeSide(arr[r.nextInt(2)]);
			bdata.setLeftSide(arr[r.nextInt(2)]);
			bdata.setRightSide(arr[r.nextInt(2)]);
			
			session.save(bdata);
			
			Data rdata = new Data();
			rdata.setFrontSide(String.valueOf(198 + r.nextInt(5)));
			rdata.setOppositeSide(String.valueOf(198 + r.nextInt(5)));
			rdata.setLeftSide(String.valueOf(198 + r.nextInt(5)));
			rdata.setRightSide(String.valueOf(198 + r.nextInt(5)));
			
			session.save(rdata);
			
			DataMapping map = new DataMapping();
			
			map.setAddress("中国测试技术研究院");
			map.setInstrumentId("9");
			map.setaThreshold("0");
			map.setbThreshold("0");
			map.setrThreshold("0");
			map.setLoginDate(new Timestamp(s));
			map.setRemark("此仪器安全。");
			map.setSerials("");
			
			map.setaRadial(adata.getId().toString());
			map.setbRadial(bdata.getId().toString());
			map.setrRadial(rdata.getId().toString());
			
			session.save(map);
			
			if(i%20 == 0){
				session.flush();
				session.clear();
			}
			i++;
			
			Thread.sleep(100);
		}
		
		i = 0;
		while(i<160000){
			
			s += 10000;
			Data adata = new Data();
			adata.setLeftSide(arr[r.nextInt(2)]);
			adata.setFrontSide(arr[r.nextInt(2)]);
			adata.setOppositeSide(arr[r.nextInt(2)]);
			adata.setRightSide(arr[r.nextInt(2)]);
			
			session.save(adata);
			
			Data bdata = new Data();
			bdata.setFrontSide(arr[r.nextInt(2)]);
			bdata.setOppositeSide(arr[r.nextInt(2)]);
			bdata.setLeftSide(arr[r.nextInt(2)]);
			bdata.setRightSide(arr[r.nextInt(2)]);
			
			session.save(bdata);
			
			Data rdata = new Data();
			rdata.setFrontSide(String.valueOf(198 + r.nextInt(5)));
			rdata.setOppositeSide(String.valueOf(198 + r.nextInt(5)));
			rdata.setLeftSide(String.valueOf(198 + r.nextInt(5)));
			rdata.setRightSide(String.valueOf(198 + r.nextInt(5)));
			
			session.save(rdata);
			
			DataMapping map = new DataMapping();
			
			map.setAddress("中国测试技术研究院");
			map.setInstrumentId("10");
			map.setaThreshold("0");
			map.setbThreshold("0");
			map.setrThreshold("0");
			map.setLoginDate(new Timestamp(s));
			map.setRemark("此仪器安全。");
			map.setSerials("");
			
			map.setaRadial(adata.getId().toString());
			map.setbRadial(bdata.getId().toString());
			map.setrRadial(rdata.getId().toString());
			
			session.save(map);
			
			if(i%20 == 0){
				session.flush();
				session.clear();
			}
			i++;
			
			Thread.sleep(100);
		}
		
		i = 0;
		while(i<160000){
			
			s += 10000;
			Data adata = new Data();
			adata.setLeftSide(arr[r.nextInt(2)]);
			adata.setFrontSide(arr[r.nextInt(2)]);
			adata.setOppositeSide(arr[r.nextInt(2)]);
			adata.setRightSide(arr[r.nextInt(2)]);
			
			session.save(adata);
			
			Data bdata = new Data();
			bdata.setFrontSide(arr[r.nextInt(2)]);
			bdata.setOppositeSide(arr[r.nextInt(2)]);
			bdata.setLeftSide(arr[r.nextInt(2)]);
			bdata.setRightSide(arr[r.nextInt(2)]);
			
			session.save(bdata);
			
			Data rdata = new Data();
			rdata.setFrontSide(String.valueOf(198 + r.nextInt(5)));
			rdata.setOppositeSide(String.valueOf(198 + r.nextInt(5)));
			rdata.setLeftSide(String.valueOf(198 + r.nextInt(5)));
			rdata.setRightSide(String.valueOf(198 + r.nextInt(5)));
			
			session.save(rdata);
			
			DataMapping map = new DataMapping();
			
			map.setAddress("中国测试技术研究院");
			map.setInstrumentId("11");
			map.setaThreshold("0");
			map.setbThreshold("0");
			map.setrThreshold("0");
			map.setLoginDate(new Timestamp(s));
			map.setRemark("此仪器安全。");
			map.setSerials("");
			
			map.setaRadial(adata.getId().toString());
			map.setbRadial(bdata.getId().toString());
			map.setrRadial(rdata.getId().toString());
			
			session.save(map);
			
			if(i%20 == 0){
				session.flush();
				session.clear();
			}
			i++;
			
			Thread.sleep(100);
		}
		
		
		transaction.commit();
		
		session.close();
		
		sessionFactory.close();
	}
	
}
