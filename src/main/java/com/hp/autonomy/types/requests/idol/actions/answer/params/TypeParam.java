/*
 * Copyright 2015 Open Text.
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
package com.hp.autonomy.types.requests.idol.actions.answer.params;

@SuppressWarnings({"WeakerAccess", "unused"})
public enum TypeParam {
    ANSWER("answer"),
    QUESTION("question"),
    QUESTION_EQUIVALENCE_CLASS("question_equivalence_class"),
    RULE_SUGGESTION("rule_suggestion"),
    SCHEMA("schema"),
    SYNONYM("synonym"),
    XSD("xsd");

    private final String value;

    TypeParam(final String value) {
        this.value = value;
    }

    public static TypeParam fromValue(final String value) {
        for(final TypeParam param : values()) {
            if(param.value().equalsIgnoreCase(value)) {
                return param;
            }
        }

        throw new IllegalArgumentException("Unknown type " + value);
    }

    public String value() {
        return value;
    }
}
