package logicalprogram;

import java.util.Scanner;

public class accept_input_from_user2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter your name:");
	String name = scan.next();
	System.out.println(name.toUpperCase());
}
}
