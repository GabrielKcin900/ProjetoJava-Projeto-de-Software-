import java.util.ArrayList;
import java.util.Scanner;

public class Sgp {

    private ArrayList<Usuario> bancoUsuarios;
    private ArrayList<Projeto> bancoProjeto;
    private ArrayList<Atividade> bancoAtividade;
    // private Usuario administradorSistema;



    public Sgp() {
        this.bancoUsuarios = new ArrayList<Usuario>();
        this.bancoProjeto = new ArrayList<Projeto>();
        this.bancoAtividade = new ArrayList<Atividade>();
    }



    // ----------- MÉTODOS
    public int telaInicial() {

        do {
            System.out.println("\n<=====> Bem-vindo ao Sistema de Gerenciamento de Projetos(SGP) <=====>\n");
            System.out.println("1 - FAZER CADASTRO"); // ADICIONANDO NOVOS USUÁRIOS NO SISTEMA
            System.out.println("2 - FAZER LOGIN"); // ENTRANDO LITERALMENTE NO SISTEMA
            System.out.println("0 - ENCERRAR PROGRAMA");

            System.out.print("\nDigite o número da opção que você deseja executar: ");
            int escolha = Servo.retornaInteiroIntervalo(0, 2); // RETORNA QUALQUER INTEIRO

            switch (escolha) {
                case 1:
                    telaCadastro();
                    break;
                case 2:
                    telaLogin();
                    break;
                case 0:
                    return 0;
            }

        } while (true);

    }




    public void telaCadastro() {

        Usuario novousuario = new Usuario();

        System.out.println("\n\nSistema de Gerenciamento de Projetos (SGP) --- TELA CADASTRO");
        System.out.println("Vamos fazer seu cadastro, mas para isso siga as instruções!");
        System.out.print("-> Digite seu nome completo: ");
        novousuario.setNome(); // PODE TER PESSOAS COM O MESMO NOME

        System.out.print("\n-> Digite seu login: ");
        String login; // LOGIN É ÚNICO
        do {
            login = Servo.retornaString();

            if (verificarLogin(login)) // SE O LOGIN JÁ EXISTIR ELE ENTRA AQUI
            {
                System.out.print("\n\nEsse login já existe, por favor tente outro login.\n-> Digite outro login: ");
            } else {

                break;
            }

        } while (true);
        novousuario.setLogin(login);

        System.out.print("Digite sua senha: ");
        novousuario.setSenha();

        System.out.print("Digite seu CPF: ");
        String cpf;
        do {
            cpf = Servo.retornaString();

            if (verificarCpf(cpf)) {
                System.out.print("\n\nEsse CPF já existe, por favor tente outro CPF.\n\nDigite seu CPF: ");
            } else {
                break;
            }

        } while (true);
        novousuario.setCpf(cpf);

        novousuario.setCargo();

        bancoUsuarios.add(novousuario);
    }




    public void telaLogin() {
        if (bancoUsuarios.isEmpty()) {
            System.out.println(
                    "\n\nO SGP está sem nenhum cadastro, por essa razão o Login está impossibilitado! Faça seu cadastro para começar a ter acesso.\n\n");
        } else {
            System.out.println("\n\nBem-vindo ao SGP -- TELA LOGIN\n");
            while (true) {
                System.out.print("Digite seu Login: ");
                String login = Servo.retornaString();
                System.out.print("Digite sua Senha: ");
                String senha = Servo.retornaString();
                if (verificarLogin(login)) {
                    Usuario a = retornarUsuario(login, senha);
                    if (a != null) // SE ESTIVER TUDO OK
                    {
                        if ("PROFESSOR".equals(a.getCargo()) || "PESQUISADOR".equals(a.getCargo())) {
                            telaAreaTrabalhoCoordenador(a);
                            break;
                        } else {
                            //telaAreaTrabalhoNaoCoordenador();
                        }
                    } else {
                        System.out.print(
                                "\n\nAtenção usuário, sua senha está incorreta!Por favor faça o login novamente\n\n");
                    }
                } else {
                    System.out.println("Login e senha incorretos!");
                }

            }

        }
    }



    private void telaAreaTrabalhoCoordenador(Usuario usuarioLogado) {
        System.out.println("SGP - ÁREA DE TRABALHO =================== " + usuarioLogado.getNome());
        System.out.println("1 - CRIAR UM PROJETO");
        System.out.println("0 - FAZER LOGOUT");
        int escolha = Servo.retornaInteiroIntervalo(0, 1);
        switch (escolha) {
            case 1:
                instanciarProjeto();
                break;
        
            case 0:
                break;
        }
    }
























    private void instanciarProjeto(){
        Projeto novoProjeto = new Projeto();
        

    }



    public void removerUsuario(Usuario a) {
        bancoUsuarios.remove(a);
    }

    public boolean verificarLogin(String login) // RETORNA "TRUE" SE O "LOGIN" ENVIADO COMO PARÂMETRO JÁ EXISTE DENTRO
                                                // DO SISTEMA
                                                // DO SISTEMA
    {

        if (bancoUsuarios.isEmpty()) {
            return false;
        }

        for (Usuario usuario : bancoUsuarios) {
            if (usuario.getLogin().equals(login) == true) {
                return true;
            }
        }

        return false;

    }

    public boolean verificarCpf(String cpf) {

        if (bancoUsuarios.isEmpty()) {
            return false;
        }

        for (Usuario usuario : bancoUsuarios) {
            if (usuario.getCpf().equals(cpf) == true) {
                return true;
            }
        }

        return false;

    }

    public Usuario retornarUsuario(String login, String senha) // ENTRA COM LOGIN E SENHA E RETORNO O RESPECTIVO USUÁRIO
    {

        for (Usuario usuario : bancoUsuarios) {

            if (usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)) {
                return usuario;
            }

        }
        return null;
    }
}