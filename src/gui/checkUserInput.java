package gui;

import PeriodicTable.PeriodicTable;
public class checkUserInput{
	public static boolean isInt(String input) {
		int test = 0;
		try {
			test = Integer.valueOf(input);
		}catch(Exception e) {return false;}
		return test>0 && test<=PeriodicTable.length;
	}
	public static boolean isEng(String input) {
		input = input.toLowerCase();
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)>'z' || input.charAt(i)<'a')
				return false;
		}
		return true;
	}
	public static boolean isThai(String input) {
		input = input.toLowerCase();
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)<='z' && input.charAt(i)>='a')
				return false;
		}
		return true;
	}
}
