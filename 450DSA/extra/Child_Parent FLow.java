class P
{
    P()
    {
        System.out.println("Hi");
    }
    {
        System.out.println("Parent");
    }
    P(int i)
    {
        System.out.println("Lol");
    }
}
class C extends P
{
    C()
    {
        super();
        System.out.println("Child1");
    }
    
    C(int i)
    {
        super(i);
        System.out.println("Child2");
    }
    
    {
        System.out.println("Child3");
    }
        
    public static void main(String args[])
    {  
        C c1=new C();
        C c2=new C(10);
    }
}  
