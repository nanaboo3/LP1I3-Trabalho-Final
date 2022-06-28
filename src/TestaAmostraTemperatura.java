/*
           ***TRABALHO FINAL LP1I3***


    Nomes:  Marcelo Modesto de Lima Junior
            Luciana da Silva Costa
 */

public class TestaAmostraTemperatura {
    public static void main(String[] args) {
        AmostraTemperatura t1 = new AmostraTemperatura(31,10,1459,23,59,59,15);
        System.out.print("Data: ");
        System.out.println(t1.getData());
        System.out.print("Horário: ");
        System.out.println(t1.getHora());
        System.out.print("Temperatura: ");
        System.out.println(t1.getValor());
        System.out.print("Sequência: ");
        System.out.println(t1.getNumseq());
        System.out.println("-------------------------------------");

        AmostraTemperatura t2 = new AmostraTemperatura();
        System.out.println("\n");
        System.out.print("Data: ");
        System.out.println(t2.getData());
        System.out.print("Horário: ");
        System.out.println(t2.getHora());
        System.out.print("Temperatura: ");
        System.out.println(t2.getValor());
        System.out.print("Sequência: ");
        System.out.println(t2.getNumseq());
        System.out.println("-------------------------------------");

        t1.setData();
        t1.setHora();
        t1.setValor();
        System.out.println("\n");
        System.out.print("Data: ");
        System.out.println(t1.getData());
        System.out.print("Horário: ");
        System.out.println(t1.getHora());
        System.out.print("Temperatura: ");
        System.out.println(t1.getValor());
        System.out.print("Sequência: ");
        System.out.println(t1.getNumseq());
        System.out.println("-------------------------------------\n");
    }
}
