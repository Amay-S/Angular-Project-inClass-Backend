package com.spring.angular;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="employee")

public class Employee {
	@Id
	@Column(name="emp_id")
	private String empId;
	private String name;
	private String designation;
	private String salary;
}
