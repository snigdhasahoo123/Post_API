package stepDefinitions_Batch_Module;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class Post_json {

	void testpostusingExternalJsonFile() throws FileNotFoundException {

		File f = new File(".\\body.json");

		FileReader fr = new FileReader(f);
		JSONTokener jt = new JSONTokener(fr);

		JSONObject data = new JSONObject(jt);

		given().contentType("application/json").body(data.toString()).when()
				.post("https://lms-backend-service.herokuapp.com/lms/batches").then().statusCode(201)

				.body("batchId", equalTo("1000")).body("batchName", equalTo("Jan12-Ninjacreators-SDET-0100"))
				.body("batchDescription", equalTo("Basic Testing")).body("batchStatus", equalTo("Active"))
				.body("batchNoOfClasses", equalTo("3")).body("programId", equalTo("200"))
				.body("programName", equalTo("Jan12-Ninjacreators-SDET-0100")).log().all();

	}

}
