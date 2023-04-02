import java.util.Scanner;
// 26.Write a program to find minimum and maximum number as well as 
// to add two float numbers using methods of Float..

    class Test
{
    
    Scanner sc=new Scanner(System.in);
    float i=sc.nextFloat();
    float j=sc.nextFloat();
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
        float result=i+j;
        System.out.println("Addition of the two number is : "+result);
    }

    public static void main(String[] args) {
        Test t=new Test();
        t.minMax();
        t.add();
        
    }
}


