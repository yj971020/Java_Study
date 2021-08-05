package ch06;

public class ShopServiceExample {

	public static void main(String[] args) {

		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1==obj2) {
			System.out.println("°°Àº ShopService °´Ã¼");
		}else {
			System.out.println("´Ù¸¥ ShopService °´Ã¼");
		}
	}

}
