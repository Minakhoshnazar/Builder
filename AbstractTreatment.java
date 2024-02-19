package treatment;

public abstract class AbstractTreatment implements Treatment {
	
	private String name;
	private Title title = new Untitled();
	
	public AbstractTreatment(String name) {
		this.name = name;
	}

	@Override
	public String announce() {
		
		return title.abbreviation() + genderPrefix() + name;
	}
	
	protected abstract String genderPrefix();
	
	@Override
	public void setTitle(Title title) {
		this.title = new TitleComposite(this.title, title);
	}

}
