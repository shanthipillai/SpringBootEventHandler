package testing.springboot.evenhandler.api.handler;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import testing.springboot.evenhandler.api.event.PatientDischargeEvent;

@Component
public class MedicalServiceEventListener {

	@Async
	@EventListener

	public void medicalServiceEventListener(PatientDischargeEvent event) {
		System.out.println("Medical Bills are cleared" + event.getPatientName() + "with ID"
				+ event.getPatientID()+" : "+Thread.currentThread().getName());
	}
}
