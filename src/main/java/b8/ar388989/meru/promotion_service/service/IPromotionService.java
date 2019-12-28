package b8.ar388989.meru.promotion_service.service;

import b8.ar388989.meru.promotion_service.domain.Promotion;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface IPromotionService {

    public Promotion create(Promotion promotion);
    public Promotion updatePromotion(Promotion promotion);
    public boolean deletePromotion(Promotion promotion);
    public Set<Promotion> findAllPromotions();

    public int findPercentageDiscountUsingProductId(String productId);
    public boolean findIsShippingFreeUsingProductId(String productId);
    public boolean findIsBogoProductUsingProductId(String productId);
}
