package assignments_6;

public class Question_5 {

	public static void main(String[] args) {

//		1111111
//		1111122
//		1111333
//		1114444
//		1155555
//		1666666
//		7777777
		
		
		int line = 7;

		for (int i = 1; i <= line; i++) {
			for (int j = 0; j < line-i; j++) {
				System.out.print("1");
			}
			
			for (int j = i; j >0 ;j--) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
