
public class BancoUsuarios{

      //Instaciando atributos da class BancoUsuarios;
      private int quantidadeUsuarios;
      private int usuariosConectados;

      //Setando valores aos atributos;
      public BancoUsuarios(){

          this.quantidadeUsuarios = (int) (Math.Random()) * 100;
          this.usuariosConectados = (int) (Math.Random()) * 100;

      }
      //Metodo get que retorna quantidade de usuarios total;
      public static String getQuantidadeUsuarios(){

        return this.quantidadeUsuarios;

      }
      //Metodo get que retorna quantidade usuarios conectados a rede;
      public static String getUsuariosConectados(){

        return this.usuariosConectados;

      }

}
