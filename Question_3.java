package assignments_6;

public class Question_3 {

	public static void main(String[] args) {

		int line = 7;

		for (int i = 1; i <= line; i++) {

			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			for (int j = i; j <= line; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		for (int i = line - 1; i > 0; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			for (int j = i; j <= line; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
