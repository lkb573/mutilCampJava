package polymorphism4.collection;

public class CollectionClient {
	public static void main(String[] args) {
		CollectionBean bean = new CollectionBean();
		
		String[] addressList = bean.getAddressList();
		for (String address : addressList) {
			System.out.println("---> " + address.toString());
		}
	}
}
