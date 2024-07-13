package group.Student_App.Student_App.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComment ;

    @Column(length = 1000)
    @Size(min = 2, message = "Un commentaire doit comporter au moins deux caractères")
    private  String contentComment ;


    private LocalDate dateComment ;

    @ManyToOne
    @JoinColumn (name = "idAnnounce")
    private Announce announce ;

    @ManyToOne
    @JoinColumn (name = "idUser")
    private Users user ;


    @OneToMany(mappedBy = "comment", cascade = CascadeType.ALL)
    private List<Like> likeList;
}
