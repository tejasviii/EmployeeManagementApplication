package com.geekster.EmployeeManagementApplication.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class HR {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hrId;
    private String hrName;
    private String hrUserName;
    private String hrPassword;
    private String hrPermanentAddress;
    private String heContactNumber;
    @Enumerated(value = EnumType.STRING)
    private Gender gender;

}