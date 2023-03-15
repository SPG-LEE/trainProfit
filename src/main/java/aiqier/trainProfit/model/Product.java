package aiqier.trainProfit.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mrlee
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String shopName;
    private String sku;
    private double basePrice;
    private double totalPrice;
    private int totalAmount;
    private double percent;
    private String date;
}
