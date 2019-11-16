package com.imooc.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ClientController
 * @Description TODO
 * @Author wushaopei
 * @Date 2019/11/15 16:34
 * @Version 1.0
 */
@RestController
@Slf4j
public class ClientController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getProductMsg")
    public String getProductMsg(){
         //1.第一种方式 直接使用restTemplate,url写死
        RestTemplate restTemplate = new RestTemplate();
        String response  = restTemplate.getForObject("http://localhost:8772/msg", String.class);

        // 2. 第二种方式 (利用loadBalancerClient通过应用名获取url,然后再使用restTemplate)
//        ServiceInstance serviceInstance = loadBalancerClient.choose("CLIENT");
//        String host = serviceInstance.getHost();
//        int port = serviceInstance.getPort();
//        log.info("{}-{}",host,port);
//        String url = String.format("http://%s:%s", host, port+"/msg");
//        RestTemplate restTemplate = new RestTemplate();
//        String response  = restTemplate.getForObject(url, String.class);


//        //3.第三种方式(利用@LoadBalanced,可在restTemplate里使用应用名字)
//        String response = restTemplate.getForObject("http://PRODUCT/msg",String.class);
//        log.info("response={}",response);
        return response;
//        return null;
    }
}
