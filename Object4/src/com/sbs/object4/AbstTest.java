package com.sbs.object4;

public class AbstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Calc c = new Calc(); Calc2 c2 = new Calc2();
		 * 
		 * System.out.println(c.sum(10, 20)); System.out.println(c2.sum(10, 20));
		 * 
		 * System.out.println(c.multi(10, 20)); System.out.println(c2.multi(10, 20));
		 */

		AbstCls cls = getObj(2);
		printResult(cls, 10, 20);
	}

	public static AbstCls getObj(int a) {
		if (a == 1) {
			return new Calc();
		} else {
			return new Calc2();
		}
	}

	public static void printResult(AbstCls cls, int a, int b) {
		System.out.println(cls.multi(a, b));
	}
}
