package b8.ar388989.meru.promotion_service.dao;

import b8.ar388989.meru.promotion_service.domain.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface IPromoRepo extends JpaRepository<Promotion, Integer> {
    public Promotion getPromotionByProductId(String productId);
}
