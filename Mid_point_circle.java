class Mid_point_circle{
    
    public static void circle(int xc , int yc , int r){
        int p=1-r;
        int x=0, y=r;
        
        System.out.println((x+xc) +","+ (y+yc));
        System.out.println((x+xc) +","+ (-y+yc));
        System.out.println((y+xc) +","+ (x+yc));
        System.out.println((-y+xc) +","+ (x+yc));
        
        if(p<0){
            x=x+1;
            p=p+2*x+3;
            System.out.println((-x+xc) +","+ (-y+yc));
            System.out.println((-x+xc) +","+ (y+yc));
            System.out.println((y+xc) +","+ (-x+yc));
            System.out.println((-y+xc) +","+ (-x+yc));
            
        }
        else{
            x=x+1;
            y=y-1;
            p=p+2*(x+y)+5;
            System.out.println((-x+xc) +","+ (-y+yc));
            System.out.println((-x+xc) +","+ (y+yc));
            System.out.println((y+xc) +","+ (-x+yc));
            System.out.println((-y+xc) +","+ (-x+yc));
        
    }
    
    }
    
    
    public static void main(String[] args){
        circle(0,0,3);
}
}