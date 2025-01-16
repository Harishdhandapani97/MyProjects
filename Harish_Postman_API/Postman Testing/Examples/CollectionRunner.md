Introduction to the Collection Runner
In this example, we will take a closer look at the Collection Runner, which allows us to run multiple requests.

The Collection Runner is where things start to get really interesting. It's where you can automate the execution of the requests you've built up in your Collection folders. With the click of a single button, you will see all the requests execute before your very eyes.

The Collection Runner offers many different features, and we'll explore the basics to get you familiar with this part of the Postman application.

Where does this automated magic happen?
Postman provides multiple options for opening the Collection Runner. Each person will have their own method of doing this, and they all achieve the same result.

Main Application View:

Select the Runner button in the top left of the screen. This will open the Collection Runner in a new window.

Alternatively, select the file type icon next to it, and choose Runner Window from the dropdown menu.

From the Collection Folder:

Select the arrow icon next to the Collection folder.

In the new panel, click the blue Run button. This will open the Collection Runner with the selected Collection in view.

Keyboard Shortcut:

Use Ctrl+Shift+R to open the Collection Runner.

Running a Collection
To keep this basic, we'll use the Restful_Booker_Collection that we've been building during these examples. This Collection contains various requests with a few basic tests included.

Open the Runner in a new window.

Select the Collection you require from the list available. If you have multiple Collections, use the Search feature to filter them.

Set the Environment file from the dropdown menu in the Runner. This is crucial, as it ensures the requests reference the correct variables.


Runner Options
Iterations: Determines the number of times the selected Collection or sub-folder will be executed during the run. Default is 1.

Delay: Adds a wait time between each request execution (in milliseconds).

Log Responses: Allows you to view the request/response bodies and headers in the Run Results section.

Data: Allows you to drive requests using data from an external JSON or CSV file. (We'll cover this in a later example.)

Persist Variables: If checked, this will update all Environment and Global variables used in the Collection run. By default, it is checked.

Example: Setting Iterations to 5

Example: Setting Delay to 3000 milliseconds

Running the Collection
Select the Restful_Booker_Collection from the list.

Set the Restful_Booker_Environment file.

Start the run.


Checking the Results
Once the Runner has completed the Collection of requests, you will see the results of the run.

Test Summary: Shows the number of tests run and a Passed/Failed summary.


Detailed Results: Displays which tests were run against which requests and their outcomes (Passed or Failed).


Log Responses: Allows you to view request/response bodies and headers.


Each Collection or sub-folder that has been run will appear in the Recent Run list. Selecting any of these runs will display the information in the Run Results section.