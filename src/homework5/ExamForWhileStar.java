package homework5;

import java.util.Scanner;

public class ExamForWhileStar {

	public static void main(String[] args) {

		while (true) {

			String ch;

			Scanner A = new Scanner(System.in);
			System.out.println("1. 정사각형 별찍기");
			System.out.println("2. 직각삼각 별찍기");
			System.out.println("3. 이등변삼각형 별찍기");
			System.out.println("4. 다이아몬드 별찍기");
			System.out.println("5. 종료하기");
			System.out.println("원하는 메뉴는 >>>>");
			ch = A.next();

			if (ch.equals("1")) {
				new Square().input();
			} else if (ch.equals("2")) {
				new TriangleStar().input();
			} else if (ch.equals("3")) {
				new IsoscelesTriangle().input();
			} else if (ch.equals("4")) {
				new Diamond().input();
			} else if (ch.equals("5")) {
				System.exit(0);
			} else {
				System.out.println("다시 입력하세요");
			}
		}
	}

}