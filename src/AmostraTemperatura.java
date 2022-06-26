/*
           ***TRABALHO FINAL LP1I3***


    Nomes:  Marcelo Modesto de Lima Junior
            Luciana da Silva Costa
 */
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class AmostraTemperatura {
    private int numseq = 0;
    private Data data;
    private Hora hora;
    private float valor;
    private Scanner scan = new Scanner(System.in);
    private SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yy");

    public AmostraTemperatura() {
        this.data = new Data();
        this.hora = new Hora();
        setValor();
    }

    public AmostraTemperatura(int a, int b, int c, int d, int e, int f, float v) {
        this.data = new Data(a,b,c);
        this.hora = new Hora(d,e,f);
        this.valor = v;
    }

    public AmostraTemperatura(Data d, Hora h, float v) {
        this.data = new Data(d.getDia(), d.getMes(), d.getAno());
        this.hora = new Hora(h.getHor(), h.getMin(), h.getSeg());
        this.valor = v;
    }

    public void setData(int a, int b, int c) {
        this.data.setDia(a);
        this.data.setMes(b);
        this.data.setAno(c);
    }

    public void setData() {
        this.data.setDia();
        this.data.setMes();
        this.data.setAno();
    }

    public void setHora(int a, int b, int c) {
        this.hora.setHor(a);
        this.hora.setMin(b);
        this.hora.setSeg(c);
    }

    public void setHora() {
        this.hora.setHor();
        this.hora.setMin();
        this.hora.setSeg();
    }

    public void setValor(float v) {this.valor = v;}

    public void setValor() {
        System.out.print("temperatura: ");
        this.valor = scan.nextFloat();
        this.numseq++;
    }

    public int getNumseq(){return this.numseq;}
    public float getValor(){return this.valor;}
    public String getData() {return formatoData.format(data.getData());}
    public String getHora() {return hora.getHora1();}
}