package newpackage2;
public class Eval {
    public static void main(String[] args) 
    {
        A obj=new A();
        System.out.println("Average="+obj.getPercentage(91, 92, 93));
        B obj1=new B();
        System.out.println("Average="+obj1.getPercentage(91, 92, 93, 94));
    }
    
}
abstract class Marks
{
  abstract int getPercentage(int a,int b,int c);
  abstract int getPercentage(int a,int b,int c,int d);
}
class A extends Marks
{
    @Override
    int getPercentage(int a,int b,int c)
    {
        int s=(a+b+c)/3;
        return s;
    }
    @Override
    int getPercentage(int a,int b,int c,int d)
    {
       return 0;
    }
}
class B extends A
{
    @Override
    int getPercentage(int a,int b,int c)
    {
        return 0;
    }
    @Override
    int getPercentage(int a,int b,int c,int d)
    {
        int t=(a+b+c+d)/4;
        return t;
    }
}

