package com.junode.edu.ad.service;

import com.junode.edu.ad.entity.PromotionSpace;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * * @since 2020-06-18
 */
public interface IPromotionSpaceService extends IService<PromotionSpace> {

    PromotionSpace getBySpaceKey(String spaceKey);

}
