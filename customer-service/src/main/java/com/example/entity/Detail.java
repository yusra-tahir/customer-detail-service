package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Detail {

    @Id
    private int detailId;
    private int customerId;
    private int shareId;
    private String shareType;
    private int quantity;
}
