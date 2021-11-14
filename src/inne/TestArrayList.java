package inne;

import java.util.ArrayList;

public class TestArrayList {

    public static void main(String[] args) {

        ArrayList lista = new ArrayList();

        lista.add("Ania");
        lista.add("Ela");
        lista.add("Jan");
        //lista.add(2);
        lista.add("Eryk");

        System.out.println(lista);

        for (Object o : lista) {
            //System.out.println(o);
            String s = (String)o;
            System.out.println(s);
        }

        ArrayList<String> listaStringow = new ArrayList<String>();

        listaStringow.add("Ania");
        listaStringow.add("Ela");
        listaStringow.add("Jan");
        listaStringow.add("2");
        listaStringow.add("Eryk");

        for (String s : listaStringow) {
            System.out.println(s);
        }

        ArrayList<Integer> listaIntegerow = new ArrayList<Integer>();

        listaIntegerow.add(2);
        listaIntegerow.add(4);
        listaIntegerow.add(new Integer(2));
        listaIntegerow.add(Integer.valueOf(7));

        for (int i : listaIntegerow) {
            System.out.println(i);
        }

    }

}
