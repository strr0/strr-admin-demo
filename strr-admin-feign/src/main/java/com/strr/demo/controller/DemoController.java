package com.strr.demo.controller;

import com.strr.base.model.Result;
import com.strr.demo.client.SysResourceFeignClient;
import com.strr.demo.model.SysResource;
import com.strr.demo.model.vo.SysResourceVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {
    private SysResourceFeignClient sysResourceFeignClient;

    public DemoController(SysResourceFeignClient sysResourceFeignClient) {
        this.sysResourceFeignClient = sysResourceFeignClient;
    }

    @GetMapping("/menuTree")
    public Result<List<SysResourceVO>> menuTree(SysResource param) {
        return sysResourceFeignClient.menuTree(param);
    }
}
