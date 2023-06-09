package student1;
import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		javax.persistence.EntityManagerFactory adi=javax.persistence.Persistence.createEntityManagerFactory("magician");
		javax.persistence.EntityManager em=adi.createEntityManager();
//javax.persistence.EntityTransaction et=em.getTransaction();
		dto s3=new dto();
		s3.setRollno(10);
		s3.setName("adi");
		s3.setAge(26);
		dto s4=new dto();
		s4.setRollno(20);
		s4.setName("master");
		s4.setAge(24);
		dto e9=em.find(dto.class, 10);
		System.out.println(e9.getRollno()+"\t"+e9.getAge()+"\t"+e9.getName());
	//	et.begin();
			
		//	em.persist(s4);
	//	et.commit();

	}

}
