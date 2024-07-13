package group.Student_App.Student_App.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Profil {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProfil ;


    private String avatar ;

    @Size(min = 2, message = "La spécialité doit comporter au moins deux caractères")
    private  String specility ;



    @Size(min = 2, message = "La description doit comporter au moins deux caractères")
    private String description ;


    private LocalDate birthday ;

    @OneToOne
    @JoinColumn (name = "idUser")
    private  Users user ;
}
