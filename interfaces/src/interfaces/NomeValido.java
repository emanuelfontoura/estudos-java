package interfaces;

public interface NomeValido {

    // Método que verifica se o atributo nome é válido
    boolean isNomeValido();

    // Mensagem de erro caso o nome seja inválido
    String getMensagemErroNome();

    // Expressão regular para validação de caracteres
    String EXPRESSAO_REGULAR_NOME = "^[a-zA-Záàâãéèêíìóòôõúùûçñ]+$";

    // Tamanho máximo do nome
    int TAMANHO_MAXIMO_NOME = 250;
}

