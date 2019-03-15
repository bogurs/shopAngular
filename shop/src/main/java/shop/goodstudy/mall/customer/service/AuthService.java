package shop.goodstudy.mall.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.goodstudy.mall.customer.repository.AuthRepository;
import shop.goodstudy.mall.customer.model.Customer;

@Service
public class AuthService {

    private AuthRepository authRepository;

    @Autowired
    public AuthService(AuthRepository authRepository) {
        this.authRepository = authRepository;
    }

    public boolean login(Customer customer) {
        return authRepository.login(customer);
    }
}
