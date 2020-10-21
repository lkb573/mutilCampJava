package polymorphism4.collection;

import java.util.Collection;
import java.util.List;
import java.util.Properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionClient {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = 
			new ClassPathXmlApplicationContext("business-layer.xml");
		
		CollectionBean bean = (CollectionBean) container.getBean("collection");
		
		Properties collection = bean.getAddressList();
		Collection<Object> addressList = collection.values();
		
		for (Object address : addressList) {
			System.out.println("---> " + address.toString());
		}
	}
}
