package dubbo.consumer;

import api.Hello;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ${ lknny@163.com } on 2018/5/16.
 */
public class App {
	public static void main(String[] args) {
		//测试常规服务
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("dubbo-consumer.xml");
		context.start();
		System.out.println("consumer start");
		Hello hello = context.getBean(Hello.class);
		System.out.println("consumer");
		System.out.println(hello.sayHello("liukun"));
	}
}
