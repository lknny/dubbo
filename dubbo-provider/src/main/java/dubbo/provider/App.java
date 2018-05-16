package dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by ${ lknny@163.com } on 2018/5/16.
 */
public class App {
	public static void main(String[] args) throws IOException{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-provider.xml");
		System.out.println(context.getDisplayName() + ": here");
		context.start();
		System.out.println("服务已经启动...");
		System.in.read();
	}
}
