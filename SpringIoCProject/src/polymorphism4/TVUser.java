package polymorphism4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		//1. 스프링 컨테이너를 생성(구동)한다
		ClassPathXmlApplicationContext container = 
				new ClassPathXmlApplicationContext("business-layer.xml");
		
		//2.스프링 컨테이너로부터 테스트할 객체를 검색(lookup) 한다
		TV tv = (TV) container.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		
		//3. 스프링 컨테이너를 종료한다
		container.close();
		
	}
}
