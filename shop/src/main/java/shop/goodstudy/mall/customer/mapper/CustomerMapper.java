package shop.goodstudy.mall.customer.mapper;

import org.apache.ibatis.annotations.Mapper;
import shop.goodstudy.mall.customer.vo.Auth;

@Mapper
public interface CustomerMapper {
    boolean login(Auth auth);
}
