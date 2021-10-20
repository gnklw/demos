package com.example.eprep.service;

import com.example.eprep.model.service.OrderServiceModel;
import com.example.eprep.model.view.OrderViewModel;

import java.util.List;

public interface OrderService {
    void addOrder(OrderServiceModel orderServiceModel);

    List<OrderViewModel> findAllOrderOrderByPriceDesc();

    void readyOrder(Long id);
}
