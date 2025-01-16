Get all Bookings
For this example, we will be making requests to the /booking route and using some different parameters in the requests to filter the response data.

Collections management
Before we start making our requests to the /booking route, let's walk through some Collections housekeeping. Having a single collection for all your requests can get messy fast. In Postman, we can create a folder structure within a collection and separate our requests into a more meaningful order.

Creating a New Folder in a Collection:
Hover over the main Restful_Booker_Collection and an ellipsis icon will appear.

Press the ellipsis icon to display the context menu.

Select the Add Folder option.

In the dialog box, give the folder a name (e.g., Health Check).

Press the Create button.

You can move requests around by dragging and dropping them into specific folders. Another method is to save them directly into a folder.

Saving Requests to a Folder:
Press the Save button to the right of the Send button.

In the dialog box, give the request a name (e.g., Get all bookings).

Use the Search field to find the folder.

Select the desired folder from the list of results.

Press the Save to {folder name} button.

Getting the Booking data
Looking at the documentation for the Restful-Booker API, we have a couple of new things to explore. In most API endpoints, you can use query string parameters to specify options that limit the data included in responses. Our first request to the /booking route will bring back all the data within the system.

Example Request:
URL: https://restful-booker.herokuapp.com/booking

This returns an array of Booking Ids. Let's look at the different ways we can filter the response data using the available query string parameters: firstname, lastname, checkin, and checkout.

Example Filtered Request:
URL: /booking?firstname=sally&lastname=brown

You can enter these parameters directly into the request URL or use the Params feature in Postman.

Explore It!
While using the API, think of different ways to explore what's in front of you to highlight potential issues. One great resource is the Test Heuristics Cheat Sheet from Elisabeth Hendrickson.

Some Basic Tests
Using the lastname parameter:

Case Sensitivity:

Request: /booking?lastname=brown

Result: Empty array (Case-sensitive search).

Fix: Use /booking?lastname=Brown.

Date Validation:

Request: /booking?checkin=2023-13-01

Result: 500 Internal Server Error (Invalid date handling).
