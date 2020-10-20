/*
 * (c) Copyright 2015-2016 Micro Focus or one of its affiliates.
 *
 * Licensed under the MIT License (the "License"); you may not use this file
 * except in compliance with the License.
 *
 * The only warranties for products and services of Micro Focus and its affiliates
 * and licensors ("Micro Focus") are as may be set forth in the express warranty
 * statements accompanying such products and services. Nothing herein should be
 * construed as constituting an additional warranty. Micro Focus shall not be
 * liable for technical or editorial errors or omissions contained herein. The
 * information contained herein is subject to change without notice.
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
