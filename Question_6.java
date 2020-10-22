package assignments_6;

public class Question_6 {

	public static void main(String[] args) {

//		1
//		2 6
//		3 7 10
//		4 8 11 13
//		5 9 12 14 15

		int line = 5;

		for (int i = 1; i <= line; i++) {
			int temp = i;
			for (int j = 1; j <= i; j++) {

				System.out.print(temp + " ");
				temp += line - j;
			}

			System.out.println();
		}
	}

}
