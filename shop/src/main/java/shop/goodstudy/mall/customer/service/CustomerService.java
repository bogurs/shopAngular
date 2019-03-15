package shop.goodstudy.mall.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.goodstudy.mall.customer.mapper.CustomerMapper;
import shop.goodstudy.mall.customer.vo.Auth;

@Service
public class CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    public boolean login(Auth auth) {
        return customerMapper.login(auth);
    }
}
