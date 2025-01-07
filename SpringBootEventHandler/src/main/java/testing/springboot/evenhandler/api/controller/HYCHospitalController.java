package testing.springboot.evenhandler.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import testing.springboot.evenhandler.api.dto.PatientDischargeDetails;
import testing.springboot.evenhandler.api.service.PatientDischargeService;

@RestController
@RequestMapping("/hychospitals/patient")
public class HYCHospitalController {

	@Autowired
private	PatientDischargeService dischargeService;
	
	@PostMapping("/discharge")
	
	public String initiateDischarge(@RequestBody PatientDischargeDetails request)
	{
		return dischargeService.dischargePatient(request.getPatientID(),request.getPatientName());
	}
}
