package mongospring.example.demo.infrastructure_entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Document(collation = "usuario_entity")
@Getter
@Setter@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioEntity {

    @Id
    private String id;
    private String nome;
    private String email;
    private String documento;
    private LocalDateTime dataCadastro;
    private LocalDateTime dataAtualizacao;
}
