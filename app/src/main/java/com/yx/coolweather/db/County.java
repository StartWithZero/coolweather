package com.yx.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by LENOVO on 2018/7/26.
 */

public class County extends DataSupport{

    public int id;

    public String countyName;

    public String weatherId;

    public int cityId;
}
