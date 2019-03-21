package com.mq.mqdemo.enums;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public enum ResultCodeEnum {

    SUCCESS("成功", "1"),
    EXCEPTION("异常", "0");

    private String name;

    private String value;


    private ResultCodeEnum(String name, String value) {
        this.name = name;
        this.value = value;
    }


    public static ResultCodeEnum findByValue(String value) {
        for (ResultCodeEnum c : ResultCodeEnum.values()) {
            if (c.getValue().equals(value)) {
                return c;
            }
        }
        return null;
    }

    public static ResultCodeEnum findByName(String name) {
        for (ResultCodeEnum c : ResultCodeEnum.values()) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }


    /**
     * @return the name
     */
    public String getName() {
        return name;
    }


    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

}
