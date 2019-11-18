package me.xueyao.strategy;

import java.math.BigDecimal;

/**
 * @author Simon.Xue
 * @date 2019-11-18 10:27
 **/
public interface Strategy {

    BigDecimal calculate(BigDecimal price);
}
