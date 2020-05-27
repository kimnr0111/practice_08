package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {
	
	public static void main(String[] args) {
		
		String friend;
		String[] friendArray = new String[3];
		String[] infoArray;
		String[] name = new String[3];
		String[] hp = new String[3];
		String[] school = new String[3];


		Scanner sc = new Scanner(System.in);
		System.out.println("친구를 3명 등록해 주세요");
		for(int i=0;i<friendArray.length;i++) {
			friendArray[i] = sc.nextLine();
			infoArray = friendArray[i].split(" ");
			name[i] = infoArray[0];
			hp[i] = infoArray[1];
			school[i] = infoArray[2];
		}
		Friend f1 = new Friend(name[0], hp[0], school[0]);
		Friend f2 = new Friend(name[1], hp[1], school[1]);
		Friend f3 = new Friend(name[2], hp[2], school[2]);
		f1.showInfo();
		f2.showInfo();
		f3.showInfo();
		
	}

}
