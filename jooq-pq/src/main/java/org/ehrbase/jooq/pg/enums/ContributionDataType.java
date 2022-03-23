/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.enums;


import org.ehrbase.jooq.pg.Ehr;
import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum ContributionDataType implements EnumType {

    composition("composition"),

    folder("folder"),

    ehr("ehr"),

    system("system"),

    other("other");

    private final String literal;

    private ContributionDataType(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return getSchema().getCatalog();
    }

    @Override
    public Schema getSchema() {
        return Ehr.EHR;
    }

    @Override
    public String getName() {
        return "contribution_data_type";
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal
     */
    public static ContributionDataType lookupLiteral(String literal) {
        return EnumType.lookupLiteral(ContributionDataType.class, literal);
    }
}
