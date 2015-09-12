//// Wild circles #2.
String title=  "Click for another circle.";
String subtitle=  "Press any key to erase.";
String author=  "Ths is difficult";

// GLOBAL VARIABLES //
float x,y;
int h,w;

// Setup:  screen size, initialization. //
void setup() {
  size(400, 550);
  x=  width/5;
  y=  height/3;
  w=  65;          // width of ellipse.
  h=  55;          // height of ellipse
}

// Next frame. //
void draw() {
  text( title, 65, 45 );
  text( subtitle, width/10, 19 );
  text( author, 20, height-20 );
  text( w+"x"+h, width-25, height-25 );
  //
  ellipse(x, y, w, h);
}


//  Handle mouse clicks //
void mousePressed() {
  x=  mouseX;
  y=  mouseY;
}


//  Handle keyboard //
void keyPressed() {
  // Erase everything, change size & color. //
  background( random(255), random(100), random(255) );
  fill( random(58), random(86), random(58) );
  w=  int( random(70,140) );
  h=  int( random(70,140) );
}
