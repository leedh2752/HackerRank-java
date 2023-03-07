package Introduction;

public class Ex7 {
    public static void main(String[] args) {

        int a = 0;
        int b = 2;
        int c = 10;
        for(int i = 1; i <= c; i++) {
            int j = (int) Math.pow(b, i);
            System.out.print(j + " ");
        }
    }
}
