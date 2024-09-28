

public class Album {
    private String nome;
    private Data dataLancamento;
    private int qtdMaximaFaixas;
    private int qtdAtualFaixas;
    private Musica[] musicas;
    private String musicaz = "" ;
    private boolean tocando = false;

    public Album(String nome, int dia, int mes, int ano, int qtdMaximaFaixas){
        setNomeAlbum(nome);
        qtdAtualFaixas = 0;
        musicas = new Musica[qtdMaximaFaixas];
        this.qtdMaximaFaixas = qtdMaximaFaixas;
        dataLancamento = new Data(dia, mes, ano);
    }
    public void setNomeAlbum(String nome){
         this.nome = nome;
    }
    public String getAlbumNome(){
       return this.nome;
    }

    public void adicionarMusica(Musica musica){
        if(qtdAtualFaixas < qtdMaximaFaixas){
            musicas[qtdAtualFaixas] = musica;
            qtdAtualFaixas++;
            if(qtdAtualFaixas == 1){
            musicaz += " " +musica.getNome();
            }
            else if(qtdAtualFaixas != 1 ){
                musicaz += ", " +musica.getNome();
        }
    }
}
     

    public void removerMusica(){ 
        if(qtdAtualFaixas >= 1){
            qtdAtualFaixas--;
        musicas[qtdAtualFaixas] = null;
        }
    }

    public void trocarMusica(int Imusica, Musica musica){
        boolean x = false;
        for(Musica m : musicas){
            if(musicas[Imusica-1] == m){
                musicas[Imusica-1] = musica;
                x = true;
            }
        }
            if(x = false){
                System.out.println("Não existe música número " + Imusica + " nesse album.");
            }
        
    }


    public void tocarMusica(int numMusica){ 

        if(numMusica >=1 && numMusica <= qtdAtualFaixas){

    System.out.println("Tocando a música " + musicas[numMusica-1].getNome() +
     " composta por " + musicas[numMusica-1].getCompositor() + " e interpretada por " 
     + musicas[numMusica-1].getArtista() + ". Lançada em " + musicas[numMusica-1].getDataLancamento() +
      " e que possui " + musicas[numMusica-1].getDuracao()+ " minutos de duração.");
            tocando = true;
        }
        else{
            System.out.println("Não foi possivel encontrar a música número " + numMusica +".");
        }
}

    public void tocarMusica(String nomeMusica){
        boolean encontrou = false;
        for(Musica musica : musicas){
            if(musica.getNome().equalsIgnoreCase(nomeMusica)){
            System.out.println("Tocando a música " +nomeMusica +
            " composta por " + musica.getCompositor() + " e interpretada por " 
            + musica.getArtista() + ". Lançada em " + musica.getDataLancamento() +
             " e que possui " + musica.getDuracao()+ " minutos de duração.");
             encontrou = true;
             tocando = true;
                break;
            }
        }
            if(!encontrou)
            System.out.println("Não foi possivel encontrar a música "+ nomeMusica);     
         
    }

    public void pausar(Musica musica){
        if(tocando = true){
            System.out.println("A música foi pausada.");
            tocando = false;
        }
        else{
            System.out.println("Nenhuma música está sendo tocada.");
        }
    }

    public void musicasDoArtista(String artista){
        int a = 0;
        for(Musica musica : musicas){
            if(musica.getArtista() == artista){
                a++;
                if(a==1){
                    System.out.println("Música(s) do artista " + artista + " que está(ão) no album: " + musica);
                }
                if(a>1){
                System.out.print(", " + musica);
                }
            }
        }
        if(a==0){
            System.out.println("Não existe nenhuma música do artista " + artista + " nesse album.");
        }
    }

    public void musicasDoCompositor(String compositor){
        int a = 0;
        for(Musica musica : musicas){
            if(musica.getCompositor() == compositor){
                a++;
                if(a==1){
                    System.out.println("Música(s) do composiotr " + compositor + " que está(ão) no album: " + musica);
                }
                if(a>1){
                System.out.print(", " + musica);
                }
            }
        }
        if(a==0){
            System.out.println("Não existe nenhuma música do compositir " +  compositor + " nesse album.");
        }
    }

    public void musicasDoAno(int ano){
        int a = 0;
        for(Musica musica : musicas){
            if(musica.dataLancamento.getAno() == ano){
                a++;
                if(a==1){
                    System.out.println("Música(s) do ano " + ano + " que está(ão) no album: " + musica);
                }
                if(a>1){
                System.out.print(", " + musica);
                }
            }
        }
        if(a==0){
            System.out.println("Não existe nenhuma música do ano" + ano + " nesse album.");
        }
    }


    @Override
    public String toString(){
     return "O nome do album é \"" + getAlbumNome() + "\", a data de lançamento foi em " + this.dataLancamento + " e tem " +
        this.qtdAtualFaixas + " músicas, sendo elas: " + musicaz;
        
    
    }
           
        
        
        
        
}

