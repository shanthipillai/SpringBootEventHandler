package testing.springboot.evenhandler.api.event;

import org.springframework.context.ApplicationEvent;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatientDischargeEvent extends ApplicationEvent{
	private String patientID;
	private String patientName;
	public PatientDischargeEvent(Object source,String patientID, String patientName) {
		super(source);
		this.patientID=patientID;
		this.patientName=patientName;
		// TODO Auto-generated constructor stub
	}

}
