// Write a program to convert state of Integer instance into 
// byte, short, int, long, float and double.

/**
 * question_17
 */
public class question_17 {

    public static void main(String[] args) {
        int i=125;
        Integer a=Integer.valueOf(i);
        byte b=a.byteValue();
        System.out.println(b);
        short c=a.shortValue();
        System.out.println(c);
        int i1=a.intValue();
        System.out.println(i1);
        long l=a.longValue();
        System.out.println(l);
        float f=a.floatValue();
        System.out.println(f);
        double d=a.doubleValue();
        System.out.println(d);
    }
}