/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.tables;


import java.util.UUID;

import org.ehrbase.jooq.pg.Ehr;
import org.ehrbase.jooq.pg.tables.records.AdminDeleteStatusRecord;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AdminDeleteStatus extends TableImpl<AdminDeleteStatusRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ehr.admin_delete_status</code>
     */
    public static final AdminDeleteStatus ADMIN_DELETE_STATUS = new AdminDeleteStatus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AdminDeleteStatusRecord> getRecordType() {
        return AdminDeleteStatusRecord.class;
    }

    /**
     * The column <code>ehr.admin_delete_status.num</code>.
     */
    public final TableField<AdminDeleteStatusRecord, Integer> NUM = createField(DSL.name("num"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ehr.admin_delete_status.status_audit</code>.
     */
    public final TableField<AdminDeleteStatusRecord, UUID> STATUS_AUDIT = createField(DSL.name("status_audit"), SQLDataType.UUID, this, "");

    /**
     * The column <code>ehr.admin_delete_status.status_party</code>.
     */
    public final TableField<AdminDeleteStatusRecord, UUID> STATUS_PARTY = createField(DSL.name("status_party"), SQLDataType.UUID, this, "");

    private AdminDeleteStatus(Name alias, Table<AdminDeleteStatusRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.UUID)
        });
    }

    private AdminDeleteStatus(Name alias, Table<AdminDeleteStatusRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>ehr.admin_delete_status</code> table reference
     */
    public AdminDeleteStatus(String alias) {
        this(DSL.name(alias), ADMIN_DELETE_STATUS);
    }

    /**
     * Create an aliased <code>ehr.admin_delete_status</code> table reference
     */
    public AdminDeleteStatus(Name alias) {
        this(alias, ADMIN_DELETE_STATUS);
    }

    /**
     * Create a <code>ehr.admin_delete_status</code> table reference
     */
    public AdminDeleteStatus() {
        this(DSL.name("admin_delete_status"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Ehr.EHR;
    }

    @Override
    public AdminDeleteStatus as(String alias) {
        return new AdminDeleteStatus(DSL.name(alias), this, parameters);
    }

    @Override
    public AdminDeleteStatus as(Name alias) {
        return new AdminDeleteStatus(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public AdminDeleteStatus rename(String name) {
        return new AdminDeleteStatus(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public AdminDeleteStatus rename(Name name) {
        return new AdminDeleteStatus(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, UUID, UUID> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public AdminDeleteStatus call(
          UUID statusIdInput
    ) {
        AdminDeleteStatus result = new AdminDeleteStatus(DSL.name("admin_delete_status"), null, new Field[] {
            DSL.val(statusIdInput, SQLDataType.UUID)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public AdminDeleteStatus call(
          Field<UUID> statusIdInput
    ) {
        AdminDeleteStatus result = new AdminDeleteStatus(DSL.name("admin_delete_status"), null, new Field[] {
            statusIdInput
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
