package br.edu.ifsp.prw3.prw3_2026_1_api.medico;

import br.edu.ifsp.prw3.prw3_2026_1_api.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedico(

        @NotNull
        Long id,

        String nome,

        String telefone,

        DadosEndereco endereco) { }
