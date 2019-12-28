package b8.ar388989.meru.promotion_service.service;

import b8.ar388989.meru.promotion_service.dao.PromotionDao;
import b8.ar388989.meru.promotion_service.domain.Promotion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;

@Service
public class PromotionService implements IPromotionService {

    @Autowired
    PromotionDao promotionDao;


    @Override
    @Transactional
    public Promotion create(Promotion promotion) {
        return promotionDao.addPromotion(promotion);
    }

    @Override
    public Promotion updatePromotion(Promotion promotion) {
        return promotionDao.updatePromotion(promotion);
    }

    @Override
    public boolean deletePromotion(Promotion promotion) {
        boolean deleteSuccess = false;
        try{
            promotionDao.deletePromotion(promotion);
            deleteSuccess = true;
        }catch (Exception ex){

        }
        return deleteSuccess;
    }

    @Override
    public Set<Promotion> findAllPromotions() {
        return promotionDao.fetchAllPromotions();
    }

    @Override
    public int findPercentageDiscountUsingProductId(String productId) {
        return promotionDao.fetchPercentageDiscountUsingProductId(productId);
    }

    @Override
    public boolean findIsShippingFreeUsingProductId(String productId) {
        return promotionDao.fetchIsShippingFreeUsingProductId(productId);
    }

    @Override
    public boolean findIsBogoProductUsingProductId(String productId) {
        return promotionDao.fetchIsBogoProductUsingProductId(productId);
    }
}
