package com.xinhuabike.service;

import com.xinhuabike.dto.JsonResult;
import com.xinhuabike.dto.Page;
import com.xinhuabike.pojo.Bike;
import com.xinhuabike.pojo.Student;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

import java.util.Map;


public interface BikeService {



    JsonResult add(MultipartFile bikeIcon, Bike bike, HttpServletRequest request,Integer bCount);

    JsonResult update(MultipartFile bikeIcon,Bike bike,HttpServletRequest request);

    Page<Bike> findAllToPage(Integer page, Integer rows);

    //当前bike d掉 和 更新该分类的数量
    JsonResult deleteById(String bids,String cids);

    Bike findById(Integer bid);
}
