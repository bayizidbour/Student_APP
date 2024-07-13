package group.Student_App.Student_App.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.catalina.User;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Like {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idLike ;


    private  Boolean likeStatus;


    @ManyToOne
    @JoinColumn(name = "idMsg")
    private  Message message;

    @ManyToOne
    @JoinColumn(name = "idComment")
    private  Comment comment;

    @ManyToOne
    @JoinColumn(name = "idAnnounce")
    private  Announce announce;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user ;

}
