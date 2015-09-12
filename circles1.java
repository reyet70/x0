//// Wild circles #1.

// GLOBAL VARIABLES //
float x,y;

// Setup:  screen size, initialization. //
void setup() {
  size(450, 550);        
  x=  width/10;
  y=  height/10;
}

// Next frame:  draw three circles. //
void draw() {
  ellipse(x, y, 65, 65);
  ellipse(x+75, y+75, 55, 55);
  ellipse(x+40, y+40, 25, 35);


}
