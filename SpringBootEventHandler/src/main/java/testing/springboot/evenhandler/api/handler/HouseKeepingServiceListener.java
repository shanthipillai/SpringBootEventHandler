package testing.springboot.evenhandler.api.handler;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import testing.springboot.evenhandler.api.event.PatientDischargeEvent;

@Component
public class HouseKeepingServiceListener {

	@Async
	@EventListener
	
	public void houseKeepingEventListener(PatientDischargeEvent event) {
		System.out.println("Patient is deallocated and new patient is updated" + event.getPatientName() + "with ID"
				+ event.getPatientID() +" : "+Thread.currentThread().getName());
	}
}
