package promy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Smpleinput {
public static void main(String[] args) {
	try{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter thne str");
		String name=br.readLine();
		System.out.println("Enteer ur colleage name");
		String colname=br.readLine();
		//String n=br.readLine();
		//System.out.println(n);
		System.out.println(name+""+colname);
	}catch(Exception e){
}
}

}