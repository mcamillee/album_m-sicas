public class Data {
    private int dia;
    private int iMes;
    private String sMes;
    private int ano;

    public Data(int dia, int mes, int ano){
        setAno(ano);   
        setMes(iMes);
        setDia(dia);
     }

    public void setDia(int dia){
        if(dia >= 1 && dia <= 28)
            this.dia = dia;
        else if((iMes == 1 || iMes == 3 || iMes == 5 || iMes == 7 || iMes == 8 || iMes == 10 || iMes == 12) && dia >= 1 && dia <= 31)
            this.dia = dia;
        else if((iMes == 4 || iMes == 6 || iMes == 9 || iMes == 11) && dia >= 1 && dia <= 30)
            this.dia = dia;
        else if(iMes == 2 && dia == 29){
            if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0))
                this.dia = 29;
            else
                this.dia = 28;
        }
        else 
            this.dia = 1;
    }

    public int getDia(){
        return this.dia;
    }

    public void setMes(int mes){
        if(mes >= 1 && mes <= 12)
            this.iMes = mes;
        else
            this.iMes = 1;
    }

    public void setMes(String mes){
        //1 - 12
        if(mes == "janeiro"){
            iMes = 1;
        }
        else if(mes == "fevereiro"){
            iMes = 2;
        }
        else if(mes == "março"){
            iMes = 3;
        }
        else if(mes == "abril"){
            iMes = 4;
        }
        else if(mes == "maio"){
            iMes = 5;
        }
        else if(mes == "junho"){
            iMes = 6;
        }
        else if(mes == "julho"){
            iMes = 7;
        }
        else if(mes == "agosto"){
            iMes = 8;
        }
        else if(mes == "outubro"){
            iMes = 10;
        }
        else if(mes == "novembro"){
            iMes = 11;
        }
        else if(mes == "dezembro"){
            iMes = 12;
        }
        else{
            iMes = 1;
        }
    }
    public int getMes(){
        return this.iMes;
    }
    public void setAno(int ano){
        if(ano >= 1900 && ano <= 2030)
            this.ano = ano;
        else
            this.ano = 2024;
    }
    public int getAno(){
        return this.ano;
    }

    public void imprimirData(Musica musica){
     System.out.println( "Data da musica " + musica + ": " + dia + "/" + iMes + "/" + ano);
    }
    
    @Override
    public String toString(){
        return dia + "/" + iMes + "/" + ano;
   
    }
}
