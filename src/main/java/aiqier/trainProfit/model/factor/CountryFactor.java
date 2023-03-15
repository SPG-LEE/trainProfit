package aiqier.trainProfit.model.factor;

import lombok.Data;

/**
 * @author mrlee
 */
@Data
public class CountryFactor {
    /*
    时间因子名称--key
     */
    private String name;
    /*
    权重
     */
    private double weight;
}
