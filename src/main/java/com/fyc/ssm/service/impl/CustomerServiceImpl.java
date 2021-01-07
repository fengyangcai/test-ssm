package com.fyc.ssm.service.impl;

import com.fyc.ssm.mapper.CustomerMapper;
import com.fyc.ssm.pojo.Customer;
import com.fyc.ssm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @program: test-ssm
 * @description:
 * @author: fyc
 * @create: 2021-01-07
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public int insertCustomer(Customer customer) {
        if (customer.getCreatetime()==null){
            customer.setCreatetime(new Date());
        }
        customerMapper.insertCustomer(customer);
        return customer.getId();
    }

    @Override
    public Customer queryById(Integer id) {
        return customerMapper.queryById(id);
    }
}
