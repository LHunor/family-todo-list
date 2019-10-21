package hu.elte.FamilyTodoList.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private UserType userType;

    @Column
    private String name;

    @ManyToMany(mappedBy = "assignedUsers")
    @JsonIgnore
    List<Task> tasks;

    @ManyToMany(mappedBy = "members")
    @JsonIgnore
    private List<Group> group;
}
