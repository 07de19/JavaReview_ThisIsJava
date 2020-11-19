package com.de;

public class M_FromIntToFloat {
	
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2; // int num2를 float로 형변환
		num2 = (int)num3; // num2와 같은 값인 float num3를 다시 num2로 형변환
		
		int result = num1 - num2; // 이론상으로는 같은 값을 뺀 것이니 0이 나와야 하지만 -4가 나옴. => 정밀도 손실이 발생하기 때문
		// why? 123456780은 23비트로 표현 할 수 없기 때문에 근사치로 변환됨. => 정밀도 손실이 발생
		
		System.out.println(result);
		
		//---------------------------
		int num4 = 123456780;
		int num5 = 123456780;
		
		double num6 = num5; // int num5를 double로 형변환
		num5 = (int)num6;
		
		int result2 = num4 - num5;
		System.out.println(result2); // int의 크기는 32비트 이므로 double의 가수 52비트보다는 작기 때문에 어떠한 int 값이라도 안전하게 형변환 가능
	}

}
