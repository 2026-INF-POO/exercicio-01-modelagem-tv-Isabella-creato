  public class TV{
    int tmhPolegadas;
    int volume;
    int voltagem;
    String marca;
    int canal;
    boolean ligado;

    public TV(int tmhPolegadas, int voltagem, String marca){
      this.tmhPolegadas = tmhPolegadas;
      this.voltagem = voltagem;
      this.marca = marca;
      volume = 5;
      canal = 1;
    }

    void ligar(int consumo){
      ligado = true;
      consumo = voltagem * tmhPolegadas;
      return text("CONSUMO: " + this.consumo); 
    }

    void desligar(){
      if(ligado == true){
        ligado = false;
        System.out.println("TV DESLIGADA!");
      }
    }

    void aumentarVol(int volume){
      if(ligado == true){
        if(volume >= 1 && volume <= 10){
          this.volume = volume;
          volume++;
          return volume;
          System.out.println("VOLUME: " + this.volume);
        }
      }
    }

    void diminuirVol(int volume){
      if(ligado == true){
        if(volume >= 1 && volume <= 10){
          this.volume = volume;
          volume--;
          return volume;
          System.out.println("VOLUME: " + this.volume);
        }    
      }
    }

    void subirCanal(int canal){
      if(ligado == true){
        canal++;
        return canal;
        System.out.println("CANAL: " + this.canal);
      }  
    }

    void subirCanal(int canal){
      if(ligado == true){
        canal--;
        return canal;
        System.out.println("CANAL: " + this.canal);
      }  
    }      
  }
  
