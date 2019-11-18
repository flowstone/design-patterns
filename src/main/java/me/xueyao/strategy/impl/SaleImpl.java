package me.xueyao.strategy.impl;

import me.xueyao.strategy.Strategy;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author Simon.Xue
 * @date 2019-11-18 10:33
 **/
@Service
public class SaleImpl implements Strategy {
    @Override
    public BigDecimal calculate(BigDecimal price) {
        return price.subtract(new BigDecimal("100"));
    }
}
