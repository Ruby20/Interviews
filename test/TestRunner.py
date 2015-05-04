# -*- coding: utf-8 -*-
"""
@author: shrav
Create automation for testing email address success sign up.
"""
#import python unittest framework
import unittest
##import webdriver from selenium
from selenium import webdriver 
from selenium.webdriver.common.keys import Keys
from selenium.common.exceptions import TimeoutException
import selenium.webdriver.support.expected_conditions as ExpectedConditions
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.common.action_chains import ActionChains ##for hovering over css elements
##import site elements class
from SiteModel import SiteElements
##create an instance of SiteElements class
siteElements = SiteElements(webdriver)



class TestRunner(unittest.TestCase):
    
    def test_signUp(self):
        #navigate to the site 
        siteElements.driver.get("http://www.3point5.com/") or  siteElements.driver.get("http://www.3point5.com/campaign/hpbq1/")         
        
        ##print site title
        print siteElements.driver.title
        siteElements.driver.maximize_window()
        ##to check if the title of the page we are on is correct        
        assert "3point5 | Retail Product Training - Learn and Earn! - 3point5" in siteElements.driver.title
        
        ##input username in the field
        siteElements.get_username().send_keys("ssastry@gmail.com")
        ##submit to register       
        siteElements.get_submit_button().click()
        
        #all the elements in the form
        siteElements.get_firstName().send_keys("shrav")        
        siteElements.get_lastName().send_keys("Man")
        
        siteElements.get_memberId().send_keys("abcd11")
        siteElements.get_userPasswd().send_keys("sgteu")
        siteElements.get_confirmation().send_keys("sgteu")
        
        siteElements.get_next_button().click()
        siteElements.get_address().send_keys("84102")
        siteElements.get_search().click()
        
        location = siteElements.get_location()
        wait = WebDriverWait(siteElements.driver, 20)
        wait.until(ExpectedConditions.visibility_of(location)) #this will wait for elememt to be visible for 20 seconds
        location.click(); #now it clicks on element              #.build().perform()  
        
        map_location_click = siteElements.get_myLocation()
        wait_again = WebDriverWait(siteElements.driver, 20)
        #wait.until(ExpectedConditions.visibility_of(map_location_click))
        map_location_click.click()
#       print siteElements.get_myLocation()
               
        
        siteElements.get_confirm_button().click()
        siteElements.driver.close()
        

###Test Runner Class to run the test
#class TestRunner(unittest.TestCase):
#      ##class set setup for maximize window and sign up
#     @classmethod
#     def setupClass(cls):
#          siteElements.driver.maximize_window()
#          test_signUp()



if __name__ == "__main__":
      unittest.main()           
        
               
        














