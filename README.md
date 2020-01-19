A REST API Address Book using Java and Spring Boot


Note: This application will fetch the customer list based on their last name (not case-sensitive) and if no name is given, the application will fetch all the customers from the list. The customer list has been hard-coded within the program. Hence to change the details of any customer, the changes will need to be made in the code. The list of customers are given in an excel sheet uploaded in the repository.


Steps to run the application:
1. Clone the git repository or download the extract zip file.
2. Open the project using IntelliJ Idea or any other IDE that you use.
3. Run the application from the IDE.
4. Open Google Chrome browser.
5. Type "http://localhost:8080/address/". This will give you the list of customers with their addresses.
6. Pick any of the customer's last name and now type "http://localhost:8080/address/lastName", where lastName is the name that you have chosen. This will give the list of customers (or customer if there is only one person) with that surname.
7. Give the last name to be something different from the list. It will throw the exception "com.moo.addressbook.custom.CustomerNotFoundException: Unable to find address for the surname".
