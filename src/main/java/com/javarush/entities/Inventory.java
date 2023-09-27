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
public class Inventory {

  private long inventoryId;
  private long filmId;
  private long storeId;
  private LocalDateTime lastUpdate;

}
