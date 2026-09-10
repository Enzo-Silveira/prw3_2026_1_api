package br.edu.ifsp.prw3.prw3_2026_1_api.endereco;

public record DadosEndereco(String logradouro, String bairro, String cep,
                            String cidade, String uf, String complemento,
                            String numero) {
}