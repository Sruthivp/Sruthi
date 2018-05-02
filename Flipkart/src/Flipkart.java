import java.util.Random;
import java.util.Scanner;

public class Flipkart {
	void sell()
	{
		Random r=new Random();
		int Option=r.nextInt(3)+1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name");
		String name=s.nextLine();
		System.out.println("phone");
		long phone=s.nextLong();
		s.nextLine();
		System.out.println("Adress");
		String address=s.nextLine();
		
		if(option==1){
			Fedex f=new Fedex();
		f.deliverProduct(name,phone,address);
		
	}else if(option==2){
		IndianPost i= new IndianPost();
		i.deliverProduct(name,phone,address);
	}else if(option==3){
		DHL d=new DHL();
		d.deliverProduct(name,phone,address);
	}
		
	}

}
