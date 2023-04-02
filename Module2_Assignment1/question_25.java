// 25.Write a program to convert state of Float instance into byte, 
// short, int, long, float and double.
class Test{
    public static void main(String[] args) {
        float f=25.36f;
        Float f1=new Float(f);
        System.out.println(f1);
        float f2=f1.floatValue();
        System.out.println(f2);
        byte b=f1.byteValue();
        System.out.println(b);
        short s=f1.shortValue();
        System.out.println(s);
        int i=f1.intValue();
        System.out.println(i);
        long l=f1.longValue();
        System.out.println(l);
        double d=f1.doubleValue();
        System.out.println(d);
        
    }
}