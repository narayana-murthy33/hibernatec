import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hiberupdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionfactory = buildfactorysessionobject();
		Session session=sessionfactory.openSession();
		System.out.println("loaded");
		User u1=new User(1,"swathi",100);
		session.beginTransaction();
		//session.update(new User(1,"swathi",200));
		//session.save(u1);
		User u=new User();
		User user2=session.load(User.class,1);
		user2.setMarks(500);
		session.update(user2);
		session.getTransaction().commit();
		System.out.println("session created");


	}

	public static SessionFactory buildfactorysessionobject() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		System.out.println("done");
		cfg.addAnnotatedClass(User.class);
		SessionFactory sessionfactory=cfg.buildSessionFactory();
		return sessionfactory;
	}

}
