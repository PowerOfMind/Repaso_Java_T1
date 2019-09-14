import com.sun.org.apache.xpath.internal.objects.XObject;

public class ejc2 {

    public static void main(String[] args) {
        String [] palabras = {"asd","asd","asd","asd","asd"};
        String [] elementos =  new String[9];
        elementos[0] = "Hola";
        elementos[10] = "asd";
        int[] numeros = {1,2,3,4,5,6};
        Object[] objetos = {"asd",2,false};

        System.out.printf(elementos[0]);

        for (int i=0;i<palabras.length;i++){
            System.out.printf("Elementos %s",palabras[i]);
        }

        for(String item:palabras){
            System.out.printf(item);
        }
    }
}
