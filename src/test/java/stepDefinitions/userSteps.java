package stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class userSteps {

	
	

@Given("User is on Registration page")
public void user_is_on_registration_page() {
   System.out.println("user click on registration page button");
}

@When("User enters")
public void user_enters(DataTable dataTable) {
	
	List<Map<String, String>> listOfMaps = dataTable.asMaps(String.class, String.class);
	
	for(int j=0;j<listOfMaps.size();j++) {
		System.out.println(listOfMaps.get(j).get("fn")+" "+listOfMaps.get(j).get("ln"));
	}
	
	for(Map<String, String> m : listOfMaps) {
		System.out.println(m.get("fn") +" "+ m.get("ln"));
	}
    
}

@Then("user regitration. is successfull")
public void user_regitration_is_successfull() {
    
}

}
