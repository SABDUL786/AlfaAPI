package com.alfamodels;

import org.springframework.stereotype.Component;

@Component
public class ThirdPartyWrapper {
	ThirdParty ThirdParty; 
	
	String narrative;
	
	public String getNarrative() {
		return narrative;
	}

	public void setNarrative(String narrative) {
		this.narrative = narrative;
	}

	public void setThirdParty(ThirdParty thirdPartyObject) {
		this.ThirdParty = thirdPartyObject;
	}
	
	public ThirdParty getThirdParty() {
		return ThirdParty;
	}

}


