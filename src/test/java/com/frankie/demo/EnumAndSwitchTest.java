package com.frankie.demo;

import com.frankie.demo.oop.SeasonEnum;
import com.frankie.demo.utils.Utils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: Yao Frankie
 * @date: 2020/2/28 16:05
 */
@SpringBootTest(classes = EnumAndSwitchTest.class)
public class EnumAndSwitchTest {

    public static final int SEASON_SPRING = 1;
    public static final int SEASON_SUMMER = 2;
    public static final int SEASON_FALL   = 3;
    public static final int SEASON_WINTER = 4;

    @Test
    void simpleEnumTest(){
//        for (SeasonEnum season: SeasonEnum.values())
//            System.out.println("Season: " + season);

        Utils.describeSeason(SeasonEnum.SPRING);
    }
}
