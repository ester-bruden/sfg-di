package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * 	INVERSION CONTROL
 */
@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		// the run method returns an application context
		ApplicationContext ctx= SpringApplication.run(SfgDiApplication.class, args);
		//in ctx Spring Framwork has all the managed components(beans). If I need anything I ask for an instance of the object that was created in te context:Inversion control
		// object is constructed and become available in the context (ctx), ask te context for a reference of that object
		// cast: because it returns an object. Name of the bean = name of the class with lower case
		MyController myController = (MyController) ctx.getBean("myController");
		// now I work with the constructed object
		String greeting = myController.sayHello();
		System.out.println(greeting);
	}

}
