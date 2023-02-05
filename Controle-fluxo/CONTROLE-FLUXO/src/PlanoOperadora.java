public class PlanoOperadora {

    public static void main (String[] args){
        String plano = "M";
        // como eu não coloquei o break após ou "SOUT", ele irá continuar utilizando as informações do casos abaixo dele.

        switch(plano) {
            case "T": {
                System.out.println("5Gb de youtube");
            }

            case "M": {
                System.out.println("Whats e Instagram grátis");
            }

            case "B":{
                System.out.println("100 minutos de ligração");
            }
        }
    }
    
}
