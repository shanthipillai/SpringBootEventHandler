package testing.springboot.evenhandler.api.handler;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import testing.springboot.evenhandler.api.event.PatientDischargeEvent;

@Component
@Slf4j
public class BillingServiceEventListener {
	@Async
	@EventListener
	
	public void billiingEventListener(PatientDischargeEvent event) {
		System.out.println("Billing Service has been settled for the patient" + event.getPatientName() + "with ID"
				+ event.getPatientID()+" : "+Thread.currentThread().getName());
	}
}
