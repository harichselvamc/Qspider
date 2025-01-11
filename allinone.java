class allinone {
    public static void main(String[] args) {
        System.out.println("Accessing Static Variables from Other Files:");

        System.out.println("ByteExample.a: " + ByteExample.a);
        System.out.println("ShortExample.a: " + ShortExample.a);
        System.out.println("IntExample.a: " + IntExample.a);
        System.out.println("LongExample.a: " + LongExample.a);
        System.out.println("FloatExample.a: " + FloatExample.a);
        System.out.println("DoubleExample.a: " + DoubleExample.a);
        System.out.println("CharExample.a: " + CharExample.a);
        System.out.println("BooleanExample.a: " + BooleanExample.a);
        System.out.println("StringExample.a: " + StringExample.a);

        System.out.println("Successfully accessed all static variables!");
    }
}
