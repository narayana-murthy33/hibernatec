import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;



public class Userpasvalid1 {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		userregistration();
		

	}

	public static void userregistration() {
		SessionFactory sessionfactory=Hiberutils.buildfactorysessionobject();
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		
		Userpasvalid u1=new Userpasvalid();
		System.out.println("enter username");
				u1.setUsername(sc.next());
				System.out.println("enter_password");
				u1.setPassword(sc.next());
				System.out.println("enter_fristname");
				u1.setFirstname(sc.next());
				System.out.println("enter_lastname");
				u1.setLastname(sc.next());
				System.out.println("enter_gender");
				u1.setGender(sc.next());
				System.out.println("enter_phonenumber");
				u1.setPhonenumber(sc.next()); 
				System.out.println("enter_email");
				u1.setEmail(sc.next());
				session.save(u1);
				session.getTransaction().commit();
	}}
