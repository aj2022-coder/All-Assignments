// 21.Write a program to convert state of Long instance into byte, 
// short, int, long, float and double.

/**
 * question_21
 */
public class question_21 {

    public static void main(String[] args) {
        long l=125;
        Long l1=Long.valueOf(l);
        byte b=l1.byteValue();
        System.out.println(b);
        short s=l1.shortValue();
        System.out.println(s);
        int i =l1.intValue();
        System.out.println(i);
        float f =l1.floatValue();
        System.out.println(f);
        double d =l1.doubleValue();
        System.out.println(d);
    }
}