package com.junode.edu.common.web.entity.vo;

import com.junode.edu.common.web.entity.po.BasePo;
import lombok.NoArgsConstructor;

import java.io.Serializable;

////@Data
@NoArgsConstructor
public class BaseVo<T extends BasePo> implements Serializable {
    private String id;
}
