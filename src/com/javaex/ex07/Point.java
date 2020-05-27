package com.javaex.ex07;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//equals() 메소드를 작성하세요.
	
	public boolean equals(Point p) {
		//x값이 같을경우 true, 다를경우 false 출력
		if(this.x == p.x) {
			return true;
		} else {
			return false;
		}
		
	}

	
}
