
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] data = {3,1,2,7,5};
		for (int i = 0;i < data.length;i++) {
			System.out.print(data[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < data.length; i++) {
            for (int j = data.length - 1; j > i; j--) {         
                if(data[j-1] > data[j]){
                  int box = data[j-1];
                  data[j-1] = data[j];
                  data[j] = box;
                }
            }
		}
		
		
		for (int i = 0;i < data.length;i++) {
		System.out.print(data[i] + " ");
		}
	}
}
