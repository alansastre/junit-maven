package factory;

import factory.error.FiguraNotFoundException;

public class Main {

    public static void main(String[] args) {

        Figura triangulo = null;
        try {
            triangulo = FiguraFactory.crearFigura("triangulo");
            Figura circulo = FiguraFactory.crearFigura("circulo");
            Figura rectangulo = FiguraFactory.crearFigura("rectangulo");

            System.out.println(triangulo);
            System.out.println(circulo);
            System.out.println(rectangulo);
        } catch (FiguraNotFoundException e) {
            e.printStackTrace();
        }


    }
}
