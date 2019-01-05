package com.wei.thing.dao;

import com.wei.thing.bean.ThingsBean;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface Mapper {


    String TABLE1 = "illumination" ;
    String TABLE2 =  "acceleration";
    String TABLE_COLUMNS = "id,value,create_time";

    @Select("select "+TABLE_COLUMNS+" from "+TABLE1+" order by create_time desc limit 100")
    public List<ThingsBean> getLastListOfLllumination();

    @Select("select "+TABLE_COLUMNS+" from "+TABLE2+" order by create_time desc limit 100")
    public List<ThingsBean> getLastListOfAcceleration();


    @Select("select "+TABLE_COLUMNS+" from "+TABLE2+" where create_time between #{startTime} and #{endTime} order by create_time desc")
    public List<ThingsBean> getAccelerationByTime(@Param("startTime") String startTime,@Param("endTime") String endTime);

    @Select("select "+TABLE_COLUMNS+" from "+TABLE1+" where create_time between #{startTime} and #{endTime} order by create_time desc")
    public List<ThingsBean> getIlluminationByTime(@Param("startTime") String startTime,@Param("endTime") String endTime);


    // public List<ThingsBean>

}
