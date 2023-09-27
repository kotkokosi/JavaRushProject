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
public class Actor {

  private long actorId;
  private String firstName;
  private String lastName;
  private LocalDateTime lastUpdate;

}

