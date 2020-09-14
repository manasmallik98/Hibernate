package com.manas.basics.dao;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import com.manas.basics.dto.AccountDTO;
class Factory{
	private static SessionFactory sessionFactory=null;
	private Factory() {
		
	}
	public static SessionFactory getFactory() {
		if(sessionFactory==null) {
			Configuration configuration=new Configuration();
			configuration.configure();
			configuration.addAnnotatedClass(AccountDTO.class);
			sessionFactory=configuration.buildSessionFactory();
		}
		return sessionFactory;
	}
}
public class AccountDAO {

	public void saveAccountDetails(AccountDTO accountDTO) {
		Session session=Factory.getFactory().openSession();
		Transaction transaction=session.beginTransaction();
		session.save(accountDTO);
		transaction.commit();
	}
	public AccountDTO getAccountdetailsById(Long id) {
		Session session=Factory.getFactory().openSession();
		return session.get(AccountDTO.class, id);
	}
	public void updateAcountBalance(Long id,Double balance) {
		AccountDTO accountDTO = getAccountdetailsById(id);
		if(accountDTO != null) {
			Session session = Factory.getFactory().openSession();
			Transaction transaction = session.beginTransaction();
			accountDTO.setBalance(balance);
			session.update(accountDTO);
			transaction.commit();
		}
		else {
			System.out.println("Balance Update Failed");
		}
		
	}
	public void updateMobileNumber(Long id,Long mobile) {
		AccountDTO accountDTO = getAccountdetailsById(id);
		if(accountDTO != null) {
			Session session = Factory.getFactory().openSession();
		    Transaction transaction = session.beginTransaction();
		    accountDTO.setMobNum(mobile);
		    session.update(accountDTO);
		    transaction.commit();
		}
		else
			System.out.println("Mobile Number Update Failed");
	}
	public void updateAcountAdress(Long id,String address) {
		AccountDTO accountDTO = getAccountdetailsById(id);
		if(accountDTO != null) {
			Session session = Factory.getFactory().openSession();
			Transaction transaction = session.beginTransaction();
			accountDTO.setAddress(address);
			session.update(accountDTO);
			transaction.commit();
		}
		else
			System.out.println("Address Updation Failed");
	}
	public void deleteAccount(Long id) {
		AccountDTO accountDTO=getAccountdetailsById(id);
		if(accountDTO != null) {
			Session session = Factory.getFactory().openSession();
			Transaction transaction = session.beginTransaction();
			session.delete(accountDTO);
			transaction.commit();
		}
	}
	
}
