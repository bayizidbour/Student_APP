package group.Student_App.Student_App.Models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.catalina.User;

import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Message {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMsg ;

    @NotNull
    @Column(length = 1000)
    @Size(min = 1, message = "Un message doit comporter au moins un caractère")
    private String msgContent ;


    private LocalDate msgDate ;


    @ManyToOne
    @JoinColumn(name = "idUser")
    private Users user;



    @OneToMany(mappedBy = "message", cascade = CascadeType.ALL)
    private List<Repondre> repondreList;

    @OneToMany(mappedBy = "message", cascade = CascadeType.ALL)
    private List<Recevoir> recevoirList;
}
