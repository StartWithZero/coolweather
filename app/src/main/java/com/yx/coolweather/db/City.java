package com.yx.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by LENOVO on 2018/7/26.
 */

public class City extends DataSupport{

    public int id;

    public String cityName;

    public int cityCode;

    public int provinceId;
}
