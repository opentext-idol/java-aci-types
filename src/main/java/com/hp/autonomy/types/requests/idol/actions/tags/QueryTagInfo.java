/*
 * Copyright 2015-2016 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.tags;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.io.Serializable;
import java.util.Set;

/**
 * Value/Count information for a single element in a simple QueryTagResponse
 */
@SuppressWarnings({"unused", "WeakerAccess"})
@Data
@Builder(toBuilder = true)
public class QueryTagInfo implements Serializable {
    private static final long serialVersionUID = 7511499868253213698L;
    private final String id;
    private final String displayName;
    private final Integer totalValues;
    @Singular
    private final Set<QueryTagCountInfo> values;
}
