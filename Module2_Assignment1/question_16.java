/* 16. Write a program to convert:
a. int value into String
b. int value into Integer instance.
c. String instance into Integer instance.
d. int value into binary, octal and hexadecimal string. */

/**
 * question_16
 */
public class question_16 {

    
public static void main(String[] args) {
    int i=120;
    String s=Integer.toString(i);
    System.out.println(s);//120
    Integer i1=Integer.valueOf(i);
    System.out.println(i1);//120
    String str=new String("125");
    Integer i2=Integer.valueOf(str);
    System.out.println(i2);//125
    int a=130;
    String binary=Integer.toBinaryString(a);
    String octal=Integer.toOctalString(a);
    String hexa=Integer.toHexString(a);
    System.out.println(binary);
    System.out.println(octal);
    System.out.println(hexa);
}
}