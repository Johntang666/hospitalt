package com.tian.service.Impl;

import com.tian.entity.Menu;
import com.tian.entity.User;
import com.tian.mapper.MenuMapper;
import com.tian.service.MenuService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
@CacheConfig(cacheNames = "login")
public class MenuServiceImpl implements MenuService {
    @Resource
    private MenuMapper menuMapper;

    @Override
    @Cacheable(key = "#loginname",unless="#result == null")
    public User loginname(String loginname) {
        return menuMapper.loginname(loginname);
    }

    @Override
    @Cacheable(key = "#userid",unless="#result == null")
    public List<Menu> queryMenuByUid(Integer userid) {
        return menuMapper.queryMenuByUid(userid);
    }

    @Override
    public List<Menu> loadAvailableMenu() {
        return menuMapper.loadAvailableMenu();
    }

    @Override
    public List<Menu> selAllMenuByUser(Integer userId) {
        return menuMapper.selAllMenuByUser(userId);
    }

    @Override
    public List<Menu> queryMenuAllList(Menu menu) {
        return menuMapper.queryMenuAllList(menu);
    }

    @Override
    public int addMenu(Menu menu) {
        return menuMapper.addMenu(menu);
    }

    @Override
    public int deleteMenu(Integer id) {
        return menuMapper.deleteMenu(id);
    }

    @Override
    public int checkMenuHasChildren(Integer pid) {
        return menuMapper.checkMenuHasChildren(pid);
    }

    @Override
    public int updateMenu(Menu menu) {
        return menuMapper.updateMenu(menu);
    }
}
