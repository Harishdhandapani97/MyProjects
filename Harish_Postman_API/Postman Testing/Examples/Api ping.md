Ping the API
In this example, we will make a request to the /ping route and examine the response data.

Health Check Using a Simple Route
Purpose: Quick feedback about API status.

Example: In Chrome, press F12 to open the developer tools. Use the Console tab to paste in the basic JavaScript code below:

javascript
const IsItAlive = () => {
    $.get("https://restful-booker.herokuapp.com/ping", (data, status) => {
        console.log("Response: " + status)
    });
};
setInterval(IsItAlive, 2000);
Stopping the Check: Use the clearInterval({process Id}) method in the console.

Getting Started with Postman
Switch to Dark Theme (Optional):

Press the Settings icon.

Select the Themes tab.

Switch to Dark Theme.

Making Our First Request
Default Setup:

Tool opens new requests with the GET verb.

Send Request:

Enter the base URL https://restful-booker.herokuapp.com/ping.

Press send or use CTRL+ENTER.

Response Data
Gather Information: Response times, data size, headers.

Expected Response: 201 Created.

Create a Collection
Group Requests:

Collections let you organize individual requests.

Steps to Create a Collection:

Press the Save button next to Send.

Name the request meaningfully.

Select + Create Collection.

Name the collection (e.g., Json).

Press Save to {Collection Name}.

That's it! You've now created a basic environment to work with Postman. 😊

Create an Environment File
In this example, we'll create an environment file and use data from it in our requests.

Steps:
Create Environment File:

Click the cog icon (top right).

Click Add.

Name it (e.g., Restful_Booker_Environment).

Add a variable baseURL with the value https://restful-booker.herokuapp.com.

Click Add to save.

Reference the Variable:

In your request URL, replace https://restful-booker.herokuapp.com with {{baseURL}}.

Select your environment file from the dropdown (top right).

Save Your Changes:

Click Save to store the updates.