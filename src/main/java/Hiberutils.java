import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hiberutils {
	public static SessionFactory buildfactorysessionobject() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		System.out.println("done");
		cfg.addAnnotatedClass(Studentos.class);
		cfg.addAnnotatedClass(User.class);
		cfg.addAnnotatedClass(Userpasvalid.class);
		
		SessionFactory sessionfactory=cfg.buildSessionFactory();
		return sessionfactory;
	}

}
