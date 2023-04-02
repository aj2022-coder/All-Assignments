// 9.Write a program to convert state of Byte instance into byte, 
// short, int. long, float and double.

public class question_9 {
    public static void main(String[] args) {
        byte b=125;
        Byte b1=Byte.valueOf(b);
        byte b3=Byte.valueOf(b1);//State instance byte to byte
        System.out.println(b3);
        short s=Short.valueOf(b1);//State instance byte to short
        System.out.println(s);
        int i=Integer.valueOf(b1);//State instance byte to integer
        System.out.println(i);
       long l=Long.valueOf(b1);//State instance byte to long
       System.out.println(l);
       float f=Float.valueOf(b1);//State instance byte to float
       System.out.println(f);
       double d=Double.valueOf(b1);//State instance byte to double
       System.out.println(d);


    }
    
}
