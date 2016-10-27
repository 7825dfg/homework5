package homework5;

import java.util.Scanner;

public class Diamond {
	int num2;
	int count = 1;

	void input() {
		Scanner A = new Scanner(System.in);
		System.out.println("다이아몬드의 크기 입력 : ");
		this.num2 = A.nextInt();

		output();
	}

	void output() {
		int bl = num2 - 1;
		for (int i = 0; i < num2; i++) {
			for (int j = 0; j < bl; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (count * 2) - 1; k++) {
				System.out.print("*");
			}

			bl--;
			count++;
			System.out.printf("\n");
		}
		count -= 2;
		bl += 2;
		for (int i = 0; i < num2; i++) {
			for (int j = 0; j < bl; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (count * 2) - 1; k++) {
				System.out.print("*");
			}
			bl++;
			count--;
			System.out.printf("\n");
		}

	}

}
