/* 20.Write a program to convert:
a. long value into String
b. long value into Long instance.
c. String instance into Long instance.
d. long value into binary, octal and hexadecimal string.
 */
/**
 * question_20
 */
public class question_20 {

    public static void main(String[] args) {
        long l=1254;
        String s=String.valueOf(l);
        System.out.println(s);
        Long l1=Long.valueOf(l);
        System.out.println(l1);
        Long l2=Long.valueOf(s);
        System.out.println(l2);
        System.out.println("Long to binary "+Long.toBinaryString(l));
        System.out.println("Long to binary "+Long.toOctalString(l));
        System.out.println("Long to binary "+Long.toHexString(l));
        
    }
}