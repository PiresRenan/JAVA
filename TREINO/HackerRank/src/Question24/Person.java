package Question24;

import java.util.Scanner;
public class Person {

	private int initialAge;
	private int age;
	private int T;
	Scanner sc = new Scanner(System.in);
	
	Person(){
		this.initialAge = initialAge;
		this.age = age;
		casesTest();
	}
	
	public void casesTest() {
		T = sc.nextInt();
		if(T >= 1 && T <= 4) {
			setAge();
		}
	}
	
	public void setAge() {
		int control=0;
		while(control < T) {
			this.initialAge = sc.nextInt();
			control++;
			if(initialAge < 0 && initialAge >= -5) {
				System.out.println("Age is not valid, setting age to 0.");
				this.initialAge = 0;
				timePassed();
			}else if(initialAge <= 30) {
				this.initialAge = initialAge;
				timePassed();
			}
		}
	}
	
	public void timePassed() {
		if(initialAge > 0 && initialAge < 13) {
			System.out.println("You are young.");
		}else if (initialAge >= 13 && initialAge < 18) {
			System.out.println("You are a teenager.");
		}else {
			System.out.println("You are old.");
		}
		
		this.age = initialAge + 3;
		
		if(age > 0 && age < 13) {
			System.out.println("You are young.");
			System.out.println(age);
		}else if (age >= 13 && age < 18) {
			System.out.println("You are a teenager.");
			System.out.println(age);
		}else {
			System.out.println("You are old.");
			System.out.println(age);
		}
	}
}
