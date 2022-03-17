package com.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.expression.spel.ast.Identifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.alfamodels.AccountNumber;
import com.alfamodels.Address;
import com.alfamodels.BankDetails;
import com.alfamodels.BillingAddress;
import com.alfamodels.SortCode;
import com.alfamodels.ThirdParty;
import com.alfamodels.ThirdPartyWrapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.model.CusAddress;
import com.model.CusBankAcc;
import com.model.Customer;
import com.model.CustomerLoad;
import com.model.ThirdPartyIdentifier;

@Component
public class CallRestAPI /*implements CommandLineRunner*/ {

	@PutMapping("/customer")

	public Object updateCustomer(@RequestBody Customer customer) {

		RestTemplate rest = new RestTemplateBuilder()
				.basicAuthentication("fATEwgK6D8po0GIjcdJVJPrN7IqzKnCbQ6IWiGDRn4CsRcrE",
						"U6J6c75eTKvBPAI2LWmuooMA410TFN0djulb551FQyKr9OtC")
				.build();

		CustomerLoad customerLoad = new CustomerLoad();
		ThirdPartyIdentifier indetifier = new ThirdPartyIdentifier();
		indetifier.setThirdPartyNumber(customer.getCusRef().split("/")[0]);
		indetifier.setBillingAddressNumber(Integer.parseInt(customer.getCusRef().split("/")[1]));
		customerLoad.setThirdPartyIdentifier(indetifier);

		String baseURL = "https://sandbox.teamwill.alfa.technology/json";

		String url1 = baseURL + "/third-party/v1/third-party/saveIndividual";
		String url2 = baseURL + "/third-party/v1/third-party/saveBankAccount";
		String url3 = baseURL + "/third-party/v1/third-party/loadThirdParty";

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
	

		ResponseEntity<ThirdParty> thirdParty = rest.postForEntity(url3, customerLoad, ThirdParty.class);

		mapRequestParams(customer, thirdParty.getBody());
		
		ThirdPartyWrapper thirdpartywrapper = new ThirdPartyWrapper();
		thirdpartywrapper.setThirdParty(thirdParty.getBody());
		thirdpartywrapper.setNarrative("test");
		HttpEntity<ThirdPartyWrapper> requestEntity = new HttpEntity<ThirdPartyWrapper>(thirdpartywrapper, headers);

	
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = null;
		try {
			 jsonInString = mapper.writeValueAsString(thirdpartywrapper);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ResponseEntity<ThirdPartyIdentifier> response = rest.exchange(url1, HttpMethod.PUT, requestEntity, ThirdPartyIdentifier.class);
		

		return response;

	}

	public void mapRequestParams(Customer customer, ThirdParty thirdParty) {

		thirdParty.setOccupation(customer.getCusJob());
		thirdParty.setTelephoneNumber(customer.getCusPhoneNo());
		
		BillingAddress billingaddress = thirdParty.getBillingAddress();
		billingaddress.setCountry(customer.getCusAddress().getCountry());
		billingaddress.setLine5(customer.getCusAddress().getPostalCode());
		billingaddress.setLine1(customer.getCusAddress().getAddress());
		
		BankDetails bankDetails = thirdParty.getBankDetails();
		
		AccountNumber accountNumber = bankDetails.getAccountNumber();
		accountNumber.setValue(customer.getCusBankAcc().getAccNumber());
		bankDetails.setAccountNumber(accountNumber);
		
		SortCode sortCode = bankDetails.getSortCode();
		sortCode.setValue(customer.getCusBankAcc().getSortCode());
		bankDetails.setSortCode(sortCode);
		
		thirdParty.setBankDetails(bankDetails);

		thirdParty.setBillingAddress(billingaddress);
		
	}

/*	@Override
	public void run(String... args) throws Exception {
		
		CusAddress customerAddress = new CusAddress();
		
		CusBankAcc CusBankAcc = new CusBankAcc();
		
		customerAddress.setAddress("483 Windsor Lane, Kensington, London 1");
		customerAddress.setCountry("GB");
		customerAddress.setPostalCode("W1 9XY");
		
		CusBankAcc.setAccNumber("12384312");
		CusBankAcc.setSortCode("182030");
		updateCustomer(new Customer("T000000055/1", "Abdul", "Doctor", "0745631688", customerAddress, CusBankAcc));

	}*/

}
