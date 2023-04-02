/* 24.Write a program to convert:
a. float value into String
b. float value into Float instance.
c. String instance into Float instance.
d. float value into hexadecimal string.
 */
class Test{
    public static void main(String[] args) {
        float f=12.52f;
        String s=Float.toString(f);
        System.out.println(s);
        Float f1=new Float(f);
        System.out.println(f);
        Float f2=Float.valueOf(s);
        System.out.println(f2);
        System.out.println("Float to hexadecimal: "+Float.toHexString(f));
     
    }
}