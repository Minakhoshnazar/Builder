package treatment.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import treatment.TreatmentBuilder;
import treatment.Treatment;

class TestTreatment {

	@Test
	void manTreatment() {
		TreatmentBuilder builder = new TreatmentBuilder();
		Treatment t = builder.manCalled("Giovanni").build();
		assertEquals("Mr. Giovanni", t.announce());
	}
	
	@Test
	void womanTreatment() {
		TreatmentBuilder builder = new TreatmentBuilder();
		Treatment t = builder.womanCalled("Giovanna").build();
		assertEquals("Mrs. Giovanna", t.announce());
	}
	
	@Test
	void womanDoctorTreatment() {
		TreatmentBuilder builder = new TreatmentBuilder();
		Treatment t = builder.womanCalled("Giovanna").thatIsDoctor().build();
		assertEquals("Dr. Mrs. Giovanna", t.announce());
	}
	
	@Test
	void manCaptainTreatment() {
		TreatmentBuilder builder = new TreatmentBuilder();
		Treatment t = builder.manCalled("Giovanni").thatIsCaptain().build();
		assertEquals("Cap. Mr. Giovanni", t.announce());
	}
	
	@Test
	void manDoctorCaptainTreatment() {
		TreatmentBuilder builder = new TreatmentBuilder();
		Treatment t = builder.manCalled("John").thatIsCaptain().thatIsDoctor().build();
		assertEquals("Cap. Dr. Mr. John", t.announce());
	}
	
	@Test
	void manDoctorCaptainTreatmentFromPlace() {
		TreatmentBuilder builder = new TreatmentBuilder();
		Treatment t = builder.manCalled("John").thatIsCaptain().thatIsDoctor().from("Trento").build();
		assertEquals("Cap. Dr. Mr. John of Trento", t.announce());
	}

}
