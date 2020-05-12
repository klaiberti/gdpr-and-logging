package com.esentri.tillklaiber.gdprandlogging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class CustomerController {

  @Autowired
  CustomerService customerService;

  @PostMapping
  public ResponseEntity addCustomer(@RequestBody Customer customer) {
    log.info("New customer received: {}", customer);
    customerService.processNewCustomer(customer);
    return ResponseEntity.ok().build();
  }

}
