package treatment;

public class TreatmentBuilder {
	
	Treatment instance;
	

	public TreatmentAfterGender manCalled(String name) {
		instance = new ManTreatment(name);
		 return new TreatmentAfterGender();
	}
		
	public TreatmentAfterGender womanCalled(String name) {
		instance = new WomanTreatment(name);
		 return new TreatmentAfterGender();
	}
		
	
	  public class TreatmentAfterGender {
		
		public TreatmentAfterGender thatIsDoctor() {
			instance.setTitle(new DoctorTitle());
			return this;
		}
		
		public Treatment build() {
			return instance;
		}
		
		public TreatmentAfterGender thatIsCaptain() {
			instance.setTitle(new CaptainTreatment());
			return this;
		}

		public TreatmentAfterGender from(String place) {
			instance = new PlaceProxy(instance, place);
			return this;
		}
		
	}




}
