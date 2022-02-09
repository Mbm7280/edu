package com.junode.edu.ad.service;

import com.junode.edu.ad.entity.PromotionAd;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * * @since 2020-06-18
 */
public interface IPromotionAdService extends IService<PromotionAd> {

    List<PromotionAd> getByPromotionSpaceId(Integer promotionSpaceId);

}
