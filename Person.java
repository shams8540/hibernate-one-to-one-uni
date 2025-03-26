package com.jsp.hibernate_one_to_one_unidirection.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
//@Data
@Getter
@Setter
@Entity
public class Person {
	@Id
private int id;
private String name;
private String email;
private long phone;

//cascading

//@OneToOne(cascade=CascadeType.PERSIST)
@OneToOne(cascade=CascadeType.ALL)
//@OneToOne(cascade= {CascadeType.PERSIST,CascadeType.REMOVE})
@JoinColumn(name="voter_id")
private Voter voter;


@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", voter=" + voter + "]";
}





}
