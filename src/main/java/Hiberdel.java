import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hiberdel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionfactory = Hiberutils.buildfactorysessionobject();
	
		Session session=sessionfactory.openSession();
		System.out.println("loaded");
		//User u1=new User(1,"swathi",100);
		session.beginTransaction();
		//session.save(u1);
		session.delete(new User(3,"",0));
		session.getTransaction().commit();
		System.out.println("session created");


	}

}
