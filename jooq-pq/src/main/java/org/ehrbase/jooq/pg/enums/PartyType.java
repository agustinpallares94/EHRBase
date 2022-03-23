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
public enum PartyType implements EnumType {

    party_identified("party_identified"),

    party_self("party_self"),

    party_related("party_related");

    private final String literal;

    private PartyType(String literal) {
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
        return "party_type";
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal
     */
    public static PartyType lookupLiteral(String literal) {
        return EnumType.lookupLiteral(PartyType.class, literal);
    }
}
