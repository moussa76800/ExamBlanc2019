package be.iccpoo;

import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.print.DocFlavor.STRING;

public class TestAppli {

	public static void main(String[] args)  {
		       
		    	   
		       
		     RentedDisc rDisc=  new RentedDisc ("Bertrand", (float) 2.0, 10);
		     RentedDisc.serialiser();
		     
		     
	       
		      
		       
		       
		       
		       
		    
	    	   
		
             RentedDisc rentedisc=new RentedDisc("moussa", (float) 3.5, 10);
             RentedDisc rentedisc1=new RentedDisc("youssef", (float) 2.5, 0);
             RentedDisc rentedisc2=new RentedDisc("youssef", (float) 2.5,-4 );
             
		try {
			System.out.println(rentedisc.calculerPrixTotal());
			System.out.println(rentedisc1.calculerPrixTotal());
			System.out.println(rentedisc2.calculerPrixTotal());
			
		} catch (InvalidDurationException e) {
			e.printStackTrace();
			
		}finally {
			System.out.println("---veuillez rev?rifier la dur?e de location !---");
		}
		
	}

}
