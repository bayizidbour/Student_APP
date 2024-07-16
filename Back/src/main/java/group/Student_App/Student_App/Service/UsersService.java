package group.Student_App.Student_App.Service;

import group.Student_App.Student_App.Models.Users;
import group.Student_App.Student_App.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UsersService {

    @Autowired
    UsersRepository usersRepo;

    public Users getUsersById(Long id){
        Optional<Users> optUsers = usersRepo.findById(id);
        return optUsers.isPresent() ? optUsers.get():null;
    }

    public List<Users> getAllUsers(){
        return usersRepo.findAll();
    }

    public Users createUsers (Users users){
        return usersRepo.save(users);
    }

    public void delete (Users users){
        usersRepo.delete(users);
    }

    public void deleteById (Long id){
        usersRepo.deleteById(id);
    }

    public Users update (Long id, Users usersToUp){
       Optional<Users> optionalUsers = usersRepo.findById(id);

       if(optionalUsers.isPresent()){
         Users usersInBd = optionalUsers.get();
         usersInBd.setName(usersToUp.getName());
         usersInBd.setFirstName(usersToUp.getFirstName());
         usersInBd.setProfil(usersToUp.getProfil());
         usersInBd.setAddress(usersToUp.getAddress());
         usersInBd.setCode_postal(usersToUp.getCode_postal());
         usersInBd.setCity(usersToUp.getCity());
         usersInBd.setEmail(usersToUp.getEmail());
         usersInBd.setStatus(usersToUp.getStatus());

         return usersRepo.save(usersInBd);
       }
       return null;
    }
}
