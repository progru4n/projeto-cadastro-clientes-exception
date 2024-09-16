
import javax.swing.JOptionPane;

public class CadastroClientes {

    public static void main(String[] args) {
        System.out.println("Bem vindo a loja casa&lazer!");
        System.out.println("Vamos iniciar o seu cadastro de cliente");
        try {
            String nome = (JOptionPane.showInputDialog("Insira o seu nome:"));
            String dataNascimento = (JOptionPane.showInputDialog("Insira a sua data de nascimento"));
            String cpf = (JOptionPane.showInputDialog("Insira o seu cpf"));
            String enderecoResidencia = (JOptionPane.showInputDialog("Insira o seu endereço de residencia"));
            System.out.println(verificarDados(nome, dataNascimento, cpf, enderecoResidencia));
            System.out.println("Nome: " + nome + "\n" + "Data de nascimento: " + dataNascimento + "\n"
                    + "CPF: " + cpf + "\n" + "Endereço de Residência: " + enderecoResidencia);

        } catch (DataValidationException e) {
            System.out.println("Ocorreu um erro, favor, verifique os campos do cadastro.");
        }

    }

    static String verificarDados(String nome, String dataNasc, String cpf, String enderecResid) throws DataValidationException {
        if (nome.length() < 3 || dataNasc.length() != 8 || cpf.length() != 11 || enderecResid.length() < 6) {
            throw new DataValidationException();
        }

        return "Cadastro realizado!";

    }

}
