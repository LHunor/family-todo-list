package hu.elte.FamilyTodoList.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    private String title;

    @Column
    private String description;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime created_at;

    @Column
    @UpdateTimestamp
    private LocalDateTime updated_at;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "tasks_tags",
            joinColumns = @JoinColumn(name = "tasks_id"),
            inverseJoinColumns = @JoinColumn(name = "tags_id")
    )
    private List<Tag> tags;

    @ManyToOne
    @JoinColumn(name = "stage_id")
    private Stage stage;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private RestrictionType restrictionType;

    @ManyToMany
    @JoinTable(
            name = "assignments",
            joinColumns = @JoinColumn(name = "task_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> assignedUsers;
}
