package mongospring.example.demo.infrastructure.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collation = "endereco_entity")
public class EnderecoEntity {

    @Id
    private String id;
    private String usuarioId;
    private String rua;
    private Long numero;
    private String bairro;
    private String complemento;
    private String cidade;
    private String cep;
}

