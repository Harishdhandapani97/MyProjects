Preset Headers
For this example, we will be looking a bit closer at the Preset Headers feature. This will be concentrating on the feature as a standalone item, and we will be working with Request Headers in the next example. I wanted to highlight this feature as it could save you some time.

Who likes to do the same repetitive things over and over?! Not me. That's why I'm a fan of the Preset Headers feature in Postman. Most of the requests that we send will have a selection of Headers. These can provide Authorization details, accepted data formats, valid API versions, etc. We'll be using some of these in future requests.

To access the feature and start creating presets, follow these steps:

Open Preset Headers:

Select the Headers tab in the Request Builder section.

Press the Presets dropdown to the right of the application, under the Save button.

Select Manage Presets, which will display the Manage Header Presets dialog box.

Press the Add button to create a new preset.

Add Data to Preset:

Give the header preset a name (e.g., Restful_Booker_Preset_Headers).

Add some headers of your choice into the fields as Key/Value pairs.

Press the Add button when finished.

Using Bulk Insert
As much as presets save you time, you still enter the key/value pairs one by one. Thankfully, these can be bulk-loaded as plain text, as long as the value is separated by a colon. Here’s an example:

accept:application/json
content-type:application/json
Authorization:Bearer 123456
myCustomKey:{{myCustomValue}}
To bulk add these values:

Open a Preset in the Manage Header Presets dialog box by selecting it from the list or creating a new one.

Press the Bulk Edit button, which will provide a text area with usage instructions.

Paste the example text from above into the text area.

Select the Key-Value Edit option to see how the headers look in that format.

Press Add or Update, depending on whether you’re creating or editing an existing preset.

Using the Preset Headers
To use the preset headers in requests:

In the Headers section of the Request Builder, press the Presets dropdown.

Select the headers you would like to use in the request (e.g., Restful_Booker_Preset_Headers).

Once selected, you will see the headers populated in the main Headers section.