package shop.goodstudy.mall.customer.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import shop.goodstudy.mall.customer.model.Customer;

@Repository
@Mapper
public interface AuthRepository {
    boolean login(Customer customer);
}
