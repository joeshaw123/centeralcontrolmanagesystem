package com.joeshaw.userserviceprovider.domain;

import com.baomidou.mybatisplus.annotation.TableField;

import java.util.ArrayList;
import java.util.List;

public class Permission {
    private String id;
    private String permissionName;
    private String parentId;
    @TableField(exist = false)
    private List<Permission> children = new ArrayList<>();
}
