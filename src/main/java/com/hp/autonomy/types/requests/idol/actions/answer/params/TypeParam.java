/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */
package com.hp.autonomy.types.requests.idol.actions.answer.params;

@SuppressWarnings({"WeakerAccess", "unused"})
public enum TypeParam {
    ANSWER("answer"),
    QUESTION("question"),
    QUESTION_EQUIVALENCE_CLASS("question_equivalence_class"),
    RULE_SUGGESTION("rule_suggestion"),
    SCHEMA("schema"),
    XSD("xsd");

    private final String value;

    TypeParam(final String value) {
        this.value = value;
    }

    public static TypeParam fromValue(final String value) {
        for(final TypeParam param : values()) {
            if(param.name().equalsIgnoreCase(value)) {
                return param;
            }
        }

        throw new IllegalArgumentException("Unknown type " + value);
    }

    public String value() {
        return value;
    }
}
