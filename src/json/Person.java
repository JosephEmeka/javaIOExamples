package json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.time.LocalDate;

public class Person {
 @JsonInclude(JsonInclude.Include.NON_EMPTY)
 private String name;
 @JsonProperty("dob")
 @JsonSerialize(using = LocalDateSerializer.class)
 @JsonDeserialize(using = LocalDateDeserializer.class)
 private LocalDate dateOfBirth;
 @JsonInclude(JsonInclude.Include.NON_EMPTY)
 private String phoneNumber;
 @JsonInclude(JsonInclude.Include.NON_EMPTY)
 private Gender gender;

 public Person(){}
 public Person(String name, LocalDate dateOfBirth, String phoneNumber, Gender gender){
  this.name = name;
  this.dateOfBirth = dateOfBirth;
  this.phoneNumber = phoneNumber;
  this.gender = gender;
 }
 @Override
 public String toString() {
  return "person -> ";
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public LocalDate getDateOfBirth() {
  return dateOfBirth;
 }

 public void setDateOfBirth(LocalDate dateOfBirth) {
  this.dateOfBirth = dateOfBirth;
 }

 public String getPhoneNumber() {
  return phoneNumber;
 }

 public void setPhoneNumber(String phoneNumber) {
  this.phoneNumber = phoneNumber;
 }

 public Gender getGender() {
  return gender;
 }

 public void setGender(Gender gender) {
  this.gender = gender;
 }
}
