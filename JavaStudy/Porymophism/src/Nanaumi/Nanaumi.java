package Nanaumi;

import interfaces.Interface;

public class Nanaumi implements Interface {
	
	private String name;
	private String date;
	
	public Nanaumi (String n, String yyyyMM) {
		this.name = n;
		this.date = yyyyMM;
	}
	
	private void submitOrder (final int shoriFlg) {
		String nameAnd = this.name + ",";
		if (shoriFlg == 0) {
			System.out.println(nameAnd + this.date + "の勤務表を提出しました。");
		}	else if (shoriFlg == 1) {
			System.out.println(nameAnd + this.date + "の交通費も出しました。");
		}	else {
			System.out.println(nameAnd + "本当はまだ何も出してません");
		}
		
	}
 
	@Override
	public void daseyaKinmuhyo() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void daseyaKotsuhi() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void goToSevenEleven() {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
}
