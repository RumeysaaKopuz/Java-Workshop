package com.example.demo.entities;



import jakarta.persistence.*;

@Table(name="rentals")
@Entity
public class Rental {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "start_date")
    private java.sql.Date startDate;

    @Column(name ="end_date")
    private java.sql.Date endDate;



    @ManyToOne()
    //tekil ise join_column

    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne()
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne()
    @JoinColumn(name = "vehicle")
    private Vehicle vehicle;

}
