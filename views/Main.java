package views;

import controllers.PratosController;
import models.Pratos;

/* 
_  Crie um sistema java para cadastro de pratos.
_  O projeto deve utilizar MVC.
_  Utilize uma classe abstrata base model para manter o id.
_  Utilize uma classe abstrata base repository para realizar as operações de crud .
_  Na View, teste todos os metodos do Crud com dados fixos, sem a necessidade de menu ou leitura e escrita pelo terminal.  */

public class Main {
    public static void main(String[] args) {
        PratosController controller = new PratosController();

        Pratos p1 = new Pratos();
        p1.id = "001";
        p1.marca = "Duralex";
        p1.material = "vidro";

        Pratos p2 = new Pratos();
        p2.id = "002";
        p2.marca = "Oxford";
        p2.material = "porcelana";

        Pratos p3 = new Pratos();
        p3.id = "002";
        p3.marca = "Oxford";
        p3.material = "vidro";

        System.out.println("\nAdicionando p1 à lista.");
        controller.create(p1);
        listar(controller);

        System.out.println("\nAdicionando p2 à lista.");
        controller.create(p2);
        listar(controller);

        System.out.println("\nAlterando p2.");
        controller.update(p3);
        listar(controller);

        System.out.println("\nDeletando p1.");
        controller.delete(p1);
        listar(controller);
    }

    static public void listar(PratosController controller){
        for (Pratos p : controller.read()) {
            System.out.println(p);
        }
    }
}
