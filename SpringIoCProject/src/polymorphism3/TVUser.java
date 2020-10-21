package polymorphism3;

public class TVUser {
	public static void main(String[] args) {
		FactoryPattern factory = new FactoryPattern();
		
		TV tv = (TV) factory.getBean(args[0]);
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}
}
