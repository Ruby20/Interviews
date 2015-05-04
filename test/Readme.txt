I have used python with selenium web driver for the exercise because python with selenium bindings is a faster tool for automation testing. I followed the documentation available online.

I have used object-oriented design to organize my code.
#Automation for testing email address success sign up:
I added assert statement to make sure I go to the right page with title "3point5 | Retail Product Training - Learn and Earn! - 3point5"  and that is 
 http://www.3point5.com for testing purposes.

SiteModel.py - is where I initialize the web driver and get the site elements which will be used for testing the fields. I put all the site elements in a class with each method returning the respective web element to through the driver. 

TestRunner.py - This contains the code that tells the driver to navigate to the desired page and send keys to log the user into the system. I used python's unit test framework to run tests on the module TestRunner.

I used find_element_by_xpath and css_selector methods but they did not work for me. So I found that Action Chains provided a better mechanism to handle css elements. 
The part that I couldn't figure out was how to make Actionchain hover and click the css element.


#Create automation for testing email address fail sign up, if email address is already in use:
seltest.py - This file contains the code to detect if email address is already in use. If we find the text 'We have detected that shravantimanohar@gmail.com is already registered on 3point5.com' then my code will check with an assert statement. It raises an assertion error if the email is not already in use. If email is already in use it will close the driver and prints a message on the console.

Things can be done:
I did not handle my script to automate this page http://www.3point5.com/campaign/hpbq1/
checks on member ID uniqueness


I'm interested in working on this task to accomplish more.This proved to be a good coding exercise for me to learn about automation software tools like selenium and nose2 in python.

