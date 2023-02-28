package com.tian.service.Impl;

import com.tian.entity.Paiban;
import com.tian.mapper.MainMapper;
import com.tian.service.MainService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
@CacheConfig(cacheNames = "Paiban")
public class MainServiceImpl implements MainService {
    @Resource
    private MainMapper mainMapper;
    @Override
    @Cacheable(key = "'one'",unless="#result == null")
    public List<Paiban> one() {
        return mainMapper.one();
    }

    @Override
    @Cacheable(key = "'two'",unless="#result == null")
    public List<Paiban> two() {
        return mainMapper.two();
    }

    @Override
    @Cacheable(key = "'three'",unless="#result == null")
    public List<Paiban> three() {
        return mainMapper.three();
    }

    @Override
    @Cacheable(key = "'four'",unless="#result == null")
    public List<Paiban> four() {
        return mainMapper.four();
    }

    @Override
    @Cacheable(key = "'five'",unless="#result == null")
    public List<Paiban> five() {
        return mainMapper.five();
    }

    @Override
    @Cacheable(key = "'six'",unless="#result == null")
    public List<Paiban> six() {
        return mainMapper.six();
    }

    @Override
    @Cacheable(key = "'seven'",unless="#result == null")
    public List<Paiban> seven() {
        return mainMapper.seven();
    }

    @Override
    public int currentNum() {
        return mainMapper.currentNum();
    }

    @Override
    public int Total() {
        return mainMapper.Total();
    }

    @Override
    public int zhuyuanTotal() {
        return mainMapper.zhuyuanTotal();
    }

    @Override
    public int currentZhuYuan() {
        return mainMapper.currentZhuYuan();
    }


}
