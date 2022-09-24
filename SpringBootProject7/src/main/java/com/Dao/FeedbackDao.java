package com.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.bean.Feedback;

@Repository
public class FeedbackDao 
{
	@Autowired
    EntityManagerFactory emf; 
	
	public Feedback getUserFeedbackById(int id) {
  	  EntityManager manager=emf.createEntityManager();
  	  Feedback f=manager.find(Feedback.class, id);
  	  return f;
    }
    
    public int storeFeedback(Feedback f) {
  	  try {
  		  EntityManager manager=emf.createEntityManager();
  		  EntityTransaction tran=manager.getTransaction();
  		  tran.begin();
  		  manager.persist(f);
  		  tran.commit();
  		  return 1;
  	  }catch (Exception e) {
			System.out.println(e);
			return 0;
		}
    }
}
