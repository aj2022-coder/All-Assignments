class Test{
    public static void main(String[] args) {
        //a.To convert boolean to string 
        boolean b=true;
        String s=Boolean.toString(b);
        System.out.println(s);
        boolean a=false;
        String str=String.valueOf(a);
        System.out.println(str);
        System.out.println();
        System.out.println();

        // b. boolean value into Boolean instance.
        boolean bool=true;
        Boolean c=Boolean.valueOf(bool);
        System.out.println(c);
        System.out.println();
        System.out.println();

        // c. String value into boolean value
        String s1=new String("true");
        boolean d=Boolean.parseBoolean(s1);
        System.out.println(d);
        System.out.println();
        System.out.println();
        // d. String value into Boolean instance.
        String s2="true";
        Boolean b2=Boolean.valueOf(s2);
        System.out.println(b2);




    }
}