package com.project.Product_01.controller;

import com.project.Product_01.services.WishListService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product/wishList")
@RequiredArgsConstructor
public class WishListController {

    private final WishListService wishListService;
}
