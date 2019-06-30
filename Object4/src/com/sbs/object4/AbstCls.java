package com.sbs.object4;

public abstract class AbstCls { //abstract가 하나라도 있는 클래스는 해당 클래스도 'abstract 클래스', 객체화할 수 없고 다른클래스에서 이 클래스를 상속하여 사용
	public int sum(int a, int b) {
		return a + b;
	}
	public abstract int multi(int a, int b);
	public abstract int minus(int a, int b);
	
}
