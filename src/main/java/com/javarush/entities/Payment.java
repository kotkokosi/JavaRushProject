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
public class Payment {

  private long paymentId;
  private long customerId;
  private long staffId;
  private long rentalId;
  private double amount;
  private LocalDateTime paymentDate;
  private LocalDateTime lastUpdate;

}
