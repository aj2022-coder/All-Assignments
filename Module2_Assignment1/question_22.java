import java.util.Scanner;
// 22. Write a program to find minimum and maximum number as well as 
// to add two long numbers using methods of Long.
/**
 * question_22
 */
public class question_22 {
  
    Scanner sc=new Scanner (System.in);
    
    int i=sc.nextInt();
    int j=sc.nextInt();
  
    public void mimMax()
    {
        if (i>j)
        {
            System.out.println("Maximum number is :"+i);
        }
        else
        {
            System.out.println("Maximum number is :"+j);
        }
    }
    public void add()
    {
        int addition=i+j;
        System.out.println("Addition of two Numbers is : "+addition);
    }

    public static void main(String[] args) {
        question_22 t=new question_22();
        t.add();
        t.mimMax();

       
    }
}
