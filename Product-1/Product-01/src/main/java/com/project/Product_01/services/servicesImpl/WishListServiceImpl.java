package com.project.Product_01.services.servicesImpl;

import com.project.Product_01.repository.WishListRepository;
import com.project.Product_01.services.WishListService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WishListServiceImpl implements WishListService {

    private final WishListRepository wishListRepository;
}
