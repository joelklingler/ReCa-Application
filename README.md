# ReCa
Rental car administration is a java rich-client desktop application created to manage car rentals, customers, payments and vehicles.

## About
Created by @EddieSmurfy, @neRf420 and @joelklingler as the final project in the module 306 at the GBS St. Gallen, Switzerland.
Project start: 06.04.2016
Project end: 08.06.2016
Development time: 145h

## Features:
*Features that are ~~strikethrough~~ were planned but not implemented.*

**Customers**
Create, modify and delete customers. These customers are avaiable to rent cars, ~~payment and invoice information will autmatically be mapped to the customer~~.

**Cars**
Create, modify and delete your cars.

**Rentals**
Create car rentals. Assign customers to available cars. ~~After saving the renatal, invoice and payment information will automaticly be created and added to the customer~~.

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
