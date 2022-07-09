package org.type;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Parameter {
	private void m1(int i) {
		System.out.println(i);
	}

	private void m2(int a, int b) {
		System.out.println(a + "," + b);
	}

	private void m3(LinkedList<Integer> l) {
		System.out.println(l);

	}

	private void m4(List<Integer> g) {
		System.out.println(g);

	}

	public static void main(String[] args) {
		Parameter er = new Parameter();
		er.m1(22);

		er.m2(98, 54);

		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(78);
		l.add(65);
		l.add(33);
		er.m3(l);

		List<Integer> g = new ArrayList<Integer>();
		g.add(14);
		g.add(12);
		g.add(76);

		er.m4(g);

	}

}
