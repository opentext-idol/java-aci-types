/*
 * Copyright 2016-2017 Hewlett Packard Enterprise Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.tags;

import java.io.Serializable;

@SuppressWarnings("unused")
public interface ValueDetails<T extends Comparable<? super T>> extends Serializable {
    T getMin();

    T getMax();

    T getAverage();

    double getSum();

    int getTotalValues();
}
