package com.cloud.xl.demo.controller;

import com.alibaba.fastjson.JSON;
import com.cloud.xl.demo.bean.TestBean;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String test(@RequestBody TestBean testBean) {
        return JSON.toJSONString(testBean);
    }

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return name;
    }
}
