package io.github.nguyentaijs.adapter.EnumerateToIterator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;

public class TestEnumerationIterator {
	public static void main(String[] args) {

		Integer[] intArr = new Integer[] {1,2,3,4,5,6,7,8};
		Enumeration<Integer> intEnum = Collections.enumeration(Arrays.asList(intArr));

		EnumerationIterator<Integer> interatorAdapter = new EnumerationIterator<>(intEnum);
		while(interatorAdapter.hasNext()) {
			System.out.println(interatorAdapter.next().toString());
		}
	}
	
}
