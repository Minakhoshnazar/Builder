package treatment;

public class ManTreatment extends AbstractTreatment {

	public ManTreatment(String name) {
		super(name);
		
	}

	@Override
	protected String genderPrefix() {
		
		return "Mr. ";
	}

}
