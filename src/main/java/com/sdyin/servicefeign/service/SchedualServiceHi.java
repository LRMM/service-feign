package com.sdyin.servicefeign.service;

import com.sdyin.servicefeign.service.impl.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: liuye
 * @Date: 2018/7/23 11:02
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

  @RequestMapping(value = "/hi",method = RequestMethod.GET)
  String sayHi(@RequestParam(value = "name") String name);
}
