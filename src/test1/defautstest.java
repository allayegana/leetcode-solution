package test1;

 public interface defautstest {

    default void defaultMethod() {
        System.out.println("Default Method from InterfaceB");
    }

    String getNome(String nome);
}
