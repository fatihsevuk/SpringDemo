 package test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {

	public static void main(String[] args) {
		
		/*BeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader((BeanDefinitionRegistry) factory);
		reader.loadBeanDefinitions(new ClassPathResource("com.fatih.model/spring.xml"));
		*/
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("test/spring.xml");
		
		context.registerShutdownHook();
		
		Triangle triangle =(Triangle) context.getBean("triangle",Triangle.class);
		triangle.draw();
		
		
		

	}

}
