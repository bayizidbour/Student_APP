package group.Student_App.Student_App.Repository;

import group.Student_App.Student_App.Models.Profil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfilRepository extends JpaRepository<Profil, Long> {
}
