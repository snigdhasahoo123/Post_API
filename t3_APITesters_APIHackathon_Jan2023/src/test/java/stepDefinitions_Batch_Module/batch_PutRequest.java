package stepDefinitions_Batch_Module;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class batch_PutRequest {

	@Given("User with URL  {string} \\(Update Batch by Batch Id)")
	public void user_with_url_update_batch_by_batch_id(String string) {

	}

	@When("PUT request is sent with valid Batch Id & Format to be chosen as {string}")
	public void put_request_is_sent_with_valid_batch_id_format_to_be_chosen_as(String string) {

	}

	@Then("User should receive {string} status code")
	public void user_should_receive_status_code(String string) {

	}

	@Given("User with URL  {string} \\(Update Batch by Invalid Batch Id)	#Request body to be given")
	public void user_with_url_update_batch_by_invalid_batch_id_request_body_to_be_given(String string) {

	}

	@When("PUT request is sent with Invalid Batch Id & Format to be chosen as {string}")
	public void put_request_is_sent_with_invalid_batch_id_format_to_be_chosen_as(String string) {

	}

	@Then("Status Code should be {string} AND The Response should be {string}: {string}, {string}: {string}")
	public void status_code_should_be_and_the_response_should_be(String string, String string2, String string3,
			String string4, String string5) {

	}

}
