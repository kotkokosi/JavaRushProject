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
public class Rental {

  private long rentalId;
  private java.sql.Timestamp rentalDate;
  private long inventoryId;
  private long customerId;
  private LocalDateTime returnDate;
  private long staffId;
  private LocalDateTime lastUpdate;

}
