import javax.swing.JOptionPane;

public class TesteFilaPessoas {

    static int menu() {
        return Integer.parseInt(JOptionPane.showInputDialog(
                "Escolha sua opção:\n1 - Chegada de pessoa\n2 - Atendimento de pessoa\n3 - Exibir fila\n0 - Encerrar aplicacao"));

    }

    static Pessoa entradaPessoa() {
        String nome = JOptionPane.showInputDialog("Digite o nome da pessoa que chegou");
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento"));
        int tipo;
        do {
            tipo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1 para medico ou 2 para paciente"));
        } while (tipo != 1 && tipo != 2);
        if (tipo == 1) {
            String especialidade = JOptionPane.showInputDialog("Digite a especialidade do medico: ");
            int crm = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o CRM do medico:"));
            return new Medico(anoNascimento, nome, crm, especialidade);

        } else {
            int numAssociado = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da carteirinha:"));
            return new Paciente(nome, anoNascimento, numAssociado);
        }
        
    }

    public static void main(String[] args) {
        Fila fila = new Fila();
        int opcao = 0;
        do {
            opcao = menu();
            switch (opcao) {
                case 1: {
                    fila.enfileirar(entradaPessoa());
                    break;
                }

                case 2: {
                    if (!fila.estaVazia()) {
                        JOptionPane.showMessageDialog(null, fila.desenfileira() + " esta sendo atendido");
                    } else {
                        JOptionPane.showMessageDialog(null, "Todos pacientes foram atendidos");
                    }
                    break;
                }
                case 3: {
                    JOptionPane.showMessageDialog(null, fila, "Status da fila", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
                case 0:
                    JOptionPane.showMessageDialog(null, "Obrigado, volte sempre", "Finalizando",
                            JOptionPane.PLAIN_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao invalida", "Cuidado", JOptionPane.WARNING_MESSAGE);
            }
        } while (opcao != 0);
    }
}
