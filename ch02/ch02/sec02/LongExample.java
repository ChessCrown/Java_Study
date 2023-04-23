package ch02.sec02;

public class LongExample {

	public static void main(String[] args) {
		long ver1 = 10;
		long ver2 = 20L;
		//long ver3 = 10000000000;//컴파일러는 int로 간주하기때문에 에러발생
		long ver4 = 10000000000L;
		
		System.out.println(ver1);
		System.out.println(ver2);
		System.out.println(ver4);

	}

}
