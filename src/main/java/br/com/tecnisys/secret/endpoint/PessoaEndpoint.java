package br.com.tecnisys.secret.endpoint;

import br.com.tecnisys.secret.entity.Pessoa;
import br.com.tecnisys.secret.service.PessoaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
public class PessoaEndpoint {
    private final PessoaService pessoaService;

    public PessoaEndpoint(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @GetMapping
    public List<Pessoa> listAll(){
        return pessoaService.listAll();
    }
}
