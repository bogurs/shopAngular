package shop.goodstudy.mall.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shop.goodstudy.mall.customer.service.CustomerService;
import shop.goodstudy.mall.customer.vo.Auth;

@RestController
@RequestMapping(value = "/auth")
public class AuthController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/login")
    public boolean login(@RequestBody Auth auth) {
        return customerService.login(auth);
    }
}
