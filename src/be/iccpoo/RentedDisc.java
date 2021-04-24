package be.iccpoo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import javax.print.DocFlavor.STRING;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class RentedDisc extends DisqueRental {
	
	private int dureeLocation;

	/**
	 * @param username
	 * @param prixLocation
	 * @param dureeLocation
	 */
	    public RentedDisc(String username, float prixLocation, int dureeLocation) {
		   super(username, prixLocation);
		   this.dureeLocation = dureeLocation;
	}
	
	    public float calculerPrixTotal () throws InvalidDurationException {
		   float calculerPrixTotal;
		   
		if (dureeLocation==0) {     
			 calculerPrixTotal= getPrixLocation() *DEFAULT_DURATION;
		}	 
		 
		else if (dureeLocation<0) {
			throw new InvalidDurationException();
			
		}else { 
			calculerPrixTotal=getPrixLocation()*dureeLocation;
	}
		return calculerPrixTotal;
	
	}
	 
	

	/**
	 * @return the dureeLocation
	 */
	public int getDureeLocation() {
		return dureeLocation;
	}

	/**
	 * @param dureeLocation the dureeLocation to set
	 */
	public void setDureeLocation(int dureeLocation) {
		this.dureeLocation = dureeLocation;
	
	}
	public static void serialiser() {
		XStream xstream = new XStream(new DomDriver());
		
		
		//Configurer XStream
		
		xstream.alias("RentedD",RentedDisc.class);
		xstream.useAttributeFor(RentedDisc.class,"username");
		xstream.aliasField("DL", RentedDisc.class, "dureeLocation");
		xstream.aliasField("PL",DisqueRental.class, "prixLocation");
		
		//----Conversion de l'objet data de type données en XML :----
		String xml=xstream.toXML(RentedDisc.class);
		
		//----Affichage  du résultat de la conversion XML :----
			System.out.println(xml);
			
		//----Sauvegarde sur le fichier donnée.xml de la conversion XML :----
			
			try {
				File filename = new File("RentedDisc.xml");
				
		//----On applatit l'objet :----
				FileOutputStream fos=new FileOutputStream(filename);
				
		//----On crée le fichier XML :----
				
			xstream.toXML(RentedDisc.class,fos);
			fos.close();
			
			}catch(FileNotFoundException e) {
				e.printStackTrace();
				
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}	
	
	 public static void deserialiser()	{
	 	  	RentedDisc newData= null;
	 	  	
	 	  	XStream xtream = new XStream(new DomDriver());
	 	  	
	 	  	try {
	 	  		//----Redirection du fichier RenteDisc.xml vers un flux d'entrée
	 	  		//----fichier ----
	 	  		
	 	  		FileInputStream fis = new FileInputStream(new File("RentedDisc.XML"));
	 	  		
	 	  		
	 	  		//----Déserialisation du fichier "Rented Disc.xml" vers un objet nouveau data /----
	 	  		
	 	  		newData=(RentedDisc)xtream.fromXML(fis);
	 	  		fis.close();
	 	  	}catch (FileNotFoundException e) {
	 	  		e.printStackTrace();
	 	  	}catch(IOException e) {
	 	  		e.printStackTrace();
	 	  		
	 	  		
	 	  		
	 	  	}
	 	  	
	 	  	
	 	  	
		   	 
	    	   
	      }

}
     


    	  
      
