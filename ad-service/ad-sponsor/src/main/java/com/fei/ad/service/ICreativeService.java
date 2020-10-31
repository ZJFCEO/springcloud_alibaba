package com.fei.ad.service;


import com.fei.ad.vo.CreativeRequest;
import com.fei.ad.vo.CreativeResponse;

/**
 * Created by Qinyi.
 */
public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}
