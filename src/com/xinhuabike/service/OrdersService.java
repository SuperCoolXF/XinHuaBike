package com.xinhuabike.service;

import com.xinhuabike.dto.JsonResult;
import com.xinhuabike.dto.Page;
import com.xinhuabike.pojo.Orders;


public interface OrdersService {

    JsonResult add(Orders orders);

    Page<Orders> findAllToPage(Integer page, Integer rows);

    Orders findById(Integer oid);

    //归还单车
    JsonResult update(Orders orders);

    JsonResult deleteById(Integer oid,Integer oBid,String oState);
}
