package testing.springboot.evenhandler.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import testing.springboot.evenhandler.api.event.PatientDischargeEvent;

@Service
@Slf4j
public class PatientDischargeService {

	@Autowired
	
	ApplicationEventPublisher eventPublisher;
	public String dischargePatient(String patientID, String patientName) {
		log.info("Patient Discharge Process has been initiated"+patientName);
		eventPublisher.publishEvent(new PatientDischargeEvent(this, patientID, patientName));
		log.info("Patient discharge process completed"+patientName);
		return "Patient Name"+patientName+"with ID"+patientID;
		// TODO Auto-generated method stub
		
	}

}
