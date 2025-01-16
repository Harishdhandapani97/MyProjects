GET /booking/{id}
In this example, we will get data for a single booking from the API. We'll explore the endpoint using Request Headers and take a basic look at the Pre-request Scripts feature to make our request more dynamic.

Get Information About a Single Booking
First, we'll use the bookingid values from the previous response and the /booking/{id} endpoint to return data related to that ID. Here's a sample request and response in JSON format:

Example Request
http
GET {{baseURL}}/booking/10
Example Response
json
{
    "firstname": "Sally",
    "lastname": "Jackson",
    "totalprice": 898,
    "depositpaid": true,
    "bookingdates": {
        "checkin": "2016-10-25",
        "checkout": "2018-02-27"
    },
    "additionalneeds": "Breakfast"
}
Using Request Headers
We'll use the Accept header to change the response data type. There are two options: application/json (default) and application/xml.

Adding a Header
Select the Headers tab.

Add Accept as the Key.

Dynamic Requests with Pre-request Scripts
> "Pre-request scripts are snippets of code associated with a collection request that are executed before the request is sent."

We'll use the _.random function from Lodash to create a random number between 1 and 10 and use it in our request.

Pre-request Script
javascript
// Generate a random number between 1 and 10
let randomId = _.random(1, 10);
console.log(randomId); // Log the generated value

// Set the generated number as an environment variable
pm.environment.set("booking_id", randomId);
In the request URL, use {{booking_id}} to reference the variable.

Example Dynamic Request
http
GET {{baseURL}}/booking/{{booking_id}}
This approach makes our requests more dynamic by using random booking IDs.

Summary
In this example, we learned how to:

Use request headers to change the data type in the response.

Utilize pre-request scripts to make dynamic requests.