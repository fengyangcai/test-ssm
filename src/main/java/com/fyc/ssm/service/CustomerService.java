package com.fyc.ssm.service;

import com.fyc.ssm.pojo.Customer;

/**
 * @program: test-ssm
 * @description:
 * @author: fyc
 * @create: 2021-01-07
 */
public interface CustomerService {

   int insertCustomer(Customer customer);

    Customer queryById(Integer id);
}
