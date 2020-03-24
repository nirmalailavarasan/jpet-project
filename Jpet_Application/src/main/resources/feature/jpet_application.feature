Feature: jpet_application

@TC01_Register_and_Addtocart
Scenario: To check register and add to cart operation
Given Launch application home page for register
Then To check for registeration
Then select product category
Then select product
Then To check for add to cart
And close browser

@TC02_Searchforlink_and_Product
Scenario: To search for link and search for product
Given Launch application home page search options
Then To check for link
Then to enter a product name
Then To check for search
And close browser for search

@TC03_Printproducttable
Scenario: To print a product category table
Given Launch application home page for print product table
Then To select category
Then To check for print table
And close browser for print