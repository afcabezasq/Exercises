package com.SharkFeather.codeWars.nextPerfectRoot;



public class NumberFun {
	public static long digitalRoot(long sq) {		
		while(sq>9) {
		  sq=sq/10+sq%10;
		}
		return sq;
	}
	 public static long findNextSquare(long sq) {
		 long num=1;
		 long digRoot=digitalRoot(sq);
		 if(digRoot==1||digRoot==4||digRoot==7||digRoot==9) {
			num=(long) Math.sqrt(sq);
			if(sq%num>0) {
				return -1;
			}
			num=num+1;
			num=num*num;
			return num;
			
		 }else {
			 return -1;
		 }
	}
}
