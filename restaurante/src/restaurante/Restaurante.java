import java.util.Date;
package restaurante;

/**
 *
 * @author Aluno
 */
public class Restaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
   
    
}

class Pessoa { 
   //atributos
    public String nome;
    public String cpf;
    public Date data_de_nascimento;
    
    //construtor
     Pessoa(String _nome, String _cpf, Date _data ) {
        this.nome = _nome;
        this.cpf = _cpf;
        this.data_de_nascimento = _data;
     }
}

 class Cliente extends Pessoa{
     public float gastos;
     public int numerodamesa;
     
    
             Cliente(String nome, Date data_de_nascimento , String cpf) {
                super(nome , cpf,  data_de_nascimento );
            }
 }

  class Funcionário extends Pessoa{
     public float salário;
     public String benefícios;
     public String folga;
     public String horáriodetrabalho;

             Funcionário(String nome, int idade, String telefone, String cpf, float salário, String benefícios, String Folga, String horáriodetrabalho) {
                super(nome, cpf , data_de_nascimento);
            }
  public class Supervisor extends Funcionário{

             public Supervisor(String nome, int idade, String telefone, String cpf, float salário, String benefícios, String Folga, String horáriodetrabalho) {
                 super(nome, idade, telefone, cpf, salário, benefícios, Folga, horáriodetrabalho);
             }
  }
  public class Garçom extends Funcionário{

             public Garçom(String nome, int idade, String telefone, String cpf, float salário, String benefícios, String Folga, String horáriodetrabalho) {
                 super(nome, idade, telefone, cpf, salário, benefícios, Folga, horáriodetrabalho);
             }
      
  }
  public class Caixa extends Funcionário{

             public Caixa(String nome, int idade, String telefone, String cpf, float salário, String benefícios, String Folga, String horáriodetrabalho) {
                 super(nome, idade, telefone, cpf, salário, benefícios, Folga, horáriodetrabalho);
             }
      
  }
 }
       
   }
    }
