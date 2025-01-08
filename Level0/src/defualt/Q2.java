package defualt;

import java.util.Scanner;

public class Q2 {
	
	// 입력예시
	// 280
	// 485
	
	// 출력 예시
	// 45

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int sum_angle = angle1 + angle2;
        System.out.println(sum_angle%360);

	}

}
