package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp2 {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("test/spring.xml");
		Triangle triangle=(Triangle) context.getBean("triangle");
		triangle.draw();
		
		
		
	}

}
