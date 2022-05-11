package com.codeclan.example.employeetraining.employeet.models;
import javax.persistence.*;

@Entity
@Table(name="employees")
public class Employee {
   @Id
   @GeneratedValue(strategy =  GenerationType.IDENTITY)
   @Column(name = "id") // NEW
   private Long id;

   @Column(name = "first_name") // NEW
   private String firstName;

   @Column(name = "last_name") // NEW
   private String lastName;

   @Column(name = "age") // NEW
   private int age;

   @Column(name = "employeeNumber") // NEW
   private int employeeNumber;

   @Column(name = "email") // NEW
   private String email;
   public Employee(String firstName, String lastName, int age, int employeeNumber, String email) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.employeeNumber = employeeNumber;
      this.email = email;
   }
}
