package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		//코드를 작성하세요
		String[] numArray = numLine.split(" "); //입력받은 문자열을 공백으로 구분하여 배열에 저장
		for(int i=0;i<numArray.length;i++)  {	//numArray 배열의 크기만큼 반복
			int num = Integer.parseInt(numArray[i]); //저장된 문자열을 Int로 변환한 뒤 sum에 더해준다
			sum = sum + num;
		}
		
		
		
		System.out.println("합:" + sum);
		
		sc.close();
	}

}
