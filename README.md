# natureGlowStorePlayWright

Simple Playwright test suite on basic user account creation, product addition to cart/checkout. In automation run, the user cannot be created ("Sign Up" button click doesn't seem to work with any click method available), hence the registered user related tests cannot be performed, products cannot be added to cart/checkout (use screeenshots as proof),
single product page fails to load fully (this issue is observable for any of the products). Further testing is postponed until the webpage is fully operational and the issues are addressed.

#Tech Requirements:

 1.Java JDK 8 or higher 
 
 2.Apache Maven 
 
 3.IntelliJ IDEA (or another IDE that supports Java and Maven)

 4. JUnit5 5.1x
    
 5. Playwright 1.54

#Setup

1. Clone this repository into IntelliJ(or other IDE) workspace folder (or wherever the project can be launched by IDE)
2. Open the IDE and open the project folder
3. Navigate to the pom.xml file and install all required dependencies for the test run
4. Run the test suite on the IDE (or mvn test in-terminal)

## Test Case List

//navigate to sign up page test

1.	// Test 001 -> navigate to sign up page test

//valid user signup test

1.	// Test 002 -> valid user signup test (the "Sign Up" button click fails to work in automation run, test has failed)

//add single new arrival product to cart test

1.	// Test 003 -> add single new arrival product ("Cocoa Body Lotion") to cart out test (as a guest) (the single product page fails to open fully, test has failed)

//add multiple new arrival products to cart test

1.	// Test 003a -> add multiple new arrival products ("Coffee Scrub", "Rose Lip Butter") to cart out test (as a guest) (the single product page fails to open fully, test has failed)

//add single bestselling product to check out tests

1.	// Test 004 -> add single bestselling product ("Neem Shampoo") to check out test (as a guest) (the product fails to be added to check out, test has failed)

//add single shop dashboard product to cart tests

1.	// Test 005 -> add single shop dashboard product ("Mint Lip Balm") to cart test (as a guest) (the product list fails to show up, test has failed)


