package com.sky.service;

import com.sky.dto.DishDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


public interface DishService {

    /**
     * 新增菜品和对应口味
     * @param dishDTO
     */

    public void saveWithFlavor(DishDTO dishDTO);
}
