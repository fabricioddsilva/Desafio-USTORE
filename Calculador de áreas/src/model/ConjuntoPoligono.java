package model;

import java.util.ArrayList;

public class ConjuntoPoligono extends Poligono {
    private ArrayList<Poligono> conjutoPoligonos;

    public ConjuntoPoligono() {
        conjutoPoligonos = new ArrayList<>();
    }

    public void adicionarPoligono(Poligono poligono) {

        conjutoPoligonos.add(poligono);
        System.out.println("Poligono Adicionado com Sucesso");

    }

    public void calcularArea() {
        double area = 0;
        double somaArea = 0;

        for (Poligono p:conjutoPoligonos) {

            if (p.getLados() == 3) {
                 area = ((p.getTamanhoLado()* p.getTamanhoLado())*1.73)/4;
                System.out.printf("\n%s de lado %dcm e área %.2fcm²",p.getPoligono(), p.getLados(), area);
                somaArea += area;
            } else if (p.getLados() == 4) {
                area = p.getTamanhoLado()* p.getTamanhoLado();
                System.out.printf("\n%s de lado %dcm e área %.2fcm²",p.getPoligono(), p.getLados(), area);
                somaArea += area;
            }

        }
        System.out.printf("\nÁrea total: %.2fcm² %n", somaArea);
    }

}
