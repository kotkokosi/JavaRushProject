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
public class City {

  private long cityId;
  private String city;
  private long countryId;
  private LocalDateTime lastUpdate;

}
