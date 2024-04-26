package net.asestefan.utils;

/*
@Author = ASEStefan
 */
public interface MathOperandUtils<T> {
    public T add(T value);

    public T sub(T value);

    public T mul(T value);

    public T div(T value);

    public T clamp(T min, T max);

    public T lerp(T value, float t);

    public T copy();
}
