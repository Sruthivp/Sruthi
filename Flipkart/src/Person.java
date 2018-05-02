
public class Person {
	void purchase(){
		Flipkart f=new Flipkart();
		f.sell();
	}
	public static void main(String[] args) {
		System.out.println("Person is present");
		Person p=new Person();
		System.out.println("hte ois purchaseinfg prdt");
		p.purchase();
		IDeliver.show();
	}

}
