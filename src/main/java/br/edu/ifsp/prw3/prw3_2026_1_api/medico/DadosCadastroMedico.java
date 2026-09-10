package br.edu.ifsp.prw3.prw3_2026_1_api.medico;

import br.edu.ifsp.prw3.prw3_2026_1_api.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm,
                                  Especialidade especialidade,
                                  DadosEndereco endereco) {

}
