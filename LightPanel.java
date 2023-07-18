import java.util.ArrayList;

public class LightPanel {
    private int[][] panel;
    private int onValue;
    private int offValue;

    public LightPanel(int[][] p, int on, int off){
    panel = p;
    onValue = on;
    offValue = off;
    }

    public boolean isColumnError(int column){
        ArrayList<Integer> col = new ArrayList<Integer>();
        for(int j =0;j<this.panel.length;j++){
            col.add(this.panel[j][column]);
        }
      
        for(int k=0;k<col.size();k++){
          if(k!= this.onValue && k!=this.offValue){
            return true;
          }
        }
        return false;
      }

    public void updateColumn(){
        for(int r=0;r<this.panel.length;r++){
          for(int c=0;c<this.panel[0].length;c++){
            if(this.panel[r][c]!=this.onValue && this.panel[r][c]!=this.offValue){
              // i am so sorry this is the most unreadable code I've ever written but
              // nested loops seem like the most convenient way to do this (very sorry)
              for(int i=0;i<this.panel.length;i++){
                for(int j=0;j<this.panel[0].length;j++){
                  if(j+1==this.panel[0].length){
                    this.panel[i][j] = this.panel[i][0];  
                  }
                  else{
                    this.panel[i][j] = this.panel[i][j+1];
                  }
                }
              }
            }   
          }
        }
    }

    public int[][] getPanel(){
        return this.panel;
    }


}
