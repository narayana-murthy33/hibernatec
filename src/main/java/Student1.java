import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Student1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionfactory=Hiberutils.buildfactorysessionobject();
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		Studentos s1=new Studentos();
		
		s1.setName("chandu");
		s1.setStatus("inactive");
		session.save(s1);
		session.getTransaction().commit();
	}

}
