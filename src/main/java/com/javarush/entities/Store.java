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
public class Store {

  private long storeId;
  private long managerStaffId;
  private long addressId;
  private LocalDateTime lastUpdate;

}
