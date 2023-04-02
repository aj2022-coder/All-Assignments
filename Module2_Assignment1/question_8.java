// 8.Write a program to convert:
// a. byte value into String
// b. byte value into Byte instance.
// c. String instance into Byte instance.

 class question_8 {
    public static void main(String[] args) {
        byte b=30;
        String s=Byte.toString(b);
        System.out.println(s);
        System.out.println();
        System.out.println();
        byte b1=50;
        Byte b3=Byte.valueOf(b1);
        System.out.println(b3);
        System.out.println();
        System.out.println();
        String str=new String("120");
        Byte b4=Byte.valueOf(str);
        System.out.println(b4);
    }
    
}
