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
public class Staff {

  private long staffId;
  private String firstName;
  private String lastName;
  private long addressId;
  private String picture;
  private String email;
  private long storeId;
  private long active;
  private String username;
  private String password;
  private LocalDateTime lastUpdate;

}
