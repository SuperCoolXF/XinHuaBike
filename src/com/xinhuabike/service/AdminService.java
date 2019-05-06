package com.xinhuabike.service;

import com.xinhuabike.dto.JsonResult;
import com.xinhuabike.dto.Page;
import com.xinhuabike.pojo.Admin;
import com.xinhuabike.pojo.Place;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

import java.util.List;


public interface AdminService {


    //验证登陆
    public String checkUserPwd(Admin admin);

    //更新
    public boolean upDate(Admin admin);

    //
    public Admin findByUsername(String username);

    //显示所有用户用PageBean封装
    Page<Admin> findAllToPage(Integer page, Integer rows);

    JsonResult deleteById(Integer aid);

    List<Place> loadPlace();

    JsonResult update(MultipartFile adminIcon, Admin admin, HttpServletRequest request);

    JsonResult add(MultipartFile adminIcon, Admin admin, HttpServletRequest request);
}
