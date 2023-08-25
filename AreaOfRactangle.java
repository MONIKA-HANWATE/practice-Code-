class AreaOfRactangle{
    int length;
    int width;
    int area;                                        
    public void setAreaOfRactangle( int length, int width){
     this.length=length;
     this.width=width;
     
    }
    public void getAreaOfRactangle(){
        System.out.println(length+" "+width+" ");
    }
    public void setArea(int area){
    this.area= area;
    }
    public int getArea(){
        return length*width;
    }

    public static void main(String[] args) {
           AreaOfRactangle s1 =  new AreaOfRactangle(); // creating an object - Heap memory
         s1.setAreaOfRactangle(5,10);
         s1.getAreaOfRactangle();
         System.out.println("Area of Rectangle is"+s1.getArea());
     } 
}