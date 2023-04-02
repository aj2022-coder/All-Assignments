/* 23.Write a program to perform below operations on float type to 
get: 
a. The number of bits used to represent a float value
b. The number of bytes used to represent a float value
c. The minimum value a float
d. The maximum value a float */
class Test{
    public static void main(String[] args) {
        System.out.println("Number of bits used to respresent float :" +Float.SIZE);
        System.out.println("Number of bytes used to respresent float :" +Float.BYTES);
        System.out.println("Maximum value of float  :" +Float.MAX_VALUE);
        System.out.println("Minimum value of float  :" +Float.MIN_VALUE);
    }
}