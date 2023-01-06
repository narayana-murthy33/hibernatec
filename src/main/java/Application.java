import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		System.out.println("done");
		cfg.addAnnotatedClass(User.class);
		SessionFactory sessionfactory=cfg.buildSessionFactory();
		Session session=sessionfactory.openSession();
		System.out.println("loaded");
		User u1=new User(1,"swathi",100);
		session.beginTransaction();
		session.save(u1);
		session.getTransaction().commit();
		System.out.println("session created");

	}

}
