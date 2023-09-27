package com.javarush.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Customer {

  private long customerId;
  private long storeId;
  private String firstName;
  private String lastName;
  private String email;
  private long addressId;
  private long active;
  private LocalDateTime createDate;
  private LocalDateTime lastUpdate;

}
