// 14.Write a program to convert state of Short instance into byte, 
// short, int, long, float and double.
/**
 * question_14
 */
public class question_14 {

    public static void main(String[] args) {
        short s=120;
        Short s1=Short.valueOf(s);
        int i=s1;
        System.out.println("Short instance to the Integer: "+i);
        Short s2=Short.valueOf(s1);
        System.out.println("Short to short : "+s2);
        float f=s1;
        System.out.println("short to float : "+f);
        double d=s1;
        System.out.println("Short to double : "+d);
        long l=s1;
        System.out.println("Short to long : "+l);
        byte b2=s1.byteValue();
        System.out.println(b2);
    
    }
}