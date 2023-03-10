public class z1 {
    public static void main(String[] args) {
        String s1 = new String();
        String s2 = new String("Giddy up!");

        char[] ca = {'a','b','c'};
			
        String s3 = new String(ca);
        String s4 = new String(ca, 1, 2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}