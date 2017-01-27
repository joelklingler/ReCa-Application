using System;
using System.Collections;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Reca.DataTransferObjects.Basics.Objects;

namespace Reca.Customers.Test
{
    [TestClass]
    public class CustomerServiceTest
    {
        [TestMethod]
        public void GetAllCustomersTest()
        {
            // arrange
            using (CustomerService service = new CustomerService())
            {
                // act
                var res = service.GetAllCustomers();

                // assert
                Assert.IsNotNull(res);
            }
        }

        [TestMethod]
        public void CreateCustomerTest()
        {
            // arrange
            using (CustomerService service = new CustomerService())
            {
                Customer customer = new Customer();
                customer.CommunicationTelephone = "123";
                customer.CommunicationAddress = "dihai";
                customer.CommunicationEmail = "babo@joel.ch";
                customer.FirstName = "Joel";
                customer.LastName = "Klingler";
                customer.Insurance = "dini muetter";
                
                // act
                service.CreateCustomer(customer);
            }

            // assert arrange
            using (CustomerService service = new CustomerService())
            {
                // act
                var res = service.GetAllCustomers();
                Assert.IsNotNull(res.FirstOrDefault(x => x.CommunicationTelephone == "123"));
            }
        }
    }
}
