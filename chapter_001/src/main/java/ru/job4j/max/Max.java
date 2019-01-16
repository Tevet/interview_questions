package ru.job4j.max;

/**
 * Описывает точку в системе координат x и y.
 * @author Alexandr Abramov (alllexe@mail.ru)
 * @since 16.01.2019
 * @version 1
 */
public class Max {

    /**
     * Максимум из двух чисел.
     * @param first первое число.
     * @param second второе число.
     * @return максимум из first и second
     */
    public int max(int first, int second) {
        return  first > second ? first : second;
    }

}
