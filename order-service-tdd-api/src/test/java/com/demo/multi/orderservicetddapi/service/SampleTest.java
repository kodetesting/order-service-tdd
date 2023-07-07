package com.demo.multi.orderservicetddapi.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SampleTest {

    @Test
    void test1() {
        int i = 12;
        Assertions.assertThat(i)
                .isEqualTo(12)
                .isEven();
    }

    @Test
    void test2() {
        int i = 2;
        Assertions.assertThat(i)
                .isEqualTo(2)
                .isEven();
    }


}
