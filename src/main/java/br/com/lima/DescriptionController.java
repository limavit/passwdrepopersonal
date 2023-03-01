package br.com.lima;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DescriptionController {
	
	@RequestMapping(value="/readme", method =  RequestMethod.GET)
	public String howToUse() {
		
		
		return "passwdrepopersonal-production.up.railway.app/list ->  to return all systems. \n"
				+ "passwdrepopersonal-production.up.railway.app/systems/{system}/{user} -> to return password \n";
	}
	
	
	@RequestMapping(value="/list", method =  RequestMethod.GET)
	public String returnList() {
		
		
		return "Active Directory(use 'AD' in PATH PARAMS) \n"
				+ "GTRB24H\n"
				+ "GTRCE\n"
				+ "GTROCOR \n"
				+ "GOSAT \n"
				+ "GTR24HDN \n"
				+ "INDCORP\n"
				+ "PORTALEC";
		
	}
	@RequestMapping(value="/systems/{system}/{user}", method =  RequestMethod.GET)
	public String returnId(@PathVariable(value = "system") String system, @PathVariable(value = "user") String user) {
		
		if (system.toUpperCase().equals("GTRB24H") == true && user.toUpperCase().equals("TBN01372") == true) {
			return "Vi1dolar+1009";
									
		}
		if (system.toUpperCase().equals("GTRCE") == true && user.toUpperCase().equals("TBN01372") == true) {
			return "Vi%998378884+01";
									
		}
		if (system.toUpperCase().equals("GTROCOR") == true && user.toUpperCase().equals("TBN01372") == true) {
			return "Vi1dolar+1009";
									
		}
		if (system.toUpperCase().equals("GOSAT") == true && user.toUpperCase().equals("TBN01372") == true) {
			return "Vi1dolar+1012";
									
		}
		if (system.toUpperCase().equals("SVI")  == true && user.toUpperCase().equals("TBN01372") == true) {
			return "Vi1dolar+1001";
									
		}
		if (system.toUpperCase().equals("MONTRN")  == true && user.toUpperCase().equals("TBN01372") == true) {
			return "Vi1dolar+1001";
									
		}
		if (system.toUpperCase().equals("GTR24HDN")  == true && user.toUpperCase().equals("TBN01372") == true) {
			return "Vi1dolar+1001";
									
		}
		if (system.toUpperCase().equals("INDCORP")  == true && user.toUpperCase().equals("TBN01372") == true) {
			return "TecBan#2009483jfkdwiaosw";
									
		}
		if (system.toUpperCase().equals("AD")  == true && user.toUpperCase().equals("TBN01372") == true) {
			return "Vi%998378884%01";
									
		}
		if (system.toUpperCase().equals("PORTALEC")  == true && user.toUpperCase().equals("TBN01372") == true) {
			return "Vi%9983&B88b";
									
		}
		
		return "Not found";
		
	}

}
