package one.digitalinnovation.gof.model;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public abstract class EnderecoRepository implements crudRepository<Endereco, String> {

    public Optional<Endereco> findByCep(String cep) {
        return crudRepository.findById(cep);
    }

    public void save(Endereco novoEndereco) {
    }
}
