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
     
   public Box(Box oldBox) {  
      width = oldBox.width();  
      height = oldBox.height();  
      length = oldBox.length();  
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
     
   public double length() {     
      return length;  
   }  
   public double height() {     
      return height;  
   }  
   public double width() {     
      return width;  
   }  
     
   public double area() {  
      return 2*faceArea() + 2*topArea() + 2*sideArea();  
   }  
     
   public double volume() {  
      return width*height*length;  
   }  
     
   public Box biggerBox(Box oldBox) {  
      return new Box(1.25*oldBox.width(), 1.25*oldBox.height(), 1.25*oldBox.length());  
   }  
   public Box smallerBox(Box oldBox) {  
      return new Box(0.75*oldBox.width(), 0.75*oldBox.height(), 0.75*oldBox.length());  
   }  
}  