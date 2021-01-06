package com.joeshaw.userserviceprovider.domain;

import com.baomidou.mybatisplus.annotation.TableField;

import java.util.ArrayList;
import java.util.List;

public class Role {
    private Long id;
    private String roleName;
    private String permissionId;
    @TableField(exist = false)
    private List<Permission> permissions = new ArrayList<>();
}
