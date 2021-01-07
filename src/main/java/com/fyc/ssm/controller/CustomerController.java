package com.fyc.ssm.controller;

import com.fyc.ssm.pojo.Customer;
import com.fyc.ssm.pojo.Result;
import com.fyc.ssm.pojo.ResultCode;
import com.fyc.ssm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @program: test-ssm
 * @description:
 * @author: fyc
 * @create: 2021-01-07
 */
@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/customer",method = RequestMethod.POST)
    @ResponseBody
    public Result add(@RequestBody Customer customer){
        Integer id=  customerService.insertCustomer(customer);
        return new Result(ResultCode.SUCCESS,id);
    }

    @RequestMapping(value = "/customer/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Result get(@PathVariable(value = "id")Integer id){
        System.out.println(id);
       Customer customer= customerService.queryById(id);
        return new Result(ResultCode.SUCCESS,customer);
    }
}
