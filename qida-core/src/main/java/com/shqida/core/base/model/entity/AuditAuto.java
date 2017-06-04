package com.shqida.core.base.model.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @Copyright (C), 2012-2022 上海骑达科技 版权所有
 * @Website www.shqida.com
 * @Author: Created by YangLiang
 * @Date: 2017/6/4
 * @Version: 1.0.0
 * @Description:
 * @History: 变更记录
 * <author>           <time>             <version>        <desc>
 * YangLiang          2017/6/4            00000001         创建文件
 */
@MappedSuperclass
public class AuditAuto extends AutoId {
    public static final Long SYS_ID = -1l;

    @Column(name = "creater", updatable = false)
    protected Long creater;

    @Column(name = "create_time", updatable = false)
    protected Timestamp createTime = new Timestamp(System.currentTimeMillis());

    @Column(name = "modifier")
    protected Long modifier;

    @Column(name = "modify_time")
    protected Timestamp modifyTime;

    @Version
    protected Long version;


    public Long getCreater() {
        return creater;
    }

    public void setCreater(Long creater) {
        this.creater = creater;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Long getModifier() {
        return modifier;
    }

    public void setModifier(Long modifier) {
        this.modifier = modifier;
    }

    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @PreUpdate
    public void preUpdate() {
        setModifyTime(new Timestamp(System.currentTimeMillis()));
        /*try {
            Long id = HossSessionUtil.getCurrentUserId();
            setModifier(id > 0 ? id : SYS_ID);
        } catch (Throwable e) {
            setModifier(SYS_ID);
        }*/
    }

    @PrePersist
    public void PrePersist() {
        if (this.getCreateTime() == null) {
            setCreateTime(new Timestamp(System.currentTimeMillis()));
        }
        /*try {
            Long id = HossSessionUtil.getCurrentUserId();
            setCreater(id > 0 ? id : SYS_ID);
        } catch (Throwable e) {
            setCreater(SYS_ID);
        }*/
    }
}
