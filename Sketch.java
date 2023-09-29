import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
	// * Size of the window
    size(800, 400);
  }

  /** 
   * Background colour
   */
  public void setup() {
    background(166, 216, 255);
  }

  /**
   * Drawings that form a house, the sun, and the ground
   * HOWEVER, when the initial size call is updated, the drawings placement and size is also updated
   */
  public void draw() {
	  
    fill(191, 142, 52);
    square((float)(width * 0.375), (float)(height * 0.375), (float)(width / 4));
    triangle((float)(width * 0.625), (float)(height * 0.375), (float)(width * 0.5), (float)(height * 0.25),
    (float)(width * 0.375), (float)(height * 0.375));

    fill(230, 175, 76);
    rect((float)(width * 0.44375), (float)(height * 0.625), (float)(width * 0.1125), (float)(height * -0.125));

    circle((float)(width * 0.535), (float)(height * 0.575), (float)(width * 0.0125));

    fill(255, 238, 0);
    circle(0, 0, (float)(width * 0.375));

    fill(75, 140, 63);
    rect(0, (float)(height * 0.625), (width), (float)(height * 0.375));
  }
}