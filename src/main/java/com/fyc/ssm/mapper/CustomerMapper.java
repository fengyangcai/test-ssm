package com.fyc.ssm.mapper;

import com.fyc.ssm.pojo.Customer;

public interface CustomerMapper {
    int insertCustomer(Customer customer);
    Customer queryById(Integer id);

}
