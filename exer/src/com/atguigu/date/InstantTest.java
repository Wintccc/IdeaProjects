package com.atguigu.date;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * @author Wint
 * @create 2022-05-28 17:06
 */
public class InstantTest {
    public static void main(String[] args) {

        Instant now = Instant.now();
        OffsetDateTime offsetDateTime = now.atOffset(ZoneOffset.ofHours(8));
        System.out.println(now);
        System.out.println(offsetDateTime);
    }
}
