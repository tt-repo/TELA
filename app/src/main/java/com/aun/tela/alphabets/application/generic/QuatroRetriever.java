package com.aun.tela.alphabets.application.generic;

/**
 * Created by Joseph Dalughut on 29/12/15 at 10:45 PM.
 * Project name : Alphabets.
 * Copyright (c) 2015 Meengle. All rights reserved.
 */
public interface QuatroRetriever<T, U, V, W, X> {
    T retrieve(U u, V v, W w, X x);
}
