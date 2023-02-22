package study;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Study {
	
	public static final String SHOP_SHOHIN_00 = "バナナ";
	public static final String SHOP_SHOHIN_01 = "牛乳";
	public static final String SHOP_SHOHIN_02 = "豚肉";
	public static final String SHOP_SHOHIN_03 = "コロッケ";

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<String> shohinList = new ArrayList<String>();
		shohinList.add(SHOP_SHOHIN_00);
		shohinList.add(SHOP_SHOHIN_01);
		shohinList.add(SHOP_SHOHIN_02);
		shohinList.add(SHOP_SHOHIN_03);
		
		
//		LinkedHashMapクラスをMapインターフェース型の変数shopMapにインスタンス化して保持。
//		shopMapにputメソッドでshohinListに保持されている値をキーとして代入。また新たに商品の金額もInt型で代入。
//		shopMap.put(shohinList.get(1), 180);の場合、shohinList.get(1)の牛乳をキー、その商品を180円として代入している。
		LinkedHashMap<String, Integer> shopMap = new LinkedHashMap<String, Integer>();
		shopMap.put(shohinList.get(0), 125);
		shopMap.put(shohinList.get(1), 180);
		shopMap.put(shohinList.get(2), 350);
		shopMap.put(shohinList.get(3), 100);
		
		for (Map.Entry<String, Integer> entry : shopMap.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue() + "円になります！");
		}
		
	}

}
