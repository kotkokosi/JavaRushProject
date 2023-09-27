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
public class Address {

  private long addressId;
  private String address;
  private String address2;
  private String district;
  private long cityId;
  private String postalCode;
  private String phone;
  private LocalDateTime lastUpdate;

}
