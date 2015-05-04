==============================================================================
 import unittest
 from selenium import webdriver
  
 class AweberTest(unittest.TestCase):
  
     #@classmethod
     def setUpClass(cls):
         cls.driver = webdriver.Firefox()
  
     def test_title(self):
         self.driver.get('https://www.aweber.com')
         self.assertEqual(
             self.driver.title,
             'AWeber Email Marketing Services & Software Solutions for Small Business')
  
    # @classmethod
     def tearDownClass(cls):
#==============================================================================
        cls.driver.quit()
#==============================================================================



# if __name__ == '__main__':
#     import nose2
#     
#     class Hello(object):
#         def startTestRun(self,event):
#             print('hello!')
#     nose2.discover(extraHooks=[('startTestRun', Hello())])
#==============================================================================

        


