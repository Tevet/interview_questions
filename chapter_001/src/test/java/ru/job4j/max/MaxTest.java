package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Описывает точку в системе координат x и y.
 * @author Alexandr Abramov (alllexe@mail.ru)
 * @since 16.01.2019
 * @version 1
 */
public class MaxTest {

    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }
}
