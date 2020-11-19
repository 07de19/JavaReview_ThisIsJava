package com.de;

public class B_VariableScopeExample {
	
	public static void main(String[] args) {
		
		int v1 = 15;
		if (v1 > 10) {
			int v2 = v1 - 10;
		}
		//int v3 = v1 + v2 + 5; // 컴파일 에러가 생김 v2는 if문 제어문 안에서만 사용가능한 지역변수이기 때문
	}

}
