/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.tables.records;


import java.util.UUID;

import org.ehrbase.jooq.pg.tables.AdminGetLinkedContributions;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AdminGetLinkedContributionsRecord extends TableRecordImpl<AdminGetLinkedContributionsRecord> implements Record2<UUID, UUID> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ehr.admin_get_linked_contributions.contribution</code>.
     */
    public void setContribution(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>ehr.admin_get_linked_contributions.contribution</code>.
     */
    public UUID getContribution() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>ehr.admin_get_linked_contributions.audit</code>.
     */
    public void setAudit(UUID value) {
        set(1, value);
    }

    /**
     * Getter for <code>ehr.admin_get_linked_contributions.audit</code>.
     */
    public UUID getAudit() {
        return (UUID) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<UUID, UUID> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<UUID, UUID> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return AdminGetLinkedContributions.ADMIN_GET_LINKED_CONTRIBUTIONS.CONTRIBUTION;
    }

    @Override
    public Field<UUID> field2() {
        return AdminGetLinkedContributions.ADMIN_GET_LINKED_CONTRIBUTIONS.AUDIT;
    }

    @Override
    public UUID component1() {
        return getContribution();
    }

    @Override
    public UUID component2() {
        return getAudit();
    }

    @Override
    public UUID value1() {
        return getContribution();
    }

    @Override
    public UUID value2() {
        return getAudit();
    }

    @Override
    public AdminGetLinkedContributionsRecord value1(UUID value) {
        setContribution(value);
        return this;
    }

    @Override
    public AdminGetLinkedContributionsRecord value2(UUID value) {
        setAudit(value);
        return this;
    }

    @Override
    public AdminGetLinkedContributionsRecord values(UUID value1, UUID value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AdminGetLinkedContributionsRecord
     */
    public AdminGetLinkedContributionsRecord() {
        super(AdminGetLinkedContributions.ADMIN_GET_LINKED_CONTRIBUTIONS);
    }

    /**
     * Create a detached, initialised AdminGetLinkedContributionsRecord
     */
    public AdminGetLinkedContributionsRecord(UUID contribution, UUID audit) {
        super(AdminGetLinkedContributions.ADMIN_GET_LINKED_CONTRIBUTIONS);

        setContribution(contribution);
        setAudit(audit);
    }
}
