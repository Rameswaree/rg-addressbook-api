A REST API Address Book using Java and Spring Boot


Note: This application can fetch all the customer lists as well as lists based on the last names.

Steps to run the application:
1. Clone the git repository or download the extract zip file.
2. Open the project using IntelliJ Idea or any other IDE that you use.
3. Run the application from the IDE.
4. Open Google Chrome browser.
5. Type "http://localhost:8080/address/". This will give you the list of customers with their addresses.
6. Pick any of the customer's last name and now type "http://localhost:8080/address/lastName", where lastName is the name that you have chosen. This will give the list of customers (or customer if there is only one person) with that surname.
7. Give the last name to be something different from the list. It will throw the exception "com.moo.addressbook.custom.CustomerNotFoundException: Unable to find address for the surname".
