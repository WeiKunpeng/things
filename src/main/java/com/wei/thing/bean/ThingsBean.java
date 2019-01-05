package com.wei.thing.bean;


import java.math.BigDecimal;
import java.sql.Timestamp;

public class ThingsBean {


    private long id;
    private BigDecimal value;
    private Timestamp create_time;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }
}
