import java.util.Scanner;

// Write a program to find minimum and maximum number as well as 
// to add two integer numbers using methods of Integer.
/**
 * question_18
 */
class question_18 {
    int a;
    int b;
    public void maxMin()
    {
        if(a>b)
        {
        System.out.println(a+" is larger number");
        }
        else
        System.out.println(b+" is maximum number");
    }
    public void add()
    {
        int addition=a+b;
        System.out.println("Addition of two number is : "+addition);
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    question_18 t=new question_18();
    t.a=sc.nextInt();
    t.b=sc.nextInt();
    t.add();
    t.maxMin();
    
}
    
}
