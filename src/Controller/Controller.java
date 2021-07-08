package Controller;

import Model.Model;
import View.View;

import java.util.Scanner;


public class Controller {

    private static final String hello = "Hello"; //не понял как реализовать инициализацию стрингов через Model...
    private static final String world = "world";


    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }


    public String processHello() {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        if (input1.equals(hello) && input2.equals(world)) {
            System.out.println("Hello, world!");
        } else {
            view.printMessage(view.INPUT_WRONG_DATE);
        }
        return processHello();
    }
}


