/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.tables.records;


import java.sql.Timestamp;
import java.util.UUID;

import org.ehrbase.jooq.pg.tables.TemplateStore;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TemplateStoreRecord extends UpdatableRecordImpl<TemplateStoreRecord> implements Record4<UUID, String, String, Timestamp> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ehr.template_store.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>ehr.template_store.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>ehr.template_store.template_id</code>.
     */
    public void setTemplateId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>ehr.template_store.template_id</code>.
     */
    public String getTemplateId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ehr.template_store.content</code>.
     */
    public void setContent(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>ehr.template_store.content</code>.
     */
    public String getContent() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ehr.template_store.sys_transaction</code>.
     */
    public void setSysTransaction(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>ehr.template_store.sys_transaction</code>.
     */
    public Timestamp getSysTransaction() {
        return (Timestamp) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<UUID, String, String, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<UUID, String, String, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return TemplateStore.TEMPLATE_STORE.ID;
    }

    @Override
    public Field<String> field2() {
        return TemplateStore.TEMPLATE_STORE.TEMPLATE_ID;
    }

    @Override
    public Field<String> field3() {
        return TemplateStore.TEMPLATE_STORE.CONTENT;
    }

    @Override
    public Field<Timestamp> field4() {
        return TemplateStore.TEMPLATE_STORE.SYS_TRANSACTION;
    }

    @Override
    public UUID component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getTemplateId();
    }

    @Override
    public String component3() {
        return getContent();
    }

    @Override
    public Timestamp component4() {
        return getSysTransaction();
    }

    @Override
    public UUID value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getTemplateId();
    }

    @Override
    public String value3() {
        return getContent();
    }

    @Override
    public Timestamp value4() {
        return getSysTransaction();
    }

    @Override
    public TemplateStoreRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public TemplateStoreRecord value2(String value) {
        setTemplateId(value);
        return this;
    }

    @Override
    public TemplateStoreRecord value3(String value) {
        setContent(value);
        return this;
    }

    @Override
    public TemplateStoreRecord value4(Timestamp value) {
        setSysTransaction(value);
        return this;
    }

    @Override
    public TemplateStoreRecord values(UUID value1, String value2, String value3, Timestamp value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TemplateStoreRecord
     */
    public TemplateStoreRecord() {
        super(TemplateStore.TEMPLATE_STORE);
    }

    /**
     * Create a detached, initialised TemplateStoreRecord
     */
    public TemplateStoreRecord(UUID id, String templateId, String content, Timestamp sysTransaction) {
        super(TemplateStore.TEMPLATE_STORE);

        setId(id);
        setTemplateId(templateId);
        setContent(content);
        setSysTransaction(sysTransaction);
    }
}
