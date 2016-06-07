/*
 * Copyright 2015-2016 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.tags;

import lombok.Data;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Value/Count information for a single element in a simple QueryTagResponse
 */
@SuppressWarnings("unused")
@Data
public class QueryTagInfo implements Serializable {
    private static final long serialVersionUID = 7511499868253213698L;
    private final String id;
    private final String name;
    private final Set<QueryTagCountInfo> values;

    public QueryTagInfo(final TagName tagName, final Set<QueryTagCountInfo> values) {
        id = tagName.getId();
        name = tagName.getName();
        this.values = new LinkedHashSet<>(values);
    }
}
