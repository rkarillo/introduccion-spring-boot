package services;

import org.springframework.stereotype.Service;

@Service
public class BusinessService {
	
	public String getSaludo() {
		
		return "Desde el servicio: BusinessService";
	}

}
