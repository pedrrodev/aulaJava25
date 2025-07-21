package aulas.aula10;

public class Pessoa {
        private String nome;
        private int idade;
        private int rg;
        private long cpf;

        // Getter do nome
//    public String getNome() {
//        // return nome;
//    }

        public String getNome() {
            if (nome.toLowerCase().contains("a")) {
                System.out.println("Nome inválido (contém a letra 'a').");
                return null;
            }
            return nome;
        }

        // Setter do nome
        public void setNome(String nome) {
            // nome = nome
            this.nome = nome;
        }

        // Getter da idade
        public int getIdade() {
            return idade;
        }

        // Setter da idade
        public void setIdade(int idade) {
            if (idade >= 25) {
                this.idade = idade;
            } else {
                System.out.println("Idade inválida.");
            }
        }

        public void setRg(int rg){

            int quantidadeDeDigitos = String.valueOf(Math.abs(rg)).length();

            if (quantidadeDeDigitos == 9) {
                this.rg = rg;
            } else {
                System.out.println("O RG não tem 9 dígitos.");
            }

        }

        public int getRg(){
            return rg;
        }

        public void setCpf(long cpf){

            int quantidadeDeDigitos = String.valueOf(Math.abs(cpf)).length();
            if (quantidadeDeDigitos == 11){
                this.cpf = cpf;
            } else {
                System.out.println("O CPF não tem 11 dígitos.");
            }
        }

        public long getCpf(){
            return cpf;
    }
}

