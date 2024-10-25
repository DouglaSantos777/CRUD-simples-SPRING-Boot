package mongospring.example.demo.infrastructure.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

import mongospring.example.demo.infrastructure.entity.UsuarioEntity;

public interface UsuarioRepository extends MongoRepository<UsuarioEntity, String> {


    UsuarioEntity findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
}
