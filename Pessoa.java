public class Pessoa{

    private String nome;
    private int idade;
    private String endereco;

    public void SetNome(String nome){
        this.nome = nome;

    }
    public String getNome(){
        return this.nome;
    }
    public void SetIdade(int idade){
        this.idade = idade;

    }
    public int getIdade(){
        return this.idade;
    }
    public void SetEndereco(String endereco){
        this.endereco = endereco;

    }
    public String getEndereco(){
        return this.endereco;
    }


}