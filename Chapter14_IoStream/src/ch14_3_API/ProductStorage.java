package ch14_3_API;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductStorage {
	private List<Product> list= new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	private int counter;
	
	public void showMenu() {
		while(true) {
			System.out.println("====================");
			System.out.println("1.��� | 2. ��� | 3. ����");
			System.out.println("====================");
			
			System.out.println("����: ");
			String selectNo=scanner.nextLine();
			switch(selectNo) {
			case "1":regiserProduct();break;
			case "2":showProducts(); break;
			case "3": return;
			}
		}
	}
public void regiserProduct() {
	try {
		Product product = new Product();
		product.setPno(++counter);
		
		System.out.print("��ǰ��: ");
		product.setName(scanner.nextLine());
		
		System.out.println("����: ");
		product.setPrice(Integer.parseInt(scanner.nextLine()));

	System.out.print("���: ");
	product.setStock(Integer.parseInt(scanner.nextLine()));
	
	list.add(product);
	}catch(Exception e) {
		System.out.println("��Ͽ���: "+e.getMessage());
	}
}
public void showProducts() {
	for(Product p: list) {
		System.out.println(p.getPno()+"\t"+p.getName()+"\t"+p.getPrice()+"\t"+p.getStock());
	}
}


	}
