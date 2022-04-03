package kz.sayram.madrasa.repository;
import kz.sayram.madrasa.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {

}
