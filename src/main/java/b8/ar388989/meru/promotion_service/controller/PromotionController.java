package b8.ar388989.meru.promotion_service.controller;

import b8.ar388989.meru.promotion_service.domain.Promotion;
import b8.ar388989.meru.promotion_service.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class PromotionController implements IPromotionController {

    @Autowired
    PromotionService promotionService;

    @Override
    @PostMapping(value = "/create")
    public Promotion create(@RequestBody String productId) {
        Promotion promo = new Promotion(productId);
        return promotionService.create(promo);
    }

    @Override
    @PostMapping(value = "/createPromotion")
    public Promotion createPromotion(@RequestBody Promotion promotion) {
        return promotionService.create(promotion);
    }

    @Override
    @PutMapping  (value = "/update_promotion")
    public Promotion updatePromotion(@RequestBody Promotion promotion) {
        return promotionService.updatePromotion(promotion);
    }

    @Override
    @DeleteMapping(value = "/delete_promotion")
    public boolean deletePromotion(@RequestBody Promotion promotion) {
        return promotionService.deletePromotion(promotion);
    }

    @Override
    @RequestMapping(value = "/get_all_promotions", method = RequestMethod.GET)
    public Set<Promotion> getAllPromotions() {
        return promotionService.findAllPromotions();
    }

    @Override
    @RequestMapping(value = "/get_percentage_discount/{productId}", method = RequestMethod.GET)
    public int getPercentageDiscountUsingProductId(@PathVariable String productId) {
        return promotionService.findPercentageDiscountUsingProductId(productId);
    }

    @Override
    @RequestMapping(value = "/is_shipping_free/{productId}", method = RequestMethod.GET)
    public boolean isShippingFreeUsingProductId(@PathVariable String productId) {
        return promotionService.findIsShippingFreeUsingProductId(productId);
    }

    @Override
    @RequestMapping(value = "/is_bogo/{productId}", method = RequestMethod.GET)
    public boolean isBogoProductUsingProductId(@PathVariable String productId) {
        return promotionService.findIsBogoProductUsingProductId(productId);
    }
}
