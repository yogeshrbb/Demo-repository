package javaLearningUserInput;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		System.out.println("What is your name?");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Hi "+name);
		sc.close();  //to stop from being leak and yellow error.
	
	}
}
