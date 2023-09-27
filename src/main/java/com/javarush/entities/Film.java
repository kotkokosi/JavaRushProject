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
public class Film {

  private long filmId;
  private String title;
  private String description;
  private String releaseYear;
  private long languageId;
  private long originalLanguageId;
  private long rentalDuration;
  private double rentalRate;
  private long length;
  private double replacementCost;
  private String rating;
  private String specialFeatures;
  private LocalDateTime lastUpdate;

}
