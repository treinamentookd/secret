package br.com.tecnisys.secret.service;

import br.com.tecnisys.secret.entity.Pessoa;
import br.com.tecnisys.secret.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    private final PessoaRepository repository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.repository = pessoaRepository;
    }

    public List<Pessoa> listAll(){
        return  repository.findAll();
    }
}
