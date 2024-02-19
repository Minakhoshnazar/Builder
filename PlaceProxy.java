package treatment;

public class PlaceProxy implements Treatment{
	
	private Treatment treatment;
	private String place;
	

	public PlaceProxy(Treatment treatment, String place) {
	     this.treatment = treatment;
	     this.place = place;
	     
	}

	@Override
	public String announce() {
		return treatment.announce() + " of" + " " + place;
	}

	@Override
	public void setTitle(Title title) {
		treatment.setTitle(title);
		
	}

}
