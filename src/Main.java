import org.springframework.context.support.GenericXmlApplicationContext;

import com.codingz.spring_di.bean.User;


public class Main {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:com/codingz/spring_di/resources/applicationContext.xml");
		
		User user = (User)ctx.getBean("userBean");
		
		
		/*User user = new User();
		
		user.setName("Surasak");
		user.setLastname("Potipipit");
		user.setAge(23);
		user.setIdCard("0000000000");
		user.setGender("Male");*/
		
		
		//get value
		System.out.println("Name: "+user.getName()+" "+user.getLastname());
		System.out.println("ID Card: "+user.getIdCard());
		System.out.println("Gender: "+(user.getGender()));
		System.out.println("Age: "+user.getAge());
		System.out.println("Hobby: "+user.getHobby());
		

	}

}
