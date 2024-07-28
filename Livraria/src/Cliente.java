public class Cliente implements Comparable<Cliente> {

        private String nome;
        private int idade;
        private double altura;

        public Cliente(String nome, int idade, double altura) {
            this.nome = nome;
            this.idade = idade;
            this.altura = altura;
        }
    public Cliente() {

    }

    @Override
    public int compareTo(Cliente c) {
        return Integer.compare(idade, c.getIdade());
    }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        @Override
        public String toString() {
            return "\n" +
                    "\nNome= " + nome  +
                    "\nIdade= " + idade +
                    "\nAltura= " + altura ;
        }
}

