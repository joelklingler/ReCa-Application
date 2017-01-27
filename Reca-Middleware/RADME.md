# ReCa-Middleware
Rental car administration is a java rich-client desktop application created to manage car rentals, customers, payments and vehicles. It connects via an WCF-Service to a database (currently hosted on MS-Azure).

###This repo contains the server-side (middleware) code for the java application.

## About
Created by @EddieSmurfy, @neRf420 and @joelklingler as a final project in the module 306 at the GBS St. Gallen, Switzerland.
Project start: 06.04.2016
Project end: 08.06.2016
Development time: 145h

###This application will not be developed further. This version is the last and final version created by the project team.###

## Features:
*Features that are ~~strikethrough~~ are missing or not yet developed.*

**Customers**
Create, modify and delete customers. These customers are avaiable to rent cars, ~~payment and invoice information will autmatically be mapped to the customer~~.

**Cars**
Create, modify and delete your cars. These cars will be avaiable for rent.

**Rentals**
Create car rentals. Assign customers to avaiable cars. ~~After saving the renatal, invoice and payment information will automaticly be created and added to the customer~~.

**Finance**
~~Inspect your invoices and incoming payments.~~

##Service and database
ReCa uses a WCF Service hosted on MS Azure. The service is splitted into 4 parts:

[Customers](http://recamiddleware.cloudapp.net/CustomerService.svc): Service to read, write and modify the customers.

[Vehicles](http://recamiddleware.cloudapp.net:8080/VehicleService.svc): ... to read, write and modiy the vehicles..

[Rentals](http://recamiddleware.cloudapp.net:8081/RentalService.svc): ... to read and write the rentals.

[Finance](http://recamiddleware.cloudapp.net:8082/FinanceService.svc) ... to read and write the invoices and payment informations.

###Service logging###
[Microsoft Application Insights](https://azure.microsoft.com/en-us/services/application-insights/) is used to monitor the wcf services.

Contact @joelklingler for further information about the database or services.
