Feature: Validate PUT Request	
Scenario: To Update data with Batch Id	
Given User with URL  "{{baseurl}}/batches/{BatchId}" (Update Batch by Batch Id)	
And Request body to be given	
When PUT request is sent with valid Batch Id & Format to be chosen as "Json"	
Then User should receive "200 OK" status code
Given User with URL  "{{baseurl}}/batches/{BatchId}" (Update Batch by Invalid Batch Id)	#Request body to be given	
When PUT request is sent with Invalid Batch Id & Format to be chosen as "Json"	
Then Status Code should be "400 Bad Request" AND The Response should be "errorCode": "ENTITY_DOES_NOT_EXIST", "errorMessage": "batch with this programId not found"
