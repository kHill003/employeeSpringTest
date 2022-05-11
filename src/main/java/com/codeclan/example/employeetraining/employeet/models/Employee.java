package com.codeclan.example.employeetraining.employeet.models;
import javax.persistence.*;

@Entity
@Table(name="employees")
public class Employee {
   @Id
   @GeneratedValue(strategy =  GenerationType.IDENTITY)
   @Column(name = "id") // NEW
   private Long id;

   

}
