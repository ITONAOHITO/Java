package check;

import constants.Constants;

public class Check {
	
	private String firstName = "Ito";
	private String lastName = "Naohito";
	
	private void printName(String firstName, String lastName) {
		System.out.println("printNameメソッド → " + firstName + lastName);
	}
	
	public static void main(String[] args) {
		
		Check pr = new Check();
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		RobotPet rbp = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		
		pr.printName(pr.firstName, pr.lastName);
		pet.getName();
		pet.getMasterName();
		pet.inrtoduce();
		rbp.getName();
		rbp.getMasterName();
		rbp.introduce();
		
		
		
	}
}
