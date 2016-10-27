package homework5;

import java.util.Scanner;

public class Square {
	int num;

	void input() {

		Scanner A = new Scanner(System.in);
		System.out.println("정사각형 크기 입력 : ");
		this.num = A.nextInt();
		output();
	}

	void output() {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
					System.out.print("*");
			}
			System.out.println("");
		}
		System.out.printf("\n");

	}
}
