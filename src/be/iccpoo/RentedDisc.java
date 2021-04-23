package be.iccpoo;

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
}
