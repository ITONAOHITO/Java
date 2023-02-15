package study;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String firstName = "Naohito";
		String lastName = "Ito";
		
		System.out.println(getName(firstName, lastName));
		System.out.println();
		
		int [] arr = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		for (int i=0;i<arr.length;i++) {
			isOdd(arr[i]);
		}
		
	}
	
	public static String getName(String firstName, String lastName) {
		return firstName + lastName;
	}

	public static void isOdd(int num) {
		if(num % 2 != 0) {
			System.out.println(num + "は奇数です。");
		}
	}
	
}
