package method;

public class sample7 {
public static void main(String[] args) {
	sample7 s7=new sample7();
	s7.student("sabhyata" , 112,33.5f , 'C');
	name1("sabhyata" , 112,33.5f , 'C');
}
public void student(String sname,int srollnumber,float spercent,char sgrade) {
	System.out.println(sname+" "+srollnumber+" "+spercent+" "+sgrade);
}
public static void name1(String name,int rollno,float per,char grade) {
	System.out.println(name+rollno+per+grade);
}
}
