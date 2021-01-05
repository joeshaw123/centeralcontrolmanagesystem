package com.joeshaw.userserviceprovider.domain;

import lombok.Data;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.util.Date;

@Data
public class User {
    private Integer id;
    private String nickName;
    private String password;
    private String phone;
    private String department;
    private Integer roleId;
    private Date lastLoginTime;
}
