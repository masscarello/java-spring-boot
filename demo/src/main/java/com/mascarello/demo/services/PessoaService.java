package com.mascarello.demo.services;

import com.mascarello.demo.models.PessoaModel;
import com.mascarello.demo.repositories.PessoaRepositorie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {
    private PessoaRepositorie pessoaRepositorie;

    public List<PessoaModel> findAll(){
        return pessoaRepositorie.findAll();

    }
    public PessoaModel criar(PessoaModel pessoaModel){
        return PessoaRepositorie.save(pessoaModel);
    }
}
