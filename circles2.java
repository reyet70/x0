//// Wild circles #2.
String title=  "Click for another circle.";
String subtitle=  "Press any key to erase.";
String author=  "Bruce Alan Martin";

// GLOBAL VARIABLES //
float x,y;
int h,w;

// Setup:  screen size, initialization. //
void setup() {
  size(250, 500);
  x=  width/6;
  y=  height/4;
  w=  55;          // width of ellipse.
  h=  45;          // height of ellipse
}

// Next frame. //
void draw() {
  text( title, 30, 30 );
  text( subtitle, width/6, 15 );
  text( author, 20, height-20 );
  text( w+"x"+h, width 25,height-25 );
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
  background( random(155), random(100), random(155) );
  fill( random(62), random(90), random(62) );
  w=  int( random(60,120) );
  h=  int( random(60,120) );
}
