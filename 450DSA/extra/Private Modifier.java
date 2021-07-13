// Java program to illustrate default modifier

// Class Geeks is having Default access modif
public class MyClass
{
	private void display()
	{
		System.out.println("Hello World!");
	}
	
  	private static class Sex
    {
      private void fuck()
      {
        new MyClass().display();
        System.out.println("HOLA");
      }
    }
    
     public static void main(String args[]) 
    { 
        // Accessing class Geek from package p1 
        MyClass obj = new MyClass(); 
        new Sex().fuck();
        obj.display(); 
    } 
}

o/p: Hello World!
     HOLA
     Hello World!

//does not work for subclass in same package
ie
package i; 	//both A and B are present in package i and therefore subclasses for each other
class A
{
}
class B
{
}
