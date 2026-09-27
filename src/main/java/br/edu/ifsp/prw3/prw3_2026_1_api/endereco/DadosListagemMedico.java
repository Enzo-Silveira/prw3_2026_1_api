package br.edu.ifsp.prw3.prw3_2026_1_api.endereco;

import br.edu.ifsp.prw3.prw3_2026_1_api.medico.Especialidade;
import br.edu.ifsp.prw3.prw3_2026_1_api.medico.Medico;

public record DadosListagemMedico(String nome, String email,
                                  String crm, Especialidade especialidade) {

    public DadosListagemMedico(Medico medico) {
        this( medico.getNome(), medico.getEmail(),
                medico.getCrm(), medico.getEspecialidade() );
    }
}