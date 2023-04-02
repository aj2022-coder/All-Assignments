/* 28.Write a program to convert:
a. double value into String
b. double value into Double instance.
c. String instance into Double instance.
d. double value into binary, octal and hexadecimal 
string(Note: Here you can use doubleToLongBits() method 
along with methods of Long class). */
class Test{
    public static void main(String[] args) {
        double d=12.25;
        String s=Double.toString(d);
        System.out.println(s);
        Double d1=new Double(d);
        Double d2=Double.valueOf(d);
        System.out.println(d1);
        System.out.println(d2);
        String s1=new String("125.25");
        Double d3=Double.valueOf(s1);
        System.out.println(d3);
       System.out.println("Double to Binary: "+Double.doubleToLongBits(d1));
       System.out.println("Double to Binary: "+Double.toHexString(d));
    }
}