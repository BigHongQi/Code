package com.liuhq.security.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liuhq.security.domain.Menu;

import java.util.List;

public interface MenuMapper extends BaseMapper<Menu> {
    List<String> selectPermsByUserId(Long id);
}