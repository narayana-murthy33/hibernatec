import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.query.Query;

public class Hiberhql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loginhiber();
	}

	public static void loginhiber() {
		SessionFactory sessionfactory=Hiberutils.buildfactorysessionobject();
		Session session=sessionfactory.openSession();
		session.beginTransaction();
	Query query=session.createQuery(" select count(s) from Userpasvalid s where username=?1 and password=?2");
//Query query=session.createQuery(" select s from Userpasvalid s where username=?1 and password=?2");
	
	query.setParameter(1,"swathi62@gmail.com");
	query.setParameter(2, "swathi123");
	
	List<Userpasvalid> list=query.list();
	for(Userpasvalid temp:list) {
		System.out.println(temp);
	}
	

	System.out.println(list.get(0));
	
	

	
	
	


	
	
	
session.getTransaction().commit();
		
	}
	
		
	}


