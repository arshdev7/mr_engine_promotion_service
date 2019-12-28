package b8.ar388989.meru.promotion_service.dao;

import b8.ar388989.meru.promotion_service.domain.Promotion;
import org.springframework.stereotype.Repository;

import java.util.Set;

public interface IPromotionDao {

    public Promotion addPromotion(Promotion promotion);
    public Promotion updatePromotion(Promotion promotion);
    public void deletePromotion(Promotion promotion);
    public Set<Promotion> fetchAllPromotions();

    public int fetchPercentageDiscountUsingProductId(String productId);
    public boolean fetchIsShippingFreeUsingProductId(String productId);
    public boolean fetchIsBogoProductUsingProductId(String productId);
}
