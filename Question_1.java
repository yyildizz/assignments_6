package assignments_6;

public class Question_1 {

	public static void main(String[] args) {

		int line = 7;

		for (int i = 1; i <= line; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print((j + 1) + " ");
			}
			System.out.println();
		}

		for (int i = line; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				System.out.print((j + 1) + " ");
			}
			System.out.println();
		}

	}

}
