package homework3;

public class ConvertLiterals {

    public static void main(String[] args) {
        byte b1 = 127;
        byte b2 = 127;
        short s1 = 32767;
        short s2 = 32767;
        char c1 = '8';
        char c2 = '8';
        int i1 = 214748364;
        int i2 = 214748364;
        long l1 = 9223372036854775807L;
        long l2 = 9223372036854775807L;
        float f1 = -14.56f;
        float f2 = -14.56f;
        double d1 = 5.578;
        double d2 = 5.578;

        doInt(b1, s1, c1, (int) l2, (int) f2, (int) d1);
        doByte((byte) s1, (byte) c1, (byte) i1, (byte) l1, (byte) f1, (byte) d1);
        doShort(b1, (short) c1, (short) i1, (short) l1, (short) f1, (short) d1);
        doChar((char) b1, (char) s1, (char) i1, (char) l1, (char) f1, (char) d2);
        doLong(b1, s1, i1, (long) f1, (long) d1);
        doFloat(b1, c1, i1, l1, (float) d1);
        doDouble(b1, s1, c1, i1, l1, f1);
    }

    private static void doDouble(byte b1, short s1, char c1, int i1, long l1, float f1) {
        double d2;
        d2 = b1;
        System.out.println(d2);
        d2 = s1;
        System.out.println(d2);
        d2 = c1;
        System.out.println(d2);
        d2 = i1;
        System.out.println(d2);
        d2 = l1;
        System.out.println(d2);
        d2 = f1;
        System.out.println(d2);
    }

    private static void doFloat(byte b1, char c1, int i1, long l1, float d1) {
        float f2;
        f2 = b1;
        System.out.println(f2);
        f2 = 21;
        System.out.println(f2);
        f2 = c1;
        System.out.println(f2);
        f2 = i1;
        System.out.println(f2);
        f2 = l1;
        System.out.println(f2);
        f2 = d1;
        System.out.println(f2);
    }

    private static void doLong(byte b1, short s1, int i1, long f1, long d1) {
        long l2;
        l2 = b1;
        System.out.println(l2);
        l2 = s1;
        System.out.println(l2);
        l2 = i1;
        System.out.println(l2);
        l2 = f1;
        System.out.println(l2);
        l2 = d1;
        System.out.println(l2);
    }

    private static void doChar(char b1, char s1, char i1, char l1, char f1, char d2) {
        char c2;
        c2 = b1;
        System.out.println(c2);
        c2 = s1;
        System.out.println(c2);
        c2 = i1;
        System.out.println(c2);
        c2 = l1;
        System.out.println(c2);
        c2 = f1;
        System.out.println(c2);
        c2 = d2;
        System.out.println(c2);
    }

    private static void doShort(byte b1, short c1, short i1, short l1, short f1, short d1) {
        short s2;
        s2 = b1;
        System.out.println(s2);
        s2 = c1;
        System.out.println(s2);
        s2 = i1;
        System.out.println(s2);
        s2 = l1;
        System.out.println(s2);
        s2 = f1;
        System.out.println(s2);
        s2 = d1;
        System.out.println(s2);
    }

    private static void doByte(byte s1, byte c1, byte i1, byte l1, byte f1, byte d1) {
        byte b2;
        b2 = s1;
        System.out.println(b2);
        b2 = c1;
        System.out.println(b2);
        b2 = i1;
        System.out.println(b2);
        b2 = l1;
        System.out.println(b2);
        b2 = f1;
        System.out.println(b2);
        b2 = d1;
        System.out.println(b2);
    }

    private static void doInt(byte b1, short s1, char c1, int l2, int f2, int d1) {
        int i2;
        i2 = b1;
        System.out.println(i2);
        i2 = s1;
        System.out.println(i2);
        i2 = c1;
        System.out.println(i2);
        i2 = l2;
        System.out.println(i2);
        i2 = f2;
        System.out.println(i2);
        i2 = d1;
        System.out.println(i2);
    }
}