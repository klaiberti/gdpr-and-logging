package com.esentri.tillklaiber.gdprandlogging;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@Slf4j
public class Customer {

  private String type;

  private String ident;

  private String email;

  @ToString.Include(name = "email")
  private String emailForLogs() {
    if (log.isDebugEnabled()) {
      return this.email;
    }
    return "HIDDEN FOR LOGS";
  }
}
