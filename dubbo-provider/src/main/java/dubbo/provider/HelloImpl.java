package dubbo.provider;

import api.Hello;

/**
 * Created by ${ lknny@163.com } on 2018/5/16.
 */
public class HelloImpl implements Hello{

		public String sayHello(String name) {
			return "你好，"+name;
		}
}
