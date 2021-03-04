public class Twowheeler extends Vehicle{
private Boolean kickStartAvailable;

public Boolean getKickStartAvailable() {
	return kickStartAvailable;
}

public void setKickStartAvailable(Boolean kickStartAvailable) {
	this.kickStartAvailable = kickStartAvailable;
}

public Twowheeler() {
	super();
}

public Twowheeler(Boolean kickStartAvailable) {
	super();
	this.kickStartAvailable = kickStartAvailable;
}

public void displayDetailInfo()
{
	System.out.println(kickStartAvailable);
}


}