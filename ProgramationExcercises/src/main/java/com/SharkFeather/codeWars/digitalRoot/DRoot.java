package com.SharkFeather.codeWars.digitalRoot;

public class DRoot {
	  public static int digital_root(int n) {
		  /*
		   * My Solution 
		  String nString= String.valueOf(n);
		  char[] nCharArr = nString.toCharArray();
		  int dRoot=0;
		   do{
			  for(char ch : nCharArr) {
				  dRoot=ch-'0'+dRoot;
			  }
			  if(dRoot<10) {
				  return dRoot;
			  }
			  nString = String.valueOf(dRoot);
			  nCharArr = nString.toCharArray();
			  dRoot=0;
		  }while(true);
		*/
		  while(n>9) {
			  n=n/10+n%10;
		  }
		  return(n);
	  }
}