package b8.ar388989.meru.promotion_service.dao;

import b8.ar388989.meru.promotion_service.domain.Promotion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class PromotionDao implements IPromotionDao {

    @Autowired
    IPromoRepo promoRepo;

    @Override
    public Promotion addPromotion(Promotion promotion) {
        return promoRepo.save(promotion);
    }

    @Override
    public Promotion updatePromotion(Promotion promotion) {
        return promoRepo.save(promotion);
    }

    @Override
    public void deletePromotion(Promotion promotion) {
        promoRepo.delete(promotion);
    }

    @Override
    public Set<Promotion> fetchAllPromotions() {
        return new HashSet<>(promoRepo.findAll());
    }

    @Override
    public int fetchPercentageDiscountUsingProductId(String productId) {
        return promoRepo.getPromotionByProductId(productId).getPercentageDiscount();
    }

    @Override
    public boolean fetchIsShippingFreeUsingProductId(String productId) {
        return promoRepo.getPromotionByProductId(productId).isShippingFree();
    }

    @Override
    public boolean fetchIsBogoProductUsingProductId(String productId) {
        return promoRepo.getPromotionByProductId(productId).isBogo();
    }
}
