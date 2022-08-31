import java.util.ArrayList;

public class Sgp {

    private ArrayList<Usuario> bancoUsuarios;

    // ----------- MÉTODOS
    public int telaInicial() {

        System.out.println("Bem-vindo ao Sistema de Gerenciamento de Projetos(SGP) ");
        System.out.println("1 - FAZER CADASTRO");
        System.out.println("2 - FAZER LOGIN");
        System.out.println("0 - ENCERRAR PROGRAMA");
        System.out.println("Digite um número da opção que deseja executar: ");

        int escolha = -99; // SÓ PARA INICIAR COM ALGUM VALOR
        do {
            escolha = Servo.retornaInteiro();

            switch (escolha) {
                case 1:
                    telaCadastro();
                    break;
                case 2:
                    telaLogin();
                    break;
                case 0:
                    return 0;
                default:
                    System.out.println("Opção Inválida\n");
            }

        } while (true);

    }

    public void telaCadastro() {

        Usuario novousuario = new Usuario();

        System.out.println("Sistema de Gerenciamento de Projetos (SGP)");
        System.out.println("Vamos fazer seu cadastro, siga as instruções!");
        System.out.println("Digite seu nome completo: ");
        novousuario.setNome();

        System.out.println("Digite seu login: ");
        String login;
        do {
            login = Servo.retornaString();

            if(verificarLogin(login))
            {
                System.out.println("Esse login já existe, por favor tente outro login.\n\nDigite seu login: ");
            }
            else
            {
                break;
            }

        } while (true);
        novousuario.setLogin(login);

        System.out.println("Digite sua senha: ");
        novousuario.setSenha();

        System.out.println("Digite seu CPF: ");
        String cpf;
        do {
            cpf = Servo.retornaString();

            if(verificarCpf(cpf))
            {
                System.out.println("Esse CPF já existe, por favor tente outro CPF.\n\nDigite seu CPF: ");
            }
            else
            {
                break;
            }

        } while (true);
        novousuario.setCpf(cpf);

        System.out.println(
                "Qual é o seu cargo? (A depender do cargo escolhido seu cadastro pode não ser efetivado de imediato) ");
        novousuario.setCargo();
        boolean finalizado = true;

        if (finalizado) {
            System.out.println("Seu cadastro foi finalizado e você já pode usufruir do Sistema :)");
        } else {
            System.out.println(
                    "Seu cadastro foi finalizado, no entanto o \"Administrador\" precisa deliberar seu cadastro, te vejo mais tarde!");
        }

        bancoUsuarios.add(novousuario);
    }

    public void telaLogin()
    {
        System.out.println("Bem-vindo ao SGP");
        System.out.println("Digite seu Login: ");
        String login = Servo.retornaString();
        System.out.println("Digite sua Senha: ");
        String senha = Servo.retornaString();
        
        

    }

    public void removerUsuario(Usuario a) {
        bancoUsuarios.remove(a);
    }

    public boolean verificarLogin(String login)
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

    public boolean verificarCpf(String cpf)
    {

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

    public Usuario verificarUsuario(String login, String senha)
    {
        for ( usuario : bancoUsuarios) {
            if()
            {
                
            }
        }
    }
}