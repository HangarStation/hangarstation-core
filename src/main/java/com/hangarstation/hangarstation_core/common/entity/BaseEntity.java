package com.hangarstation.hangarstation_core.common.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.ZoneOffset;


@Getter
@MappedSuperclass
public class BaseEntity
{


    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Setter
    @Column(name = "created_by", updatable = false)
    private String createdBy;

    


    @Setter
    @Column(name= "updated_at")
    private LocalDateTime updatedAt;


    @Setter
    @Column(name= "updated_by")
    private String updatedBy;


    @Setter
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;


    @Setter
    @Column(name="is_deleted")
    private boolean isDeleted;


    @Setter
    @Column(name="deleted_by")
    private String deletedBy;

    @Version
    @Column(name= "version")
    private Long version;

    @PrePersist
    void setCreatedAtTimeStamp(){
        createdAt = LocalDateTime.now(ZoneOffset.UTC);
    }

    @PreUpdate
    void setUpdatedAtTimeStamp(){
        updatedAt = LocalDateTime.now(ZoneOffset.UTC);

    }

}
