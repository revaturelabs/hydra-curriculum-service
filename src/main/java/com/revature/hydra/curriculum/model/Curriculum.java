package com.revature.hydra.curriculum.model;

import javax.persistence.*;

import lombok.*;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(exclude = "skills")
@ToString(exclude = "skills")
public class Curriculum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Boolean active;
    private Boolean core;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "curriculum_skill",
        joinColumns = { @JoinColumn(name = "curriculum_id") },
        inverseJoinColumns = { @JoinColumn(name = "skill_id") }
    )
    private Set<SkillId> skills;
}
