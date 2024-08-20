package io.github.nguyentaijs.adapter.IteratorEnumeration;

import java.util.ArrayList;
import java.util.List;

public class TestIteratorEnumeration {
	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<>();
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);
		arrList.add(5);

		IteratorEnumeration<Integer> enumAdapter = new IteratorEnumeration<>(arrList.iterator());
		while(enumAdapter.hasMoreElements()) {
			System.out.println(enumAdapter.nextElement());
		}
	}
}
