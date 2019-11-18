package me.xueyao.strategy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author Simon.Xue
 * @date 2019-11-18 10:37
 **/

@SpringBootTest
public class StrategyTest {

    @Autowired
    private Map<String, Strategy> strategyMap;

    @Test
    public void testGive() {
        BigDecimal calculate = strategyMap.get("give").calculate(new BigDecimal("100" ));
        System.out.println(calculate);
    }

    @Test
    public void testSale() {
        BigDecimal calculate = strategyMap.get("sale").calculate(new BigDecimal("180" ));
        System.out.println(calculate);
    }
}
