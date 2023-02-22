package study;

public class Task extends Calculator {
	
	public void doTask() {
		int plus_a = super.plus(10);
		System.out.println("plusメソッドの引数が一つの場合" + plus_a);
		
		int plus_b = super.plus(11, 19);
		System.out.println("plusメソッドの引数が二つの場合" + plus_b);
		
		int plus_c = super.plus(11, 19, 30);
		System.out.println("plusメソッドの引数が三つの場合" + plus_c);
	}
}
