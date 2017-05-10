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
