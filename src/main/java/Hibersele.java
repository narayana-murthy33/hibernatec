import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibersele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		System.out.println("done");
		cfg.addAnnotatedClass(User.class);
		SessionFactory sessionfactory=cfg.buildSessionFactory();
		Session session=sessionfactory.openSession();
		//System.out.println("loaded");
		//User u1=new User(1,"swathi",100);
		
		session.beginTransaction();
		for(int i=1;i<3;i++) {
		User user=session.get(User.class, i);
	if(user.getName().equals("swathi")) 
	{
	System.out.println("swathi is there");}
		}
		
		//session.update(new User(2,"navya",200));
		//session.save(u1);
		session.getTransaction().commit();
		//System.out.println("session created");

	}

}
