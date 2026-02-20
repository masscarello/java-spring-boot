package com.mascarello.demo.repositories;

import com.mascarello.demo.models.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepositorie  extends JpaRepository<PessoaModel, Long> {
}
