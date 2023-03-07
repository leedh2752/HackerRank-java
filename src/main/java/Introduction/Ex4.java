package Introduction;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
    /*
     nextInt() 메서드 바로 다음에 nextLine() 메서드를 사용하는 경우 nextInt()는 정수 토큰을 읽습니다.
     이 때문에 정수 입력의 해당 행에 대한 마지막 개행 문자는 여전히 입력 버퍼에서 대기 중이며 다음 nextLine()은 정수 행의 나머지 부분(비어 있음)을 읽게 됩니다.
     */
}
