package me.xueyao.strategy;

import me.xueyao.strategy.enums.StrategyEnums;
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
        //第一种方式
        //BigDecimal calculate = strategyMap.get("give").calculate(new BigDecimal("100" ));

        //第二种方式
        BigDecimal calculate = strategyMap.get(StrategyEnums.enumName(StrategyEnums.GIVE)).calculate(new BigDecimal("100" ));
        System.out.println(calculate);
    }

    @Test
    public void testSale() {
        //第一种方式
        //BigDecimal calculate = strategyMap.get("saleImpl").calculate(new BigDecimal("180" ));

        //第二种方式
        BigDecimal calculate = strategyMap.get(StrategyEnums.enumName(StrategyEnums.SALE)).calculate(new BigDecimal("180" ));
        System.out.println(calculate);
    }
}
