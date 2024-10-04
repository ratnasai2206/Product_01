package com.project.Product_01.data.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity(name = "WishList")
@Data
public class WishList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "wishList_id")
    @SequenceGenerator(name = "wishList_id", initialValue = 1, allocationSize = 1, sequenceName = "wishList_sequence")
    private int wishListId;
    private String wishListName;
    private List<String> links;

//    List<Catagories> categories;

}
