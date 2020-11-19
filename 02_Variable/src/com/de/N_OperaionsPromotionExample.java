package com.de;

public class N_OperaionsPromotionExample {

	public static void main(String[] args) {
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2; // 연산의 결과가 4byte인 int로 바뀌어서 byte로는 출력되지 않음(피연산자를 4byte 단위로 저장하기 때문)
		
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2; // 연산의 결과가 4byte인 int로 바뀌어서 char로는 출력되지 않음
		int intValue2 =  charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0; // 연산의 결과가 8byte인 double로 바뀌어서 int로는 출력되지 않음(4.0인 피연산자가 있기 때문. 자동으로 double로  타입 변환됨)
		double doubleValue = intValue5 / 4.0; 
		System.out.println(doubleValue);
		
		
		

	}

}
