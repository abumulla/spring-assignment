package com.example.spring_concepts;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring_concepts.config.AppConfig;
import com.example.spring_concepts.impl.CloudEngineer;
import com.example.spring_concepts.impl.DevopsEngineer;
import com.example.spring_concepts.impl.SoftwareDeveloper;
import com.example.spring_concepts.impl.SoftwareTester;

public class SpringConceptsApplication {

	public static void main(String[] args) {
		// Note: ApplicationContext is parent interface of ConfigurableApplicationContext. 
		// Use ConfigurableApplicationContext for latest spring versions as it has close() method, which ApplicationContext does not support in new versions of spring.


		// Using ClassPathXmlApplicationContext
		ConfigurableApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("employee-config.xml");

		// SoftwareDeveloper Bean with setter injecting the **This** Bean
		Employee softwareDeveloper = applicationContext1.getBean("softwareDeveloper",SoftwareDeveloper.class);
		System.out.println(softwareDeveloper.toString());

		// SoftwareTester Bean with constructor injecting the **This** Bean
		Employee softwareTester = applicationContext1.getBean("softwareTester", SoftwareTester.class);
		System.out.println(softwareTester.toString());



		// Using AnnotationConfigApplicationContext
		ConfigurableApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(AppConfig.class);

		// DevopsEngineer Bean with constructor injecting the **Thbs** Bean
		Employee devopsEngineer = applicationContext2.getBean(DevopsEngineer.class);
		System.out.println(devopsEngineer.toString());

		// CloudEngineer Bean with setter injecting the **Thbs** Bean
		Employee cloudEngineer = applicationContext2.getBean(CloudEngineer.class);
		System.out.println(cloudEngineer.toString());

		// closing the resources of ApplicationContext
		applicationContext1.close();
		applicationContext2.close();
		
	}

}
