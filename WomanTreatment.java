package treatment;

public class WomanTreatment extends AbstractTreatment {

	public WomanTreatment(String name) {
		super(name);
		
	}

	@Override
	protected String genderPrefix() {
		
		return "Mrs. ";
	}

}
