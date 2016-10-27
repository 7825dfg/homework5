package homework5;

import java.util.Scanner;

public class TriangleStar {
	int num1, num2;
	int count = 1;

	void input() {
		Scanner A = new Scanner(System.in);
		System.out.println("직각삼각형의 왼쪽여백과 높이 입력 : ");
		this.num1 = A.nextInt();
		this.num2 = A.nextInt();

		output();
	}

	void output() {
		int add = num1 + num2 - 1;
		for (int i = 0; i < num2; i++) {
			for (int j = 0; j < add; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < count; k++) {
				System.out.print("*");
			}
			add--;
			count++;
			System.out.printf("\n");
		}

	}
}
