package com.junode.edu.pay.service.impl;

import com.junode.edu.pay.entity.PayOrderRecord;
import com.junode.edu.pay.mapper.PayOrderRecordMapper;
import com.junode.edu.pay.service.IPayOrderRecordService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: ma wei long
 * @date:   2020年6月22日 上午12:26:35
 */
@Slf4j
@Service
public class PayOrderRecordServiceImpl extends ServiceImpl<PayOrderRecordMapper, PayOrderRecord> implements IPayOrderRecordService {
}
