package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	boolean flag = true;
    	
    	System.out.println("숫자 연산자(+, -, *, /) 숫자 순으로 입력해주세요");
    	
    	while(flag) {
        	System.out.print(">>");
    		String numLine = sc.nextLine();
    		
    		try {
    			if(numLine.equals("/q")) {
        			System.out.println("종료합니다.");
        			flag = false;
        		} else {
        			String[] numArray = numLine.split(" ");
        			int i = Integer.parseInt(numArray[0]);
        			int j = Integer.parseInt(numArray[2]);
        			
        			//switch문
        			switch(numArray[1]) {
        			case "+":
        			{
        				Add result = new Add();
            			result.setValue(i, j);
            			System.out.println(">>" + result.calculate());
            			break;
        			}
        			
        			case "-":
        			{
        				Sub result = new Sub();
            			result.setValue(i, j);
            			System.out.println(">>" + result.calculate());
            			break;
        			}
        			case "*":
        			{
        				Mul result = new Mul();
            			result.setValue(i, j);
            			System.out.println(">>" + result.calculate());
            			break;
        			}
        			case "/":
        			{
        				Div result = new Div();
            			result.setValue(i, j);
            			System.out.println(">>" + result.calculate());
            			break;
        			}
        			}
        			
        			//if문
        			/*
            		if(numArray[1].equals("+")) {
            			Add result = new Add();
            			result.setValue(i, j);
            			System.out.println(">>" + result.calculate());
            		} else if(numArray[1].equals("-")) {
            			Sub result = new Sub();
            			result.setValue(i, j);
            			System.out.println(">>" + result.calculate());
            		} else if(numArray[1].equals("*")) {
            			Mul result = new Mul();
            			result.setValue(i, j);
            			System.out.println(">>" + result.calculate());
            		} else if(numArray[1].equals("/")) {
            			Div result = new Div();
            			result.setValue(i, j);
            			System.out.println(">>" + result.calculate());
            		} else {
            			System.out.println("알 수 없는 연산입니다.");
            		}
            		*/
        		}
    		} catch(Exception e) {
    			System.out.println("숫자 연산자(+, -, *, /) 숫자 순으로 입력해주세요");
    		}
    		
    		
    	}
    	

    }
}
