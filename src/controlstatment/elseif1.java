package controlstatment;

public class elseif1 {
public static void main(String[] args) {
	int marks=60;
	
	if(marks>=75)
	{
		System.out.println("paas in distinguish");
	}
	else if(marks>=60 & marks<=64)
		{
		System.out.println("paas in 3rd cla");
		}
	else if(marks>=50 & marks<=60)
	{
		System.out.println("passsed with first class");
	}
	else if(marks>=40 & marks<=49)
	{
		System.out.println("passed with second class");
	}
	else if(marks>=35 & marks<=39)
	{
		System.out.println("paased with third class");
	}
	else
	{
		System.out.println("failed");
	}
}
}
