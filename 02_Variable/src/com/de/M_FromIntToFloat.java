package com.de;

public class M_FromIntToFloat {
	
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2; // int num2�� float�� ����ȯ
		num2 = (int)num3; // num2�� ���� ���� float num3�� �ٽ� num2�� ����ȯ
		
		int result = num1 - num2; // �̷л����δ� ���� ���� �� ���̴� 0�� ���;� ������ -4�� ����. => ���е� �ս��� �߻��ϱ� ����
		// why? 123456780�� 23��Ʈ�� ǥ�� �� �� ���� ������ �ٻ�ġ�� ��ȯ��. => ���е� �ս��� �߻�
		
		System.out.println(result);
		
		//---------------------------
		int num4 = 123456780;
		int num5 = 123456780;
		
		double num6 = num5; // int num5�� double�� ����ȯ
		num5 = (int)num6;
		
		int result2 = num4 - num5;
		System.out.println(result2); // int�� ũ��� 32��Ʈ �̹Ƿ� double�� ���� 52��Ʈ���ٴ� �۱� ������ ��� int ���̶� �����ϰ� ����ȯ ����
	}

}
