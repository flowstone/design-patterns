package me.xueyao.strategy.enums;

import me.xueyao.strategy.impl.GiveImpl;
import me.xueyao.strategy.impl.SaleImpl;

/**
 * @author Simon.Xue
 * @date 2019-11-18 11:06
 **/
public enum StrategyEnums {

    SALE("sale", SaleImpl.class),
    GIVE("give", GiveImpl.class);

    String name;
    Class clazz;

    StrategyEnums(String name, Class clazz) {
        this.name = name;
        this.clazz = clazz;
    }

    public String getName() {
        return name;
    }

    public Class getClazz() {
        return clazz;
    }


    public static String enumName(StrategyEnums enums) {
        String simpleName = enums.getClazz().getSimpleName();
        return  Character.toLowerCase(simpleName.charAt(0)) + simpleName.substring(1);
    }

    /*public static void main(String[] args) {
        System.out.println(StrategyEnums.GIVE.getClazz().getSimpleName());
    }*/




}
