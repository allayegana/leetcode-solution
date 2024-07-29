package test2;

import test1.defautstest;


public class defaut2 implements defautstest {


    @Override
    public String  getNome(String nome) {
        return nome;
    }

    public static void main(String[] args) {
        defaut2 d = new defaut2();

        System.out.println(d.getNome("ALLAYE"));
        d.defaultMethod();

    }
}
