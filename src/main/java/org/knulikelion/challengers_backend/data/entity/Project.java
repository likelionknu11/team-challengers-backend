package org.knulikelion.challengers_backend.data.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@Table(name = "project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String imageUrl;

    @Column(nullable = false)
    private String projectName;

    @Column(columnDefinition = "LONGTEXT", nullable = false)
    private String projectDescription;

    @Column(nullable = false)
    private Integer projectStatus;

    @Column(columnDefinition = "LONGTEXT", nullable = false)
    private String projectPeriod;

    @Column(columnDefinition = "LONGTEXT", nullable = false)
    private String projectTechStacks;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "club_id", nullable = false)
    private Club club;
}