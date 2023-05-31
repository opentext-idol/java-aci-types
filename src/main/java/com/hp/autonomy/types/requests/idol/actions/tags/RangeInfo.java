/*
 * Copyright 2016-2017 Open Text.
 *
 * Licensed under the MIT License (the "License"); you may not use this file
 * except in compliance with the License.
 *
 * The only warranties for products and services of Open Text and its affiliates
 * and licensors ("Open Text") are as may be set forth in the express warranty
 * statements accompanying such products and services. Nothing herein should be
 * construed as constituting an additional warranty. Open Text shall not be
 * liable for technical or editorial errors or omissions contained herein. The
 * information contained herein is subject to change without notice.
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
