package pt.c02oo.s02classe.s03lombriga;

public class AppLombriga {
   
	public static void main(String[] args) {
      Toolkit tk = Toolkit.start();
      
      String lombrigas[] = tk.recuperaLombrigas();
      
      for (int l = 0; l < lombrigas.length; l++)
         System.out.println(lombrigas[l]);
      
      for(int i = 0; i < lombrigas.length; i++) {
    	  tk.gravaPasso("=====");
    	  Animacao anim = new Animacao(lombrigas[i]);
    	  while(anim.atual != anim.passos.length) {
        	  tk.gravaPasso(anim.apresenta());
        	  anim.passo();  
    	  }
    	  tk.gravaPasso(anim.apresenta());
      }
      tk.stop();
   }
	
}
