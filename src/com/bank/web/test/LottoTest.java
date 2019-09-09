package com.bank.web.test;

import java.util.Random;

public class LottoTest {
	public static void main(String[] args) {
		String result = "";
		int[] arr = new int[6];
		for(int i=0;i<arr.length; i++) {
			arr[i] = new Random().nextInt(45)+1;
		}
		int t = 0;
	
		
		for(int i=0;i<arr.length; i++) {
			result += (i!=arr.length-1)? arr[i]+",":arr[i];
		}
		System.out.println("=============");
		System.out.println(result);
	}
}
