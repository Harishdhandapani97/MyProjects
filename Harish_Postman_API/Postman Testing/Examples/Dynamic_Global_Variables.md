Global and Dynamic Variables
In this example, we'll learn how to create, use, and clear global variables. We'll also explore the dynamic variables that Postman offers.

Global Variables
Previously, we discussed the Manage Environment feature, which allows us to store data as variables within an environment. These variables can be used in multiple areas under the same environment.

However, if you need to set a variable that can be used anywhere, regardless of environment, you should use globals. Globals allow you to set a value globally and reference it everywhere.

Setting a Global Variable
Open Globals:

Press the cog icon in the top right of the application, just above the Save button.

Press the Globals button.

Add a Global Variable:

In the Add a new variable field, give the variable a name (e.g., new_global_number).

In the Initial Value field, type 15, which will also populate the Current Value field.

Press the Save button.

To return to the main window, press the X button.

Now, we have a globally available variable set and ready to use. Note that all stored variables are saved in the JSON environment file as a string. Thus, even though we added the number 15, it is stored as the string "15".

Using Global Variables
Global variables can be used in the URL, headers, and request body using the {{..}} syntax, just like environment variables.

Here's how to access a global variable's value using pm.globals.get('variableName'):

JavaScript
pm.test("15 should equal 15", () => pm.expect(15).to.equal(pm.globals.get('new_global_number')))
This test will fail because it's trying to assert that a number matches a string. To fix this, parse the string as a number using the parseInt() function:

JavaScript
pm.test("15 should equal 15", () => pm.expect(15).to.equal(parseInt(pm.globals.get('new_global_number'))))
Setting Global Variables in Scripts
You can set global variables in the Pre-Request Script or Tests tabs using pm.globals.set('variableName', 'variableValue'):

JavaScript
pm.globals.set('another_global_number', 5555)
Unsetting and Clearing Global Variables
Remove individual global variables using pm.globals.unset('variableName'). To clear all global variables, use pm.globals.clear() in the Pre-Request Script or Tests tabs.

Dynamic Variables
Postman offers dynamic variables that provide quick access to common data used in requests:

{{$timestamp}}: Adds the current timestamp (Unix timestamp).

{{$guid}}: Adds a v4 style GUID.

{{$randomInt}}: Adds a random integer between 0 and 1000.

These can be added to the request URL, headers, or request body using the {{..}} syntax.

Example Dynamic Variable in URL:
http
GET https://api.example.com/resource?timestamp={{$timestamp}}&guid={{$guid}}&randomInt={{$randomInt}}
Example Dynamic Variable in Request Body:
json
{
    "totalprice": {{$randomInt}}
}
Alternatives Using JavaScript
To achieve similar results in scripts, use the following code:

JavaScript
// {{$timestamp}} alternative
const moment = require('moment');
console.log(`Timestamp: ${moment().valueOf()}`);

// {{$guid}} alternative
const uuid = require('uuid');
console.log(`Guid: ${uuid()}`);

// {{$randomInt}} alternative
const randomInt = _.random(1000);
console.log(`Random Int: ${randomInt}`);
