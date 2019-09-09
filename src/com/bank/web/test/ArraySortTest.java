package com.bank.web.test;

import java.util.Arrays;
import java.util.Random;

public class ArraySortTest {
	int su[];
	Random r;
	
	public ArraySortTest() {
		su = new int[5];
		r = new Random();
	}
	
	public void printArray(){
		System.out.print("[");
		for(int i=0; i<su.length; i++){
			System.out.print(su[i]);
			if(i<su.length-1)
				System.out.print(", ");
		}
		System.out.println("]");
	}
	
	public void inputArray(){
		for (int i = 0; i < su.length; i++) {
			su[i] = r.nextInt(100) + 1; // 0~99 + 1 ----> 1~100
		}
	}
	
	public void sortArray(){
		int tmp;
		for(int i=0; i<su.length-1; i++){
			for(int j=i+1; j<su.length; j++){
				if(su[i]>su[j]){
					this.swap(i,j);
				}
			}
		}
	}
	
	public void swap(int i,int j){
		int tmp;
		tmp = su[i];
		su[i] = su[j];
		su[j] = tmp;
	}
	
	public static void main(String[] args) {
		ArraySortTest ast = new ArraySortTest();
		ast.inputArray();
		ast.printArray();
		
		ast.sortArray();
		ast.printArray();
		
		int su[]={23,34,11,8,102,33};
		Arrays.sort(su);
		
		for(int i =0; i<su.length; i++){
			System.out.println(su[i]);
		}
		
		String names[]={"홍길동","김유신","강감찬","유관순"};
		Arrays.sort(names);
		
		for(int i =0; i<names.length; i++){
			System.out.println(names[i]);
		}
	}
}
