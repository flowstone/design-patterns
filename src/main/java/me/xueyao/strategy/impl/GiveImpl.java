package me.xueyao.strategy.impl;

import me.xueyao.strategy.Strategy;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author Simon.Xue
 * @date 2019-11-18 10:32
 **/
@Service
public class GiveImpl implements Strategy {
    @Override
    public BigDecimal calculate(BigDecimal price) {
        return price.add(new BigDecimal("0.8"));
    }
}
