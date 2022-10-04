public class line_dir_meth{
    public static void main(String[] args){
        int x=0 ,y=0 , dx , dy ,m;
        int x1 =0,y1=0,x2=8,y2=24;
        dx = x2-x1;
        dy=y2-y1;
        m = dy/dx;
         int c = y-(m*x);

        if(dx>0){
            x=x1;
            y=y1;
            for(x=0;x<=x2;x++){
            
            
            y = (m*x)+c;
            System.out.println("("+x+ ","+ y+")");
        }
        }
        else{
            x=x2;
            y=y2;
            for(x=0;x<=x1;x++){
            
            
            y = (m*x)+c;
            System.out.println("("+x+ ","+ y+")");
        }
        }
       
        
    }
}