class Box {  
   double width, height, length;  
     
   public Box(double inwidth, double inheight, double inlength) {  
      width = inwidth;  
      height = inheight;  
      length = inlength;  
   }  
     
   public Box(double side) {  
      width = side;  
      height = side;  
      length = side;  
   }  
     
   private double faceArea() {  
      return width*height;  
   }  
   private double topArea() {  
      return length*height;  
   }  
   private double sideArea() {  
      return width*length;  
   }  
     
   public double area() {  
      return 2*faceArea() + 2*topArea() + 2*sideArea();  
   }  
     
   public double volume() {  
      return width*height*length;  
   }  
}  