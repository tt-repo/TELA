package com.aun.tela.alphabets.application.generic;

<<<<<<< HEAD
public interface Consumer<T> {
    T consume();
}
=======
/**
 * Created by Joseph Dalughut on 29/12/15 at 10:45 PM.
 * Project name : Alphabets.
 * Copyright (c) 2015 Meengle. All rights reserved.
 */

/**
 * A simple generic Consumer interface which returns a data type by consuming another
 * @param <T> the data type to be returned
 * @param <V> the data type to be consumed
 */
public interface Consumer<T, V> {
    T consume(V v);
}
>>>>>>> 6f985d95ba92fb5c71815fabe8a04fe66a0f7d7a
