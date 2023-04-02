// 29.Write a program to convert state of Double instance into byte, 
// short, int, long, float and double.
class Test{
    public static void main(String[] args) {
        double d=125.30;
        Double d1=Double.valueOf(d);
        System.out.println(d1);
        byte b=d1.byteValue();
        System.out.println(b);
        short s=d1.shortValue();
        System.out.println(s);
        int i=d1.intValue();
        System.out.println(i);
        long l=d1.byteValue();
        System.out.println(l);
        float f=d1.floatValue();
        System.out.println(f);
        double d2=d1.doubleValue();
        System.out.println(d2);
    }
}