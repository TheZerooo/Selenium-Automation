package Demo;

public class Method {

	public static void main(String[] args) {
		
		// Create Object of Method
         Method d=new Method();
         
/* 
 *  Method d -> Method: This is the Type of the variable. It refers to the class definition.
 *  d-> This declares a variable named d that is capable of holding a reference to an object of the type Method.
 
                *****************************************
 *  new Method()
 *  new -> This is a Java keyword used to allocate memory on the heap for a new object.
 *  heap-> The "heap" is a specific region of memory used for dynamic memory allocation in Java.
 *  Method()-> it is a Constructor of Method class. constructor and class name are same .
 *  
 */
         
         d.getData();
         
         // Create Another Method 
        String name= d.printName();
        System.out.println("Your name is "+name);
        
        
        // ***** Create Method for Another Class
        
        Method2 p= new Method2();
      int sum=  p.addition(4, 5);
        System.out.println("Your Sum is "+ sum);
        
        System.out.println("Subtraction is "+ sub(1,9));
        System.out.println("Subtraction is "+ sub(9,1));

	}

	
	// Create a Method 
	
	public void getData() {
		System.out.println("Hello Tanu,How Are you");
	}
	
	public String printName() {
		return ("Tanu Giri ");
	}
	
	
	// ** In static we do not need to create object as above we are making d 
	
	public static int sub(int a, int b) {
		int min=a-b;
		return min;
	}
	
}
