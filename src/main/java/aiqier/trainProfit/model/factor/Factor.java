package aiqier.trainProfit.model.factor;

import lombok.Data;

/**
 * @author mrlee
 */
@Data
public class Factor {
    private String sku;
    /*
    时间因子
     */
    private double t_w;
    /*
    国家因子
     */
    private double c_w;
    /*
    时间_国家_因子
     */
    private double t_c_w;
}
