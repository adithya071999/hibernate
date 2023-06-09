package student1;
import java.util.*;
public class main_scanner {

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		javax.persistence.EntityManagerFactory adi=javax.persistence.Persistence.createEntityManagerFactory("magician");
		javax.persistence.EntityManager em=adi.createEntityManager();
		javax.persistence.EntityTransaction et=em.getTransaction();
		dto s1=new dto();
		System.out.println("enter 1 for insert");
		System.out.println("enter 2 for update");
		System.out.println("enter 3 for fetch");
		System.out.println("enter 4 for delet");
		int n=sc.nextInt();
				switch(n)
				{
				case 1:
				{
					
					System.out.println("how many table to inserted");
					while(n!=0) {
						System.out.println("enter roll no");
						int rollno=sc.nextInt();
						s1.setRollno(rollno);
						System.out.println("enter name");
						String name=sc.next();
						s1.setName(name);
						System.out.println("enter age");
						int age=sc.nextInt();
						s1.setAge(age);
						n--;
					et.begin();
						em.persist(s1);
					et.commit();
					}
				}
				break;
				case 2:
				{
					
					System.out.println("for update");
					System.out.println("enter roll no");
					int rollno=sc.nextInt();
					dto s2=em.find(dto.class, rollno);
							System.out.println("what need to update");
					System.out.println("press 1 for name");
					System.out.println("press 2 for age");
					int s=sc.nextInt();
					if(s==1)
					{
						
						System.out.println("enter to update name");
						String name=sc.next();
						s2.setName(name);
						et.begin();
						em.merge(s2);
						et.commit();
					}
					else if(s==2)
					{
						System.out.println("enter age");
						int age=sc.nextInt();
						s2.setAge(age);
						et.begin();
						em.merge(s2);
						et.commit();
					}
					else
					{
						System.out.println("enter valid number");
					}
				}
				break;
				case 3:
				{
					 System.out.println("to fetch the data");	
					 System.out.println("enter the roll no");
			    	 int rollno=sc.nextInt();  	 
			    	dto s3=em.find(dto.class, rollno);
			    	System.out.println(s3.getRollno()+"\t"+s3.getAge()+"\t"+s3.getName());
			    	 break;
				}
				case 4:
				{
					
					System.out.println("to delet the data");
					System.out.println("enter roll number");
					int s4=sc.nextInt();
			    	 
			    	 dto s5=em.find(dto.class, s4);
			    	 
			    	 et.begin();
			    	 
			    	 em.remove(s5);
			    	 
			    	 et.commit();
			    	 
			    	 break;
			    	 
				}
				}

	}

}
