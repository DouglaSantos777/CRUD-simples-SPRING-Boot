package mongospring.example.demo.api.response;

public record UsuarioResponseDTO(String id,

                                 Long nome,

                                 String email,

                                 String documento,

                                 EnderecoResponseDTO endereco
) {
    
}
