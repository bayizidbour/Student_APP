package group.Student_App.Student_App.Models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Groupes {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idGroupes;

    @NotNull
    @Column(length = 50)
    @Size(min = 2, message = "Le nom de groupe doit comporter au moins deux caractères")
    private  String groupName;

    @OneToMany(mappedBy = "groupes", cascade = CascadeType.ALL)
    private List<Integrer> integrerList;

}
