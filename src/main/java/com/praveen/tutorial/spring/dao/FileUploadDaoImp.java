/**
 * 
 */
package com.praveen.tutorial.spring.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.praveen.tutorial.spring.model.UploadFile;

/**
 * @author Praveenkumar.S
 *
 */
@Repository
public class FileUploadDaoImp implements FileUploadDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public FileUploadDaoImp(){
	}
	
	public FileUploadDaoImp(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public void save(UploadFile uploadFile) {
		sessionFactory.getCurrentSession().save(uploadFile);
		
	}

}
