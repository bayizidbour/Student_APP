package group.Student_App.Student_App.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Integrer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIntegrer ;


    @ManyToOne
    @JoinColumn(name = "idUser")
    private Users user ;

    @ManyToOne
    @JoinColumn(name = "idGroups")
    private Groups groups;
}
