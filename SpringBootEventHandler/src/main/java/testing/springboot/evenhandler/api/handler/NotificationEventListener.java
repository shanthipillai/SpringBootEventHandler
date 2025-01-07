package testing.springboot.evenhandler.api.handler;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import testing.springboot.evenhandler.api.event.PatientDischargeEvent;

@Component
public class NotificationEventListener {
	@Async
	@EventListener
	
	public void notificationEventListener(PatientDischargeEvent event) {
		System.out.println("Notification has been sent to the patient" + event.getPatientName() + "with ID"
				+ event.getPatientID() +" : "+Thread.currentThread().getName());
	}
}
