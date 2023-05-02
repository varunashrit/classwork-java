package springannotations.entities;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
//		//configuration metadata
		String springConfigurationFile = "springconfig.xml";
		try (AbstractApplicationContext factory = new ClassPathXmlApplicationContext(springConfigurationFile)) {
			Customer cust = factory.getBean("customer", Customer.class);
			System.out.println("Got customer " + cust.getName());
			Person personBean = factory.getBean("person",Person.class);
			System.out.println("Got Person "+personBean.getPersonName());
			Address resiAdd = factory.getBean("addressBean1",Address.class);
			System.out.println("Got residential address "+resiAdd.getCity());

}
	}
}