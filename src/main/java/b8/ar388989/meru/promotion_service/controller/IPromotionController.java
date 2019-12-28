package b8.ar388989.meru.promotion_service.controller;

import b8.ar388989.meru.promotion_service.domain.Promotion;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

public interface IPromotionController {

    public Promotion create(String productId);
    public Promotion createPromotion(Promotion promotion);
    public Promotion updatePromotion(Promotion promotion);
    public boolean deletePromotion(Promotion promotion);
    public Set<Promotion> getAllPromotions();

    public int getPercentageDiscountUsingProductId(String productId);
    public boolean isShippingFreeUsingProductId(String productId);
    public boolean isBogoProductUsingProductId(String productId);
}
