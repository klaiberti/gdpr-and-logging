package com.esentri.tillklaiber.gdprandlogging;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

  public void processNewCustomer(Customer customer) {
    customer.getEmail();
  }
}
