package be.iccpoo;

public class TestAppli {

	public static void main(String[] args) {
		
             RentedDisc rentedisc=new RentedDisc("moussa", (float) 3.5, 10);
             RentedDisc rentedisc1=new RentedDisc("youssef", (float) 2.5, 0);
             RentedDisc rentedisc2=new RentedDisc("youssef", (float) 2.5,-4 );
             
//		try {
			System.out.println(rentedisc.calculerPrixTotal());
			System.out.println(rentedisc1.calculerPrixTotal());
			System.out.println(rentedisc2.calculerPrixTotal());
			
//		} catch (InvalidDurationException e) {
//			e.printStackTrace();
//			
//		}finally {
//			System.out.println("---veuillez revérifier la durée de location !---");
//		}
		
	}

}
