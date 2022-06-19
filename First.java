// class First{
// 	public static void main(String[]args){
// 		Employee e =new Employee();
// 		e.getName("Binayak");
// 		e.getId(10);
// 		System.out.println(e.setId());
// 		System.out.println(e.setName());
// 	}
// }
// class Employee{
// 	private String name;
// 	private int id;
// 	public void getName(String name){
// 		this.name=name;
// 	}
// 	public void getId(int id){
// 		this.id=id;
// 	}
// 	public String setName(){
// 		return this.name;
// 	}
// 	public int setId(){
// 		return this.id;
// 	}
// }
import java.util.Scanner;
class First{
	public static void main(String[]args){
	Scanner S= new Scanner(System.in);
	System.out.println("Enter Name: ");
	String name= S.next();	
	System.out.println("Entered name is ");
	System.out.println(name);
	}
}