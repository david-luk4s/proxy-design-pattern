
public class BancoProxy extends BancoUsuarios{

    //Instaciando atributos da class BancoProxy;
    private String user;
    private String password;

    //Instaciando metodo construtor;
    public BancoProxy(String user, String password){
        //Setando valores nos atributos;
        this.user = user;
        this.password = password;
    }
    @Override
    public String getQuantidadeUsuarios(){
        //Verifincado acesso de permissão;
        if(temPermissaodeAcesso()){
           retur super.getQuantidadeUsuarios();
        }
        return null;
    }
    @Override
    public String getUsuariosConectados(){
        //Verificando acesso de permissão;
        if(temPermissaodeAcesso()){
            return super.getUsuariosConectados();
        }
    }
    private boolean temPermissaodeAcesso(){
        return this.user == "admin" && this.password == "sEnHaHaShCoMpLeXaHiPeRMeGaUltRaFoRtEr%20sEnHaHaShCoMpLeXaHiPeRMeGaUltRaFoRtEr%20sEnHaHaShCoMpLeXaHiPeRMeGaUltRaFoRtEr%20;"
    }

}
