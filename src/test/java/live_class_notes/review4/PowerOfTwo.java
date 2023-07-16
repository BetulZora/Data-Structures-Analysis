package live_class_notes.review4;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        // write base condition
        if (n == 1) return true;
        if(n%2 != 0 || n<=0) return false;
        return isPowerOfTwo((n / 2));

    }
}
