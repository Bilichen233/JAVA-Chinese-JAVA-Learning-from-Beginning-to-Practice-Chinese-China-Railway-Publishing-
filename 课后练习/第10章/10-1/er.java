public class er { 

String name; 

er(String input) { 
name = input; 
} 

er() { 
this("John/Mary Doe"); 
} 

public static void main(String args[]) { 
er p1 = new er("digger"); 
er p2 = new er(); 
} 
} 