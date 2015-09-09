//// Wild circles #1.

// GLOBAL VARIABLES //
float x,y;

// Setup:  screen size, initialization. //
void setup() {
  size(150, 300);        // Try changing the width & height.
  x=  width/10;
  y=  height/10;
}

// Next frame:  draw three circles. //
void draw() {
  ellipse(x, y, 15, 30);
  ellipse(x+35, y+55, 20, 20);
  ellipse(x+60, y+60, 10, 10);
 
  // Move them???? //--              x=  x + 2;  y=  y + 1;
  // Insert BREAK here ^
  // to uncomment the above code,
}
