public class Pilha{
  private int dados[];
  private int topo;

  public Pilha(int capMax){
     dados = new int[capMax];
     topo = -1;
  }

  //push
  public void empilhar(int e){
    //verificar se a pilha está cheia
    if (topo+1 == dados.length){
      //sim
      System.out.println("ERRO! Pilha Cheia");
    } else {
      //não
      /*topo = topo +1;
      dados[topo]=e;*/
      dados[++topo]=e;
    }
  }

  public int desempilhar(){
    int r = -1;
    if (topo == -1){
      System.out.println("ERRO! Pilha Vazia");
    }else{
      //r=dado[topo];
      //topo = topo -1;
      r = dados[topo--];
    }
    return r;
  }

  public String toString(){
    String r="";
    for (int i=0; i<=topo; i++){
       r = r + " " + dados[i];
    }
    return r;
  }
  
}