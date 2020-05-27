package com.javaex.ex03;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//toString()을 작성 하세요
	
	public String toString() {
		//System.out.println("[포인트] x:" + x + ", y:" + y + "입니다."); 두 가지 방법으로 가능
		//return "";
		return "[포인트] x:" + x + ", y:" + y + "입니다.";
	}

}
