package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Creator_Compiler creator = new Creator_Compiler();
        System.out.print("Язык: ");
        creator.setLanguage(new Scanner(System.in).nextLine());

        Compiler compiler = creator.createCompiler();

        Starter_Compiler starter = new Starter_Compiler();
        starter.setFile("code.txt",compiler);
        starter.compile(compiler);
    }
}
