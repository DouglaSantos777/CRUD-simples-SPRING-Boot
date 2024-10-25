package mongospring.example.demo.api.converter;

import mongospring.example.demo.api.request.EnderecoRequestDTO;
import mongospring.example.demo.api.request.UsuarioResponseDTO;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.stereotype.Component;

import lombok.*;
import mongospring.example.demo.infrastructure.entity.EnderecoEntity;
import mongospring.example.demo.infrastructure.entity.UsuarioEntity;

@Component
@RequiredArgsConstructor
public class UsuarioConverter {
    
    public UsuarioEntity paraUsuarioEntity(UsuarioResponseDTO usuarioDTO) {
        return UsuarioEntity.builder() 
                .id(UUID.randomUUID().toString())
                .nome(usuarioDTO.getNome())
                .documento(usuarioDTO.getDocumento())
                .email(usuarioDTO.getEmail())
                .dataCadastro(LocalDateTime.now())
                .build();
    }

    public EnderecoEntity paraEnderecoEntity(EnderecoRequestDTO enderecoDTO, String usuarioId) {
       return EnderecoEntity.builder()
               .rua(enderecoDTO.getRua())
               .bairro(enderecoDTO.getBairro())
               .usuarioId(usuarioId)
               .cep(enderecoDTO.getCep())
               .cidade(enderecoDTO.getCidade())
               .numero(enderecoDTO.getNumero())
               .complemento(enderecoDTO.getComplemento())
               .build();       
    }


}

