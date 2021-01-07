package com.fyc.ssm.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * @program: test-ssm
 * @description:定义自己的类型转换器
 * S:Source 源类型
 * T:Target 目标类型
 * @create: 2021-01-08
 */
public class MyDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        SimpleDateFormat simpleDateFormat = getDateFormat(s);
        try {
            return simpleDateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    private SimpleDateFormat getDateFormat(String source){
        //一个字符串和一个特定形式能否匹配，正则
        SimpleDateFormat sdf=new SimpleDateFormat();
        if (Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$", source)) {
            sdf=new SimpleDateFormat("yyyy-MM-dd");
        }else if (Pattern.matches("^\\d{4}/\\d{2}/\\d{2}$", source)) {
            sdf=new SimpleDateFormat("yyyy/MM/dd");
        }else if (Pattern.matches("^\\d{4}\\d{2}\\d{2}$", source)) {
            sdf=new SimpleDateFormat("yyyyMMdd");
        }
        return sdf;
    }
}
