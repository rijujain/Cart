package resources;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class utility {
	private static final String configuration_File="/resources/Hibernate.cfg.xml";
	private static SessionFactory sessionFactory= null;
	private static ServiceRegistry serviceRegistry=null;
	
public synchronized  static SessionFactory createSessionFactory(){
	if(sessionFactory==null){
		try{
			Configuration configuration=new Configuration().configure(configuration_File);
			serviceRegistry =new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			sessionFactory=configuration.buildSessionFactory(serviceRegistry);
			
			System.out.println("inside utility");
		}
		catch(Exception e ){
			e.printStackTrace();
		}
	}
	return sessionFactory;
}
public static void closeSessionFactory(){
	if (sessionFactory !=null && sessionFactory.isClosed()==false){
		sessionFactory.close();
		
		System.out.println("close inside utility");
	}
}
}
