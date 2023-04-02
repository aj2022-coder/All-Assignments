/* 13.Write a program to convert:
a. short value into String
b. short value into Short instance.
c. String instance into Short instance. */
/**
 * question_13
 */
 class question_13 {
public static void main(String[] args) {
    short s=120;
    String str=Short.toString(s);
    System.out.println(str);
    Short s1=Short.valueOf(s);
    System.out.println(s1);
    String str2=new String("100");
    Short s2=Short.valueOf(str2);
    System.out.println(s2);
}
    
}