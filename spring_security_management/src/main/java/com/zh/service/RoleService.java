package com.zh.service;

import com.zh.domain.SysRole;

import java.util.List;

public interface RoleService {

    public void save(SysRole role);

    public List<SysRole> findAll();

}
