package Zadaci;

public class SestiZadaatak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int broj =354;
		int x = broj%10;
		int y =  (broj/10)%10;
		int z = (broj/100)%10;
		
		int novi = x*100+y*10+z;
		
		System.out.println("okrenuti broj je:"+novi);

	}

}
