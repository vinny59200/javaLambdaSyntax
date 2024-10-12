package com.vv.lambdaSyntax;

@FunctionalInterface
interface ConverterFunction<T, U, R> {
    R apply(T t, U u);
}
