package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		//equals메소드는 모든 클래스의 최상위 클래스인 Object클래스에 있는 메소드라서 자동으로 상속받아 사용할 수 있다.
		//== = 주소값비교
		//equals = 정의한 값 비교 재정의해서 사용
		System.out.println(p1 == p2);//false
		System.out.println(p2 == p3);//false
		System.out.println(p3 == p4);//false
		System.out.println(p4 == p1);//true	
		System.out.println(p1.equals(p2));//false
		System.out.println(p4.equals(p1));//true
	}

}


