/*
           ***TRABALHO FINAL LP1I3***


    Nomes:  Marcelo Modesto de Lima Junior
            Luciana da Silva Costa
 */

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Hora {
    private int hora = 0,
            min = 0,
            seg = 0;
    private Date horario = new Date();
    private Scanner scan = new Scanner(System.in);
    private SimpleDateFormat formato24 = new SimpleDateFormat("HH:mm:ss");
    private SimpleDateFormat formato12 = new SimpleDateFormat("hh:mm:ss a");

    public Hora(){
        setHor();
        setMin();
        setSeg();
    }

    public Hora(int h, int m, int s){
        setHor(h);
        setMin(m);
        setSeg(s);
    }

    public void setHor(int h){
        this.hora = h;
        setHorario();
    }

    public void setMin(int m){
        this.min = m;
        setHorario();
    }

    public void setSeg(int s){
        this.seg = s;
        setHorario();
    }

    public void setHor(){
        while(true) {
            System.out.print("hora: ");
            this.hora = scan.nextInt();
            if(this.hora < 24 && this.hora >= 0){
                setHorario();
                break;
            }
            System.out.println("ERRO: Digite horas que sejam válidas.");
        }
    }

    public void setMin(){
        while(true){
            System.out.print("minutos: ");
            this.min = scan.nextInt();
            if(this.min>=0 && this.min<60){
                setHorario();
                break;
            }
            System.out.println("ERRO: Digite minutos que sejam válidos.");
        }
    }

    public void setSeg(){
        while(true){
            System.out.print("segundos: ");
            this.seg = scan.nextInt();
            if(this.seg >=0 && this.seg<60){
                setHorario();
                break;
            }
            System.out.println("ERRO: Digite segundos que sejam válidos.");
        }
    }

    public void setHorario(){
        this.horario.setHours(hora);
        this.horario.setMinutes(min);
        this.horario.setSeconds(seg);
    }

    public int getHor(){return this.hora;}
    public int getMin(){return this.min;}
    public int getSeg(){return this.seg;}
    public Date getHorario(){return this.horario;}
    public String getHora1(){return formato24.format(horario);}
    public String getHora2(){return formato12.format(horario);}
    public int getSegundos(){return (hora*3600+min*60+seg);}
}
