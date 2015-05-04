"""Script for email sign up success"""
#import webdriver from selenium
from selenium import webdriver
#import Action chain to hover and click the css DOM element
from selenium.webdriver.common.action_chains import ActionChains ##for hovering over css elements

##define Site Elements class
class SiteElements:
     #use Firefox web driver
     driver = webdriver.Firefox()
     ##initialize the site elements object
     def __init__(self,driver = webdriver):
          print "site elements class for containing elements"
          
     ##username text field
     def get_username(self):
         username = self.driver.find_element_by_name("email")
         return username
         
     ##firstname text field    
     def get_firstName(self): 
        firstname = self.driver.find_element_by_name("firstName")
        return firstname
        
     ##lastname text field
     def get_lastName(self):
         lastname  = self.driver.find_element_by_name("lastName")
         return lastname
         
     ##member id text field         
     def get_memberId(self):
         member_id = self.driver.find_element_by_id("userName")    
         return member_id
         
     ##create password field
     def get_userPasswd(self):
         password_create =self.driver.find_element_by_id("password")
         return password_create
         
     ## confirm password field    
     def get_confirmation(self):        
         password_confirm = self.driver.find_element_by_id("passwordConfirmation")
         return password_confirm   
         
     ##next button field to navigate to the next steps
     def get_next_button(self):
         next_button = self.driver.find_element_by_id("next-btn")
         return next_button
     
     ##get the submit button element
     def get_submit_button(self):
         submit = self.driver.find_element_by_id("btn-primary")
         return submit
    
     ##get the address element      
     def get_address(self):
         add = self.driver.find_element_by_id("address")
         return add
     
     ##get for the search element text field
     def get_search(self):
         search_res= self.driver.find_element_by_id("go")
         return search_res
     
     ##get location element from the result list         
     def get_location(self):
         #location = self.driver.find_element_by_id("location_763")
         loc = self.driver.find_element_by_css_selector("#location_198694951")
         return loc ###location_763 #select_location
     
     #get the css selector to select "This is my Location"
     def get_myLocation(self):
         add = self.driver.find_element_by_css_selector('#location_198694951')
         SearchButton = self.driver.find_element_by_css_selector('#select_location')
         print "next hover functionality"
         Hover = ActionChains(self.driver).move_to_element(add).move_to_element(SearchButton)
         #Hover.click().perform() 
         return Hover
     
     ##get the confirm button element 
     def get_confirm_button(self):
         #confirm = self.driver.find_element_by_css_selector("input.btn:nth-child(2)")
         confirm = self.driver.find_element_by_xpath("//td@[class:'formButtons']/input@[value:'Confirm']")         
         return confirm 
         
     ## A method to check and print the elements by tag     
     def get_result_list(self):
         res_list=self.driver.find_element_by_id("location_650301670")
         items = res_list.find_elements_by_tag_name("h2")
         for item in items:
             print item.get_attribute("values")    
         