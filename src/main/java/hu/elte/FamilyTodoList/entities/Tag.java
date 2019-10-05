package hu.elte.FamilyTodoList.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    private String name;

    // Do we need creation and update timestamps?

    @ManyToMany(mappedBy = "tags")
    @JsonIgnore // why and what does it mean? (I just copied it from "Label" class in sample project)
    private List<Task> tasks;

}
