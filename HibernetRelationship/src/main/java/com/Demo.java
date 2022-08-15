package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo {

	private static final Course Course = null;

	public static void main(String[] args) {
	Configuration con = new Configuration();
	con.configure("hibernate.cfg.xml");
	SessionFactory sf = con.buildSessionFactory();
	Session session = sf.openSession();
	Transaction tran = session.getTransaction();
	
	//System.out.println("Table Created");
	
	
	//Trainer tr=new Trainer();
	//tr.setTid(102);
	//tr.setTname("Raghu");
	//tran.begin();
	//session.save(tr);
	//tran.commit();
	//System.out.println("trainer record stored successfully");
		
		
	//Students s=new Students();
	//s.setSid(3);
	//s.setSname("Srivalli");
	//s.setAge(22);
	//tran.begin();
	//session.save(s);
	//tran.commit();
	//System.out.println("Student record stored successfully");
		
	//Course c=new Course();
	//c.setCname("Python");
	//c.setFees(20000);
	//tran.begin();
	//session.save(c);
	//tran.commit();
	//System.out.println("course record stored successfully");
		
	// Assigning Trainer to the Students
	//Students s=session.get(Students.class, 3);
	//if(s==null)
	//{
		//System.out.println("Student Not Present");
	//}
	//else
	//{
		//tran.begin();
		//s.setTsid(102);
		//session.update(s);
		//tran.commit();
		//System.out.println("Successful");
	//}
	
	// Assigning Course to the Students
		//Students s=session.get(Students.class, 3);
		//if(s==null)
		//{
			//System.out.println("Student Not Present");
		//}
		//else
		//{
			//tran.begin();
			//s.setCsid(2);
			//session.update(s);
			//tran.commit();
			//System.out.println("Successful");
		//}
	
	// Assigning Course to the Trainer
	//Trainer tr=session.get(Trainer.class, 101);
	//if(tr==null)
	//{
		//System.out.println("Trainer Not Present");
	//}
	//else
	//{
		//tran.begin();
		//tr.setCourse();
		//session.update(tr);
		//tran.commit();
		//System.out.println("Successful");
	//}
	}

}
