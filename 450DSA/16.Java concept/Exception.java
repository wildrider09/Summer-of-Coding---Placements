import java.io.*;
class GFG {
    
    static void avg()
    {
        try{
            throw new ArithmeticException("Hi");
        }
        
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("hello");
        }
    }
	public static void main (String[] args) {
	 
	    avg();
	}
}

import java.io.*;
class GFG {
    
    static void avg()throws ArithmeticException
    {
        throw new ArithmeticException("Hiiiiii");
    }
        
	public static void main (String[] args) {
	 
	    try {
	        avg();
	    }
	    
	    catch(Exception e)
        {
            System.out.println(e);
            System.out.println("hello");
        }
    }
}

import java.io.*;
class GFG {
    
    static void avg()throws InvalidException
    {
        throw new InvalidException("Hiiiiii");
    }
        
	public static void main (String[] args) {
	 
	    try {
	        avg();
	    }
	    
	    catch(InvalidException e)
        {
            System.out.println(e);
            System.out.println("hello");
        }
    }
}

class InvalidException extends Exception
{
    String s;
    InvalidException(String e)
    {
        s=e;
    }
    
    public String toString()
    {
        return s;
    }
}




import java.io.*;
class GFG {
    
    static void avg()throws InvalidException
    {
        throw new InvalidException("Hiiiiii");
    }
        
	public static void main (String[] args) {
	 
	    try {
	        avg();
	    }
	    
	    catch(InvalidException e)
        {
            System.out.println(e);
            System.out.println("hello");
        }
    }
}

class InvalidException extends Exception
{
    InvalidException(String e)
    {
        super(e);
    }
}
