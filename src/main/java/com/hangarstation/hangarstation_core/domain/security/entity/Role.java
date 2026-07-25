package com.hangarstation.hangarstation_core.domain.security.entity;

import com.hangarstation.hangarstation_core.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="roles")
@Getter
public class Role extends BaseEntity {

    @SequenceGenerator(name= "ROLES_SEQUENCE", sequenceName = "SEQ_ROLES", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ROLES_SEQUENCE")
    @Id
    private long id;


    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "name")
    private RoleName name;

    @Setter
    @Column(name="description")
    private String description;

    @Setter
    @Column(name="is_system_role")
    private boolean systemRole;

}
