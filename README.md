A REST API Address Book using Java and Spring Boot


Note: This application will fetch the customer list based on their last name (not case-sensitive) and if no name is given, the application will fetch all the customers from the list. The customer list has been hard-coded within the program. Hence to change the details of any customer, the changes will need to be made in the code. The list of customers are given in an excel sheet uploaded in the repository.


Steps to run the application:
1. Clone the git repository or download the extract zip file.
2. Open the project using IntelliJ Idea or any other IDE that you use.
3. Run the application from the IDE.
4. To run the application from command terminal, go to the path where the project is present and type 'mvn clean install'. After this, type 'java -jar target\rg-addressbook-api-1.3.0.jar' to run the application in Windows. (For Mac users, please type 'java -jar target/rg-addressbook-api-1.3.0.jar').
5. Open the browser of your choice.
6. Type "http://localhost:8080/address/". This will give you the list of customers with their addresses.
7. Pick any of the customer's last name and now type "http://localhost:8080/address/lastName", where lastName is the name that you have chosen. This will give the list of customers (or customer if there is only one person) with that surname.
8. Give the last name to be something different from the list. It will throw the exception "com.moo.addressbook.custom.CustomerNotFoundException: Unable to find address for the surname".
9. If this needs to be checked in the terminal or command line, it can be done by typing 'curl <Service URL>', where Service URL is the URL given in points 6 and 7.

Total time taken to complete this task is 4 hours (commits may show that this task was done for many hours and that is because of the frequent breaks taken while doing the task and also tidying up the code before submitting it for assignment review).
