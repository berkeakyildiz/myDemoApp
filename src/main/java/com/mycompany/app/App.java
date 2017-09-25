package com.mycompany.app;
import java.util.*;

public class App {
	public static boolean append_search(ArrayList<Integer> array1, ArrayList<Integer> array2, int e) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		if(array1 == null && array2 == null)
			return false;
		if(array1 != null) {
			for(int x : array1)
				array.add(x);
		}
		if(array2 != null || !array2.isEmpty()) {
			for(int y : array2)
				array.add(y);
		}
				
		if(array != null || !array.isEmpty()) {
			for(int a : array) {
			if(a==e)
				return true;
			}
		}
		return false;
	}
public static void main(String[] args) {
        }


}
