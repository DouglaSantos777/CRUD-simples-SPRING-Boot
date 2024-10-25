package mongospring.example.demo.business;

import org.springframework.stereotype.Service;


import mongospring.example.demo.api.converter.UsuarioConverter;
import mongospring.example.demo.api.converter.UsuarioMapper;
import mongospring.example.demo.api.request.UsuarioRequestDTO;
import mongospring.example.demo.api.response.UsuarioResponseDTO;
import mongospring.example.demo.infrastructure.entity.EnderecoEntity;
import mongospring.example.demo.infrastructure.entity.UsuarioEntity;
import mongospring.example.demo.infrastructure.exceptions.BusinessException;
import mongospring.example.demo.infrastructure.repository.EnderecoRepository;
import mongospring.example.demo.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static org.springframework.util.Assert.notNull;


import static org.springframework.util.Assert.notNull;

@Service
@RequiredArgsConstructor
public class EnderecoService {

    private final EnderecoRepository enderecoRepository;


    public EnderecoEntity salvaEndereco(EnderecoEntity enderecoEntity) {
        return enderecoRepository.save(enderecoEntity);
    }

    public EnderecoEntity findByUsuarioId(String usuarioId) {
        return enderecoRepository.findByUsuarioId(usuarioId);
    }

    public void deleteByUsuarioId(String usuarioId) {
        enderecoRepository.deleteByUsuarioId(usuarioId);
    }


}
