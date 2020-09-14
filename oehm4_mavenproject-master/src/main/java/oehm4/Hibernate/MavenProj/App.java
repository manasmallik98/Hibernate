package oehm4.Hibernate.MavenAssignmentProj;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


//************C*******R********U**********D**************\\

public class App 
{
 

public static void main( String[] args )
    {
//*************************CREATING a Table******************************\\
	   
    /*   Laptop laptop =new Laptop();
        laptop.setId(1007L);
        laptop.setBrand("Lenevo");
        laptop.setOs("Unix");
        laptop.setGb("64gb");
        laptop.setGp("intel,core i7,3thGen");
        laptop.setPrice(55000.00);
        
         Configuration configuration=new Configuration().configure().addAnnotatedClass(Laptop.class) ;
         SessionFactory sessionFactory = configuration.buildSessionFactory();
         Session session = sessionFactory.openSession();
         Transaction transaction = session.beginTransaction();
         session.save(laptop);
         transaction.commit();                 */
//_________________________________________________________________________________________________________\\        
	   
	   
//*************************************READING/RETRIVING data from the table *************************************\\
	   
	/*	Configuration configuration=new Configuration().configure().addAnnotatedClass(Laptop.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Laptop laptop= (Laptop) session.get(Laptop.class, 1007L);
		if(laptop !=null) System.out.println(laptop);
		else System.out.println("invalid id");   */
//___________________________________________________________________________________________________________\\       
      
	//****************************UPDATING the table entry*************************************\\
	
/*	   Configuration configuration=new Configuration().configure().addAnnotatedClass(Laptop.class);
	   SessionFactory sessionFactory = configuration.buildSessionFactory();
	   Session session = sessionFactory.openSession();
	   Transaction transaction = session.beginTransaction();
	   Laptop laptop=(Laptop) session.get(Laptop.class, 1007L);
	   if(laptop != null)
	   {
	   laptop.setPrice(100000D);
	   session.update(laptop);
	   System.out.println("Entry updated");
	   }
	   else System.out.println("Updation Failed");
	   transaction.commit();	        */
//______________________________________________________________________________________________________________\\

       //************************************DELETE***************************************************\\	  
       //(there is no inbuilt method to delete the entries from table ,to DELETE we have to write HQL query)\\
//__________________________________________________________________________________________________________________\\	   
	   
	   
//~~~~~HQL~~~~~~~~~~~~~~~~CRUD~~~~~~~~~~~~~~~~__***HQL***__~~~~~~~~~~~~~~~~~~~~~CRUD~~~~~~~~~~~~~~~~~HQL~~~\\	   
         /* HQL does not support insert statement .so we cann't create new table through HQL query,
              but can retrieve,updated and delete through HQL query from the existing table .  */
	
	//*************************************READING/RETRIVING data from the table *************************************\\	  
	   

    /*  Configuration configuration=new Configuration().configure().addAnnotatedClass(Laptop.class);	
      SessionFactory sessionFactory = configuration.buildSessionFactory();
      Session session = sessionFactory.openSession();
      String hql="from Laptop";
	  Query query = session.createQuery(hql);
	  System.out.println( query.list()); //list() is a inbuilt  method like openSession(), buildSessionFactory()  */
	

	/*Configuration configuration=new Configuration().configure().addAnnotatedClass(Laptop.class);
	SessionFactory sessionFactory = configuration.buildSessionFactory();
	Session session = sessionFactory.openSession();
	String hql="from Laptop where id=:lid";
	Query query = session.createQuery(hql);
	query.setParameter("lid", 1007L);
	System.out.println( (Laptop) query.uniqueResult());*/
	 

	
     Configuration configuration=new Configuration().configure().addAnnotatedClass(Laptop.class);
      SessionFactory sessionFactory = configuration.buildSessionFactory();
      Session session = sessionFactory.openSession();
      Transaction transaction = session.beginTransaction();
      String hql="update Laptop set  brand=:BRAND where id=:LID";
      Query query = session.createQuery(hql);
      query.setParameter("BRAND", "MAC");
      query.setParameter("LID", 1006L);
      int updatedRows = query.executeUpdate();
      transaction.commit();
   
      if(updatedRows==0) {System.out.println("Update operation  Failed"); return;}
      System.out.println("Updated Successfully");
    
      
      
      /*  Configuration configuration=new Configuration().configure().addAnnotatedClass(Laptop.class);
      SessionFactory sessionFactory = configuration.buildSessionFactory();
      Session session = sessionFactory.openSession();
  	 Transaction transaction = session.beginTransaction();
  	 String hql="delete Laptop where id=:lid";
  	 Query query = session.createQuery(hql);
  	 query.setParameter("lid", 1001L);
  	 System.out.println("Cheack 1"); 
  	 int updatedRows= query.executeUpdate();
  	 System.out.println("Check 2"); 
  	 transaction.commit();
  	 if(updatedRows==0) {System.out.println("Delete operation  Failed");}
     System.out.println("Deleted Successfully");   */
  		 
	
	
	

	
	   
    }
}


