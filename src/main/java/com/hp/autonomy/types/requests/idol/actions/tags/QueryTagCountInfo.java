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
