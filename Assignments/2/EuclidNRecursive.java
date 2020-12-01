public class EuclidNRecursive {

    // non-recursive implementationx
    public static int gcd(int p, int q) {
        while(q != 0){
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }

    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        int d  = gcd(p, q);
        System.out.println("gcd(" + p + ", " + q + ") = " + d);
    }
}