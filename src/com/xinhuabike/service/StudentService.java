package com.xinhuabike.service;

import com.xinhuabike.dto.JsonResult;
import com.xinhuabike.dto.Page;
import com.xinhuabike.pojo.Student;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

import java.util.List;


public interface StudentService {

    Student findBySno(String sno);

    Page findAllToPage(Integer page, Integer rows);

    JsonResult removeById(Integer sid);

    Student findById(Integer sid);

    JsonResult add(MultipartFile studentIcon, Student student, HttpServletRequest request);

    JsonResult update(MultipartFile multipartFile,Student student,HttpServletRequest request);
}
