package b8.ar388989.meru.promotion_service;

import b8.ar388989.meru.promotion_service.controller.PromotionController;
import b8.ar388989.meru.promotion_service.dao.IPromoRepo;
import b8.ar388989.meru.promotion_service.dao.PromotionDao;
import b8.ar388989.meru.promotion_service.domain.Promotion;
import b8.ar388989.meru.promotion_service.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
public class PromotionServiceApplication implements CommandLineRunner {

    @Autowired
    PromotionService promotionService;

    public static void main(String[] args) {
        SpringApplication.run(PromotionServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Promotion promo1 = new Promotion("123", 33);
        Promotion promo2 = new Promotion("345", 50);
        Promotion promo3 = new Promotion("567", 10, true, true);

        promotionService.create(promo1);
        promotionService.create(promo2);
        promotionService.create(promo3);

//        for(Promotion eachPromo : promotionService.findAllPromotions()){
//            System.out.println(eachPromo.toString());
//        }
     }
}
