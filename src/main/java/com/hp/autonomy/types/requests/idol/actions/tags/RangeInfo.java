/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.tags;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings({"WeakerAccess", "unused"})
public interface RangeInfo<T extends Comparable<? super T> & Serializable, D extends Comparable<D> & Serializable, V extends RangeInfoValue<T, D>, R extends RangeInfo<T, D, V, R, B>, B extends RangeInfoBuilder<T, D, V, R, B>> extends Serializable {
    String getId();

    String getDisplayName();

    int getCount();

    T getMin();

    T getMax();

    D getBucketSize();

    List<V> getValues();

    B toBuilder();
}
