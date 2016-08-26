package test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayBeanNameBeanPostProcessor implements BeanPostProcessor{
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("baþlatma sonrasý bean adý: "+beanName);
		return bean;
	}
	
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("baþlatma öncesi bean adý: "+beanName);
		return bean;
	}

}
