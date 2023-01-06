import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class Hiberuser {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		SessionFactory sessionfactory=Hiberutils.buildfactorysessionobject();
		Session session=sessionfactory.openSession();
		session.beginTransaction();
	//Query query=session.createQuery("select count(s)  from User s where id=?1 and name=?2");
	//query.setParameter(1,1);
	//query.setParameter(2, "swathi");
	Query query=session.createQuery("insert into User s  values( s.id=?1,s.name=?2,s.marks=?3)");
	query.setParameter(1, 4);
	query.setParameter(2, "ramu");
	query.setParameter(3, 400);
	session.save(query);
	
	
	//System.out.println(query);
	//List<User> list=query.list();
	//System.out.println(query.list());
	//for(User temp:list) {
		//System.out.println(temp);
	//}
	//System.out.println(list);
	//System.out.println(1+list);
	
		session.getTransaction().commit();

	}

}
