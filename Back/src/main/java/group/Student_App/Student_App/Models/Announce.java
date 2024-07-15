package group.Student_App.Student_App.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Announce {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idAnnounce ;


    @Column(length = 1000)
    @Size(min = 2, message = "Une annonce doit comporter au moins deux caractères")
    private  String announceContent;

    private  String announcePicture ;


    private LocalDate announceDate ;

    @ManyToOne
    @JoinColumn (name = "idUser")
    private  Users user ;

    @OneToMany (mappedBy = "announce", cascade = CascadeType.ALL)
    private List<Comment> commentList;


}
