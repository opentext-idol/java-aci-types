/*
 * Copyright 2017 Open Text.
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
import java.util.Collection;

@SuppressWarnings({"WeakerAccess", "unused"})
public interface RangeInfoBuilder<T extends Comparable<? super T> & Serializable, D extends Comparable<D> & Serializable, V extends RangeInfoValue<T, D>, R extends RangeInfo<T, D, V, R, B>, B extends RangeInfoBuilder<T, D, V, R, B>> {
    B id(String id);

    B displayName(String displayName);

    B count(int count);

    B min(T min);

    B max(T max);

    B bucketSize(D bucketSize);

    B values(Collection<? extends V> values);

    B value(V value);

    B clearValues();

    R build();
}
