/*
 * Copyright 2017 Hewlett Packard Enterprise Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.tags;

import java.io.Serializable;

@SuppressWarnings("unused")
public interface RangeInfoValue<T extends Comparable<? super T>, D extends Comparable<D> & Serializable> extends Serializable {
    T getMin();

    T getMax();

    D getBucketSize();

    int getCount();

    void addData(int count);

    @FunctionalInterface
    interface Constructor<T extends Comparable<? super T> & Serializable, D extends Comparable<D> & Serializable, V extends RangeInfoValue<T, D>> {
        V apply(T min, T max, int count);
    }
}
