package ru.savoook.graphql.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "vehicle")
public class Vehicle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "type", nullable = false)
    private String type;
    @Column(name = "model_code", nullable = false)
    private String modelCode;
    @Column(name = "brand_name")
    private String brandName;
    @Column(name = "launch_date")
    private LocalDate launchDate;
    private transient  String formattedDate;
    // Getter and setter
    public String getFormattedDate() {
        return getLaunchDate().toString();
    }
}
