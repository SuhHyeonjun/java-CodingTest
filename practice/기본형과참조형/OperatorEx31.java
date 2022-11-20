package 기본형과참조형;
public class OperatorEx31 {
	public static void main(String[] args) {
		int dec = 1234;
		int hex = 0xABCDEF;
		int mask = 0xF;
		
		System.out.printf("hex=%X%n", hex);
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);

		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);

		hex = hex >> 4;
		System.out.printf("%X%n", hex &mask);

		hex = hex >> 4;
		System.out.printf("%X%n", hex &mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex &mask);

	}

}
