
public class testProxy{

    public static void main(String args[]){

      System.out.println("Hacker acessando");
      BancoUsuarios banco = new BancoProxy("hacker","sEnHaHaShCoMpLeXaHiPeRMeGaUltRaFoRtEr%20sEnHaHaShCoMpLeXaHiPeRMeGaUltRaFoRtEr%20sEnHaHaShCoMpLeXaHiPeRMeGaUltRaFoRtEr%20");
      System.out.println(banco.getQuantidadeUsuarios());
      System.out.println(banco.getUsuariosConectados());

      System.out.println("Admin acessando");
      BancoUsuarios banco = new BancoProxy("admin","sEnHaHaShCoMpLeXaHiPeRMeGaUltRaFoRtEr%20sEnHaHaShCoMpLeXaHiPeRMeGaUltRaFoRtEr%20sEnHaHaShCoMpLeXaHiPeRMeGaUltRaFoRtEr%20;");
      System.out.println(banco.getQuantidadeUsuarios());
      System.out.println(banco.getUsuariosConectados());

    }

}
