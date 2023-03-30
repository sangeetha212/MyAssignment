package week1.day2.Assignment2;

public class Tab {
	
	public int tabPrice(int tabPrice) {
		// TODO Auto-generated method stub
		return tabPrice;
	}
	
	private String tabBrand(String brandName) {
		// TODO Auto-generated method stub
		return brandName;
		

	}

	public static void main(String[] args) {
		
		Tab model=new Tab();
		String tabname = model.tabBrand("Apple");
		String tabname1=model.tabBrand("Samsung");
		int cost = model.tabPrice(15000);
		int cost1 =model.tabPrice(10000);
		
		System.out.println("Tab Brand : "	+ tabname + "\n" + "Tab Price : "+ cost);
		
		System.out.println("Tab Brand : "	+ tabname1 + "\n" + "Tab Price : "+ cost1);		
	}		
}
