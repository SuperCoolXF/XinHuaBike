package com.xinhuabike.service;

import com.xinhuabike.dto.JsonResult;
import com.xinhuabike.pojo.Category;
import com.xinhuabike.pojo.Place;

import java.util.List;


public interface PlaceService {
    List<Place> findAll();

    JsonResult update(Place place);

    JsonResult add(Place place);

    JsonResult deleteById(Integer pid);

    Place findById(Integer pid);
}
