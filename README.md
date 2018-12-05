# CENG319-Assignment3


## AbsSeekBar

## Overview
 AbsSeekBar is a widget in the android environment which extends the capabilities of a ProgressBar by adding a draggable thumb to it, allowing customization. The user can adjust colors, styles, and functionality of the SeekBar to their desire. The widget allows developers to add personality to the pages they create while keep all functionality intact. The purpose of a SeekBar is to allow users the ability to change and adjust integer values that function with a corresponding application in a user interface via a touch bar. They are often found as volume rockers and brightness adjustment sliders. They basically display the current progress of the application it is intended for which can be manipulated by the user. 

## Background
The AbsSeekBar was added In API level 1 making it one of the earliest widgets to appear in android app development. Over the years many different versions of the SeekBar were created and included in newer API’s. Some of them include Arc SeekBar, Circle SeekBar, Range SeekBar and Bubble SeekBar. While all of these styles might seem drastically different from one another, they all share the same functionality and purpose. It simply comes down to stylistic preferences in the scenarios they are presented in.  Each custom designed SeekBar requires certain libraries to be installed and imported in the project as they each have their own specifications which are required in order to operate as intended by the creator. In terms of the regular SeekBar use, no additional libraries are required making implementation less of a hassle. 

## Major methods and Attributes
In order to implement the main three callbacks for SeekBar, a Listener must be declared initially as in the following line:

<b>seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){…}</b><br>
This listener is used to notify the android client when a change is being made to the progress of the SeekBar. This then invokes the use of the three callback methods mentioned before for the different states the SeekBar is in. These methods are: 

<b>public void onProgressChanged (SeekBar seekBar, int progress, boolean fromUser) {…}</b><br>
Listener method is invoked when the SeekBar is in use and progress values are being constantly updated. To display the current progress in this method, use: progressBar.setProgress(..); 

<b>public void onStartTrackingTouch(SeekBar seekBar) {…}</b><br>
Listener method is invoked at the start of the user’s activity with the SeekBar. Developers have the option to include additional functionality at this time during the initial startup such as displaying messages and giving feedback of functional operations. 

<b>public void onStopTrackingTouch(SeekBar seekBar) {…}</b><br>
Listener method is invoked at the end of user interactions with the SeekBar. When the SeekBar is no longer in use and the user has stopped dragging the thumb, the method notifies the client and stops tracking. It can be resumed at any moment once again if the user desires and these three callback methods will continue operation. 

Additional methods may be used, but are not mandatory. Some examples are:

getMax() – Allows users to set a maximum integer value for their progress of the SeekBar.
getProgress() – Displays current progress from the SeekBars position in real time. 

## Example Project
Attached to this repository is an example project of how this code functions and appears to users. Each main line of code which is crucial for functionally has an included comment for an easy understanding of the structure created. The only files required were the main XML file for the design of the layout, MainActivity.java for method implementation, and strings.xml file for the few TextViews created. Optionally, a landscape xml file was created just to allow functionality when screen orientation was changed. No external sources or files are required to make such code operate.









## References

https://examples.javacodegeeks.com/android/core/widget/seekbar/android-seekbar-example/

https://developer.android.com/reference/android/widget/AbsSeekBar

https://abhiandroid.com/ui/seekbar

