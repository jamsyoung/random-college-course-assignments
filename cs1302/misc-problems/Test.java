
public class Test {

     public static void main(String []args){
        System.out.println("Problem  9: foo1(0) : " + foo1(0));
        System.out.println("Problem 10: foo1(4) : " + foo1(4));
        System.out.println("Problem 12: foo2(7) : " + foo2(7));
        System.out.println("Problem 14: foo2(65): " + foo2(65));

        System.out.println(foo(5));
     }

    public static int foo1(int n)
    {
        if (n == 0)
            return 0;
        else if (n >= 0)
            return foo1(n - 1);
        else
            return foo1(n + 1);
    }

    public static int foo2(int n)
    {
        if (n < 10)
            return n;
        else
            return foo2(n - 10);
    }

    public static int foo(int n)
    {
        return (n * foo(n - 1));
    }



}
