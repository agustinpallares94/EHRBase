/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.tables.records;


import java.util.UUID;

import org.ehrbase.jooq.pg.tables.AttestationRef;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AttestationRefRecord extends UpdatableRecordImpl<AttestationRefRecord> implements Record1<UUID> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ehr.attestation_ref.ref</code>.
     */
    public void setRef(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>ehr.attestation_ref.ref</code>.
     */
    public UUID getRef() {
        return (UUID) get(0);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<UUID> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<UUID> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return AttestationRef.ATTESTATION_REF.REF;
    }

    @Override
    public UUID component1() {
        return getRef();
    }

    @Override
    public UUID value1() {
        return getRef();
    }

    @Override
    public AttestationRefRecord value1(UUID value) {
        setRef(value);
        return this;
    }

    @Override
    public AttestationRefRecord values(UUID value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AttestationRefRecord
     */
    public AttestationRefRecord() {
        super(AttestationRef.ATTESTATION_REF);
    }

    /**
     * Create a detached, initialised AttestationRefRecord
     */
    public AttestationRefRecord(UUID ref) {
        super(AttestationRef.ATTESTATION_REF);

        setRef(ref);
    }
}
