package week1.day1.Assignment1;

public class Mobile1 {
	public void makeCall1(String mobileModel,float mobileWeight) {
		System.out.println("MobileModel : "+mobileModel +" ,MobileWeight : "+ mobileWeight);
		}

		public void sendMsg(boolean isFullCharged,int mobileCost) {
			
			System.out.println("Is Full Charged: "+isFullCharged);
			System.out.println("Mobile Cost: "+mobileCost);
		}
		public static void main(String[] args) {
			Mobile1 samsung=new Mobile1();
			samsung.makeCall1("Apple",100.5f);
			samsung.sendMsg(true,50000);
			System.out.println("This is my mobile");

		}

}
