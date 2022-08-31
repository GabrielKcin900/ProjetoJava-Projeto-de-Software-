public class Usuario {
    private String nome;
    private String cpf;
    private String login;
    private String senha;
    private String cargo;


    public Usuario()
    {

    }

    public Usuario(String nome, String cpf, String login, String senha, String cargo)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public String getLogin() {
        return login;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }


    public void setNome(){
        String nome;
        nome = Servo.retornaString();
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public void setSenha(){
        String senha;
        senha = Servo.retornaString();
        this.senha = senha;
    }

    public void setCargo() {
        String cargo = "";
        String a[] = { "ADMINISTRADOR", "ALUNO DE GRADUAÇÃO", "ALUNO DE MESTRADO", "ALUNO DE DOUTORADO", "PROFESSOR",
                "PESQUISADOR", "PROFISSIONAL", "TÉCNICO" };
        int escolha = -99;
        System.out.println("Qual é o seu cargo? (OBS: A depender do cargo escolhido o seu cadastro será avaliado pelo 'Administrador')");
        System.out.println("1 - ALUNO DE GRADUAÇÃO");
        System.out.println("2 - ALUNO DE MESTRADO");
        System.out.println("3 - ALUNO DE DOUTORADO");
        System.out.println("4 - PROFESSOR");
        System.out.println("5 - PESQUISADOR");
        System.out.println("6 - PROFISSIONAL");
        System.out.println("7 - TÉCNICO");
        do {
            escolha = Servo.retornaInteiro();
            escolha++;
            switch (escolha) {
                case 2:
                    cargo = a[1];
                    break;
                case 3:
                    cargo = a[2];
                    break;
                case 4:
                    cargo = a[3];
                    break;
                case 5:
                    cargo = a[4];
                    break;
                case 6:
                    cargo = a[5];
                    break;
                case 7:
                    cargo = a[6];
                    System.out.println("Que tipo de \"Profissional\" você é? ");
                    System.out.println("1 - DESENVOLVEDOR\n2 - \n3 - ANALISTA");
                    escolha = -99;
                    escolha = Servo.retornaInteiro();
                    do {
                        switch (escolha) {
                            case 1:
                                cargo.concat(" - DESENVOLVEDOR");
                                break;
                            case 2:
                                cargo.concat(" - TESTADOR");
                                break;
                            case 3:
                                cargo.concat(" - ANALISTA");
                                break;
                            default:
                                System.out.println("Opção Inválida");
                        }
                    } while (!(escolha >= 1 && escolha <= 3));
                    escolha = 7;
                    break;
                case 8:
                    cargo = a[7];
                    break;
                default:
                    System.out.println("\nOpção inválida\n");
            }

        } while (!(escolha >= 0 && escolha <= 7));
        this.cargo = cargo;
    }


    
}