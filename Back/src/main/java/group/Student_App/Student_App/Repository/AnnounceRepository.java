package group.Student_App.Student_App.Repository;

import group.Student_App.Student_App.Models.Announce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnounceRepository extends JpaRepository<Announce, Long> {
}
