package b8.ar388989.meru.promotion_service.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table
public class Promotion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer promotionId;

    @Column
    String productId;

    @Column
    int percentageDiscount;

    @Column
    boolean isShippingFree;

    @Column
    boolean isBogo;

    public Promotion(String productId){
        this.productId = productId;
    }

    public Promotion(String productId, int percentageDiscount){
        this.productId = productId;
        this.percentageDiscount = percentageDiscount;
    }

    public Promotion(String productId, int percentageDiscount, boolean isShippingFree, boolean isBogo){
        this.productId = productId;
        this.percentageDiscount = percentageDiscount;
        this.isShippingFree = isShippingFree;
        this.isBogo = isBogo;
    }
}
