public class Nome {
    public static void main(String[] args) {
        String primeiroNome = "Clebson";
        String segundoNome = "Anagair";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
