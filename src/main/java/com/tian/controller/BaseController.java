package com.tian.controller;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @author tang  唐志鹏、跳跳糖
 * @version 1.0.0
 * @description 日期处理
 */
public class BaseController {
    @InitBinder
    /**
     * 自定义数据绑定规则
     * 表单到方法的数据绑定
     */
    public void initBinder(ServletRequestDataBinder binder) {//控制器之前执行一次
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }
}
