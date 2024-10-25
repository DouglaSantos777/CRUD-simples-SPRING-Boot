package mongospring.example.demo.infrastructure.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

import mongospring.example.demo.infrastructure.entity.EnderecoEntity;

public interface EnderecoRepository extends MongoRepository<EnderecoEntity, String> {


    EnderecoEntity findByUsuarioId(String usuarioId);

    @Transactional
    void deleteByUsuarioId(String usuarioId);
}
