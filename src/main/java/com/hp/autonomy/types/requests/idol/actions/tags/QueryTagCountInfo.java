/*
 * Copyright 2015-2016 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.tags;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

/**
 * Value/Count information for a single element in a simple QueryTagResponse
 */
@SuppressWarnings("WeakerAccess")
@Data
@RequiredArgsConstructor
public class QueryTagCountInfo implements Serializable {
    private static final long serialVersionUID = 1036897651028995652L;

    private final String value;
    private final String displayValue;
    private final int count;
}
