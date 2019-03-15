package shop.goodstudy.mall.customer.vo;

import lombok.Data;

@Data
public class Auth {
    private String customerId;
    private String customerPw;
    private String customerName;
    private String customerEmail;
}
