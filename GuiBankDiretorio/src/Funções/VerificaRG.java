package Funções;


public class VerificaRG {

    public static boolean validarRg(String rg) {
        int[] stringtoArray = stringToArray(rg);
        int rgArraySoma =  rgArraySoma(stringtoArray);
        if(rgArraySoma % 11 == stringtoArray[stringtoArray.length - 1]){
            return true;
        }
        return false;
    }

    public static String arrayToString(String rgString){
        int[]rg = stringToArray(rgString);
        String rgToString = "";
        for (int i = 0; i < rg.length; i++){
            rgToString += String.valueOf(rg[i]);
        }
        return rgToString;
    }


    private static int rgArraySoma(int[] array){
       int mult = 9;
        int soma = 0;
        for (int i = 0 ; i <= 7; i++) {
            soma += array[i] * mult;
            mult--;
        }
        return soma;
    }

    private static int[] stringToArray(String rg){
        int[] rgArray = new int[9];
        int pointer = 0;
        for (int i = 0; i < 12 ; i++) {
            try {
                String aux2 = String.valueOf(rg.charAt(i));

                if(aux2 != "." || aux2 != "-"){
                    int aux = Integer.parseInt(String.valueOf(aux2));
                    if (aux == 0 || aux == 1 || aux == 2 || aux == 3 || aux == 4 || aux == 5
                            || aux == 6 || aux == 7 || aux == 8 || aux == 9
                    ) {
                        rgArray[pointer] = aux;
                        pointer++;
                    }
                }


            } catch (Exception e) {

            }
        }
        return rgArray;
    }
}
