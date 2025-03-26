package com.jsp.hibernate_one_to_one_unidirection.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Voter {
	@Id
private int id;
private String address;
private int age;
private LocalDate dob;
private String fatherName;
private LocalDate dateOfIssue;
private String gender;
}
