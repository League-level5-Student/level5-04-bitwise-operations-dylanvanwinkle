package _03_Printing_Binary;

public class BinaryPrinter {
	/*
	 * Complete the methods below so they print the passed in parameter in binary.
	 * Do not use the Integer.toBinaryString method!
	 * Use the main method to test your methods.
	 */

	
	public void printByteBinary(byte b) {
		// We first want to print the bit in the one's place
		
		// Shift b seven bits to the right
		for (int i = 8; i > 0; i--) {
		int b2 = b >> (i - 1);
		// Use the & operator to "mask" the bit in the one's place
		// This can be done by "anding" (&) it with the value of 1
int	b3 =	b2 & 1;
		// Print the result using System.out.print (NOT System.out.println)
		System.out.print(b3);
		//Use this method to print the remaining 7 bits of b
		}
	}
	
	public void printShortBinary(short s) {
		// Create 2 byte variables
		byte b1;
		byte b2;
		// Use bit shifting and masking (&) to save the first
		// 8 bits of s in one byte, and the second 8 bits of
		// s in the other byte
		b1 = (byte) (s >> 8);
		b2 = (byte) (s);
		// Call printByteBinary twice using the two bytes
		// Make sure they are in the correct order
		printByteBinary(b1);
		printByteBinary(b2);
	}
	
	public void printIntBinary(int int1) {
		// Create 2 short variables
		short s1;
		short s2;
		// Use bit shifting and masking (&) to save the first
		// 16 bits of i in one short, and the second 16 bits of
		// i in the other short
		s1 = (short) (int1 >> 8);
		s2 = (short) (int1);
		// Call printShortBinary twice using the two short variables
		// Make sure they are in the correct order
		printShortBinary(s1);
		printShortBinary(s2);

		
	
	}
	
	public void printLongBinary(long l) {
		// Use the same method as before to complete this method
		short s1;
		short s2;
		// Use bit shifting and masking (&) to save the first
		// 16 bits of i in one short, and the second 16 bits of
		// i in the other short
		s1 = (short) (l >> 8);
		s2 = (short) (l);
		// Call printShortBinary twice using the two short variables
		// Make sure they are in the correct order
		printShortBinary(s1);
		printShortBinary(s2);
	}
	
	public static void main(String[] args) {
		// Test your methods here
		BinaryPrinter bp = new BinaryPrinter();
		//bp.printByteBinary((byte)(4));
		//bp.printShortBinary((short)(8));
		//bp.printIntBinary((int)16);
		bp.printLongBinary((long)(32));
	}
}
