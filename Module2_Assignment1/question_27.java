/* 27.Write a program to perform below operations on Double type to 
get: 
a. The number of bits used to represent a double value
b. The number of bytes used to represent a double value
c. The minimum value a double
d. The maximum value a double
 */
class Test{
    public static void main(String[] args) {
        System.out.println("The number of bits used to represent a double value: "+Double.SIZE);
        System.out.println("The number of bytes used to represent a double value: "+Double.BYTES);
        System.out.println("minimum value a double : "+Double.MIN_VALUE);
        System.out.println("maximum value a double : "+Double.MAX_VALUE);
    }
}