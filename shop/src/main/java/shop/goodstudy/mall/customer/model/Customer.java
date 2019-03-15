package shop.goodstudy.mall.customer.model;

import lombok.Data;

@Data
public class Customer {
    private String customerId;
    private String customerPw;
    private String customerName;
    private String customerEmail;
}
