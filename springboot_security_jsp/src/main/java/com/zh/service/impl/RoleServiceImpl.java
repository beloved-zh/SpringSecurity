package com.zh.service.impl;

import com.zh.mapper.RoleMapper;
import com.zh.pojo.SysRole;
import com.zh.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SuppressWarnings("ALL")
@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public void save(SysRole role) {
        roleMapper.save(role);
    }

    @Override
    public List<SysRole> findAll() {
        return roleMapper.findAll();
    }
}
