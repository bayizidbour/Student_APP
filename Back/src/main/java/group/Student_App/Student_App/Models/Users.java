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
public class Users {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idUser;

        @NotNull
        @Column(length = 50)
        @Size(min = 2, message = "Un nom doit comporter au moins deux caractères")
        private String name ;

        @NotNull
        @Column(length = 50)
        @Size(min = 2, message = "Un prénom doit comporter au moins deux caractères")
        private String firstName ;

        @NotNull
        @Column( unique = true)
        @Size(min = 2, message = "Un mail doit comporter au moins deux caractères")
        private String email ;

        @NotNull
        private String status ;

        @NotNull
        @Column(length = 200)
        @Size(min = 2, message = "Une adresse doit comporter au moins deux caractères")
        private String address ;

        @NotNull
        private int code_postal ;

        @NotNull
        @Size(min = 2, message = "Une ville doit comporter au moins deux caractères")
        private String city ;

        @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
        private List<Announce> announceList;


        @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
        private List<Comment> commentList;

        @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
        private Profil profil;



        @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
        private List<Message> messageList;

        @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
        private List<Repondre> repondreList;

        @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
        private List<Recevoir> recevoirList;

        @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
        private List<Integrer> integrerList;


        @Override
    public String toString() {
        return "Users{" +
                "idUser=" + idUser +
                ", name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", status='" + status + '\'' +
                ", address='" + address + '\'' +
                ", code_postal=" + code_postal +
                ", city='" + city + '\'' +
                '}';
    }
}
