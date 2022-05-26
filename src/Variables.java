/**
 * class name: Variables.java
 * author: Z. Evander Karl 
 * date: 05/26/22
 * version: 0.1
 * description: This program will display summary of primitive data types.
 * source: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 * direction: 1) read the source material
 *            2) summary of primitive data types: byte, short, int, long, float,
 *            double, boolean, char (2 lines per each type)
 *
 */
public class Variables
{
    public static void main(String[] args)
    {
        System.out.println("Summary of The Primitive Data Types");
        System.out.println("byte: 8-bit signed integer with possible values from -128 to 127.");
        System.out.println("short: Same as a byte, but with 16 bits; values range from -32,768 to 32,767.");
        System.out.println("int: By default, it is like the prior types but with 32 bits, -2^31 to 2^31-1.");
        System.out.println("It can also represent an unsigned integer, giving it a range of 0 to 2^32-1");
        System.out.println("long: Like an int, but 64 bits. Signed (default): -2^63 to 2^63-1. Unsigned: 0 to 2^64-1.");
        System.out.println("float: A floating-point number: values between integers near 0 but also very big integers.");
        System.out.println("Floats are not precise enough at large values and should not be used for things like money.");
        System.out.println("double: This is a floating point number with twice as many bits.");
        System.out.println("It has an even larger range of values, with more percision near 0 and even bigger integers.");
        System.out.println("boolean: represents one bit, values are 'True' or 'False'.");
        System.out.println("char: 16-bit Unicode character.");
    }

}
