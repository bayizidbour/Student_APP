package group.Student_App.Student_App.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Repondre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRepondre ;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "idMessage")
    private Message message;

    private LocalDateTime answerDateTime;

    private String responceContent ;
}
