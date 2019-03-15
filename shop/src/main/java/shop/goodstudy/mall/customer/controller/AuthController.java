package shop.goodstudy.mall.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shop.goodstudy.mall.customer.service.AuthService;
import shop.goodstudy.mall.customer.model.Customer;

@RestController
@RequestMapping(value = "/auth")
public class AuthController {

    private AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public boolean login(@RequestBody Customer customer) {
        return authService.login(customer);
    }
}
