package com.hp.autonomy.types.requests.idol.actions.query.params;

public enum CombineParam {
    Simple,
    ReferenceField,
    FieldCheck,
    MetadataField;

    public static CombineParam fromValue(final String value) {
        for (final CombineParam param : values()) {
            if (param.name().equalsIgnoreCase(value)) {
                return param;
            }
        }

        throw new IllegalArgumentException("Unknown combine param " + value);
    }

    public static CombineParam fromValue(final String value, final CombineParam defaultValue) {
        CombineParam match = defaultValue;

        for (final CombineParam param : values()) {
            if (param.name().equalsIgnoreCase(value)) {
                match = param;
                break;
            }
        }

        return match;
    }
}
