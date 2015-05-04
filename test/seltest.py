# -*- coding: utf-8 -*-
"""
Check automation for testing address fail sign up if email address already in use
@author: shrav
"""
#import python unit test framework
import unittest
#import the reg exp module to find patterns
import re
from selenium import webdriver 
from selenium.webdriver.common.keys import Keys
from selenium.common.exceptions import TimeoutException
from selenium.webdriver.support.ui import WebDriverWait

class testEmail(unittest.TestCase):
    
 def test_sel(self):
    
    driver = webdriver.Firefox()
    driver.get("http://www.3point5.com/")
    driver.maximize_window()
    assert "3point5 | Retail Product Training - Learn and Earn! - 3point5" in driver.title
    user_name = driver.find_element_by_name("email")
    submit = driver.find_element_by_id("btn-primary")
    #send the info to the driver
    user = user_name.send_keys("shravantimanohar@gmail.com")
    submit.click()
   
    #to detect if an email address is already in use
    text_found = re.search(r'We have detected that ',driver.page_source)
    ##give an assertion error is the email id is not already in use    
    assert text_found is not None
    wait = WebDriverWait(driver,5)
#==============================================================================
#     WebDriverWait(driver, 5).until(
#         self.ajax_complete, "Timeout waiting for page to load"
#     )
#==============================================================================
    assert "No results found" not in driver.page_source
    
    #try login success
    try:
       page_loaded = wait.until_not(
       lambda driver:driver.current_url == "http://www.3point5.com/"
     )
    except TimeoutException:
       self.fail("loading Timeout expired")
    
    # Assert that the URL is now the correct post-login page
#    self.assertEqual(
#       driver.current_url,
#       "http://www.3point5.com/",
#       msg = "Successful Login"
#    )    
    

    self.assertTrue(
       driver.current_url,
       "http://www.3point5.com/",
       #msg = "Successful Login"
    )    
    #print a email id fail message
    print "We have detected that the email is already registered on 3point5.com."
    driver.close()



if __name__=="__main__":
    unittest.main()
    #x = testEmail()    
    #testEmail.test_sel(x)  