package com.xinhuabike.dto;

import java.util.List;

public class Page <T> {

    //总的数据条数
    private Integer total;
    //一页的数据
    private List<T> rows;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "Page{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }
}
