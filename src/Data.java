/*

Enunciado:
        1. Construir a classe Data, conforme especificação
        abaixo, este exercício comporá a avaliação final, portanto será obrigatória sua
        elaboração para a prova final.

Nomes:
        Marcelo Modesto de Lima Junior
        Luciana da Silva Costa
*/

import java.text.ParseException;
import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.time.Year;

public class Data {
    private int dia = 1,
            mes = 1,
            ano = 2000;
    private Scanner scan = new Scanner(System.in);
    private Date data = new Date();
    private Calendar calendario = Calendar.getInstance();
    private String dataInserida;
    private DateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
    private DateFormat formato2 = new SimpleDateFormat("dd/MMMM/yyyy");

    public Data(){
        while(true){
            setDia();
            setMes();
            setAno();
            dataInserida = dia+"/"+mes+"/"+ano;

            if(validaData(dataInserida)){
                break;
            }
            System.out.println("ERRO: Digite uma data que seja válida.");
        }
    }

    public Data(int d, int m, int a){
        dataInserida = d+"/"+m+"/"+a;

        if(validaData(dataInserida)){
            setDia(d);
            setMes(m);
            setAno(a);
        }
    }

    public void setDia(int d){
        this.dia = d;
        setData();
        setCalendario();
    }

    public void setMes(int m){
        this.mes = m;
        setData();
        setCalendario();
    }

    public void setAno(int a){
        this.ano = a;
        setData();
        setCalendario();
    }

    public void setDia(){
        System.out.print("dia: ");
        this.dia = scan.nextInt();
        setData();
        setCalendario();
    }

    public void setMes(){
        System.out.print("mês: ");
        this.mes = scan.nextInt();
        setData();
        setCalendario();
    }

    public void setAno(){
        System.out.print("ano: ");
        this.ano = scan.nextInt();
        setData();
        setCalendario();
    }

    public void setData(){
        this.data.setDate(dia);
        this.data.setMonth(mes-1);
        this.data.setYear(ano-1900);
    }

    public void setCalendario(){this.calendario.setTime(data);}
    public int getDia(){return this.dia;}
    public int getMes(){return this.mes;}
    public int getAno(){return this.ano;}
    public Date getData(){return this.data;}
    public String mostra1(){return formato1.format(data);}
    public String mostra2(){return formato2.format(data);}
    public boolean bissexto(){return Year.of(calendario.get(Calendar.YEAR)).isLeap();}
    public int diasTranscorridos(){return calendario.get(Calendar.DAY_OF_YEAR);}

    public static void apresentaDataAtual(){
        Date dataAtual = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(dateFormat.format(dataAtual));
    }

    private boolean validaData(String dt)
    {
        try {
            formato1.setLenient(false);
            formato1.parse(dt);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
