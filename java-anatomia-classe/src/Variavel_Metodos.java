public class Variavel_Metodos {
    public static void main(String[] args) {
        //Para construir uma variavel você deve informar seu tipo NomeBemDefinido = Atribuição
         int idade = 23;
         double altura= 1.62;
         String meuNome="Gabriel";
         int anoFabricacao= 2022;

         boolean verdadeira= true;

         anoFabricacao= 2018;
         String primeiroNome= "Gabriel";
         String segundoNome= "Henrique";        

         String nomeCompleto=nomeCompleto(primeiroNome,segundoNome);
         
         System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
            return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
         }

}
