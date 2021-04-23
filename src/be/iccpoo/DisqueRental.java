package be.iccpoo;

public abstract class DisqueRental extends Disque implements Rentable {
	

private String username;
private float prixLocation;
/**
 * @param username
 * @param prixLocation
 */
public DisqueRental(String username, float prixLocation) {
	super();
	this.username = username;
	this.prixLocation = prixLocation;
}
/**
 * @return the username
 */
public String getUsername() {
	return username;
}
/**
 * @param username the username to set
 */
    public void rent(String name) {
	this.username = name ;
}
/**
 * @return the prixLocation
 */
public float getPrixLocation() {
	return prixLocation;
}
/**
 * @param prixLocation the prixLocation to set
 */
public void setPrixLocation(float prixLocation) {
	this.prixLocation = prixLocation;
}

@Override
public String toString() {
	return "DisqueRental [username=" + username + ", prixLocation=" + prixLocation + "]";
}


}
