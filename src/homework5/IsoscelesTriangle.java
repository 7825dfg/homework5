package homework5;

import java.util.Scanner;

public class IsoscelesTriangle {
	int num2;
	int count = 1;

	void input() {
		Scanner A = new Scanner(System.in);
		System.out.println("이등변삼각형의 높이 입력 : ");
		this.num2 = A.nextInt();
		
		output();
	}

	void output() {
		int bl = num2-1;
		for (int i = 0; i < num2; i++) {
			for (int j = 0; j < bl; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (count*2)-1; k++) {
				System.out.print("*");
			}
			bl--;
			count++;
			System.out.printf("\n");
		}

	}

}
