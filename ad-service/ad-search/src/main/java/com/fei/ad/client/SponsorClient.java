package com.fei.ad.client;

import com.fei.ad.client.vo.AdPlan;
import com.fei.ad.client.vo.AdPlanGetRequest;
import com.fei.ad.vo.CommonResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Qinyi.
 */
@FeignClient(value = "eureka-client-ad-sponsor",
        fallback = com.fei.ad.client.SponsorClientHystrix.class)
public interface SponsorClient {

    @RequestMapping(value = "/ad-sponsor/get/adPlan",
            method = RequestMethod.POST)
    CommonResponse<List<AdPlan>> getAdPlans(
            @RequestBody AdPlanGetRequest request);
}
