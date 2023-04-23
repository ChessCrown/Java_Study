package ch02.sec02;

public class ByteExample {

	public static void main(String[] args) {
		byte ver1 = -128;
		byte ver2 = -38;
		byte ver3 = 0;
		byte ver4 = 30;
		byte ver5 = 127;
		//byte ver6 = 128; 컴파일에러 (Type mismtch: cannot
		//covert from int to byte) 바이트 허용범위 초과

		
		System.out.println(ver1);
		System.out.println(ver2);
		System.out.println(ver3);
		System.out.println(ver4);
		System.out.println(ver5);
		//System.out.println(ver6);
	}

}
