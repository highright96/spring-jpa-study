package dev.highright96.basic.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class BasicItem {
    @Id @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long Id;
    private String name;
    private Integer price;
    private Integer stockQuantity;

}
