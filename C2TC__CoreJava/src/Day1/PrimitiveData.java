package Day1;

public class PrimitiveData {
	

    public static void main(String[] args) {

        byte byteMax = 127;
        byte byteMin = -128;

        System.out.println("Min range of byte is " +
                byteMin + "\nMax range of byte is " + byteMax);

        short shortMax = 32767;
        short shortMin = -32768;
        System.out.println("\nMin range of short is " +
                shortMin + "\nMax range of short is " + shortMax);

        int maxInt = 2147483647;
        int minInt = -2147483648;
        System.out.println("\nMin range of int is " +
                minInt + "\nMax range of int is " + maxInt);

        long maxLong = 9223372036854775807L;
        long minLong = -9223372036854775808L;

        System.out.println("\nMin range of long is " +
                minLong + "\nMax range of long is " + maxLong);

        float f = 3234.141243278345f;
        double d = 3456.14124512345678902345678914d;
        System.out.println("\nfloat value is " + f + " \ndouble value is " + d);

        boolean flag = false;
        System.out.println("\nboolean value is " + flag);
    }
}
