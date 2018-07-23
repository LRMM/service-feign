package com.sdyin.servicefeign.service.impl;

import com.sdyin.servicefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Service;

/**
 * @Author: liuye
 * @Date: 2018/7/23 11:12
 */
@Service
public class SchedualServiceHiHystric implements SchedualServiceHi {

  @Override
  public String sayHi(String name) {
    return "sorry:" + name;
  }
}
