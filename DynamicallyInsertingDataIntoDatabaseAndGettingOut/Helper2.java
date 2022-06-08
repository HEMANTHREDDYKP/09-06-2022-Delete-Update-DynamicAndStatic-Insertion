package jdbc;

import java.util.Scanner;

public class Helper2 {
           //third 1st  dynamically insert and get
	public static void main(String[] args) {
        
		
		Employee employee=new Employee();//creating an object for employee and setting the 
		                                 //values 
		
//		Scanner scanner=new Scanner(System.in);
//		System.err.println("enter the id");
//		
//		int id=scanner.nextInt();
//		System.err.println("enter the name");
//		String name=scanner.next();// to enter the name as hemanth kp(name with spaces)
//		name=name+scanner.next();
//		employee.setId(id);
//		employee.setName(name);
//		
      	ToEstablishConnection toEstablishConnection =new ToEstablishConnection();// creating an object for Helper3 class  so that
		                               // i can access the method in that class 
		
		//toEstablishConnection.addDynamically(employee); // accessing the method of class Helper3 with the help of reference variable
		toEstablishConnection.getDynamically("ert");
	}

}
