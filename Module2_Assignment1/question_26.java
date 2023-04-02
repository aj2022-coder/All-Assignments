import java.util.Scanner;
// 30.Write a program to find minimum and maximum number as well as 
// to add two double numbers using methods of Double.

class Test
{
    
    Scanner sc=new Scanner(System.in);
    double i=sc.nextDouble();
    double j=sc.nextDouble();
    public void minMax()
    {
        if(i>j){
            System.out.println("Maximum number is : "+i);
        }
        else
        System.out.println("Minimum number is "+j);
    }
    public void add()
    {
        double result=i+j;
        System.out.println("Addition of the two number is : "+result);
    }

    public static void main(String[] args) {
        Test t=new Test();
        t.minMax();
        t.add();
        
    }
}
