package com.revature.hydra.curriculum.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(exclude = "curriculum")
@ToString(exclude = "curriculum")
public class SkillId {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skillid_id")
    private Integer id;

    private Integer skillExternalId;

    @ManyToMany(mappedBy = "skills")
    private Set<Curriculum> curriculum;
}
