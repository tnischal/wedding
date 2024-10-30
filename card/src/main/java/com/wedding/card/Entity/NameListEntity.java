package com.wedding.card.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name="nameList")
@Entity
public class NameListEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String address1;
    String address2;
}
