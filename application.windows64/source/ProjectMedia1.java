import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class ProjectMedia1 extends PApplet {

PImage img;
int pix=5;
int picture = 1;


int x,y,yinc;
public void setup()
{
  size(450,550);
  background(0);
  noStroke();
  img = loadImage("youngestMom.jpg");
  img.resize(450,550);
}
public void drawPixel1(){
  
      pix=PApplet.parseInt(map(mouseY,10,width,5,50));

  
  for(int i=0;i<pix;i++)
  {
    for(int j=0;j<pix;j++)
    {
      float r = red(img.pixels[((height/pix)*j)*(width)+(width/pix*i)]);
      float g = green(img.pixels[((height/pix)*j)*(width)+(width/pix*i)]);
      float b = blue(img.pixels[((height/pix)*j)*(width)+(width/pix*i)]);
      fill(r,g,b);
    rect((width/pix*i),(height/pix)*j,width/pix,height/pix);
    yinc=(height/pix)*j;
  
    }
  }
}

public void drawPixel2(){
   pix=PApplet.parseInt(map(mouseY,0,height,5,100));
 
  
  for(int i=0;i<pix;i++)
  {
    for(int j=0;j<pix;j++)
    {
      float r = red(img.pixels[((height/pix)*j)*(width)+(width/pix*i)]);
      float g = green(img.pixels[((height/pix)*j)*(width)+(width/pix*i)]);
      float b = blue(img.pixels[((height/pix)*j)*(width)+(width/pix*i)]);
      fill(r,g,b);
    rect((width/pix*i),(height/pix)*j,width/pix,height/pix);
   yinc=(height/pix)*j;
  
    }
  }
}
public void drawPixel3(){
  
      pix=PApplet.parseInt(map(mouseY,0,height,5,150));

  
  for(int i=0;i<pix;i++)
  {
    for(int j=0;j<pix;j++)
    {
      float r = red(img.pixels[((height/pix)*j)*(width)+(width/pix*i)]);
      float g = green(img.pixels[((height/pix)*j)*(width)+(width/pix*i)]);
      float b = blue(img.pixels[((height/pix)*j)*(width)+(width/pix*i)]);
      fill(r,g,b);
    rect((width/pix*i),(height/pix)*j,width/pix,height/pix);
    yinc=(height/pix)*j;
  
    }
  }
}
public void drawPixel4(){
  
      pix=PApplet.parseInt(map(mouseY,0,height,5,200));

  
  for(int i=0;i<pix;i++)
  {
    for(int j=0;j<pix;j++)
    {
      float r = red(img.pixels[((height/pix)*j)*(width)+(width/pix*i)]);
      float g = green(img.pixels[((height/pix)*j)*(width)+(width/pix*i)]);
      float b = blue(img.pixels[((height/pix)*j)*(width)+(width/pix*i)]);
      fill(r,g,b);
    rect((width/pix*i),(height/pix)*j,width/pix,height/pix);
   
  
    }
  }
}
public void drawPixel5(){
 pix=PApplet.parseInt(map(mouseY,0,height,5,250));

  
    for(int i=0;i<pix;i++)
  {
    for(int j=0;j<pix;j++)
    {
      float r = red(img.pixels[((height/pix)*j)*(width)+(width/pix*i)]);
      float g = green(img.pixels[((height/pix)*j)*(width)+(width/pix*i)]);
      float b = blue(img.pixels[((height/pix)*j)*(width)+(width/pix*i)]);
      fill(r,g,b);
    rect((width/pix*i),(height/pix)*j,width/pix,height/pix);
    yinc=(height/pix)*j;
   
  
    }
  }
}
public void draw()
{
  background(0,0);
  img.loadPixels();
 image(img, 0, 0);
  if(picture == 1){
     drawPixel1();
  }
  else if(picture == 2){
    drawPixel2();
 
  }
  else if(picture == 3){
    drawPixel3();
  }
  else if(picture == 4){
     drawPixel4();
  }
  else{
     drawPixel5();
  }
}

public void mousePressed() {
  switch(picture) {
  case 1:
    picture = 2;
     img = loadImage("youngMom4.jpg");
       // drawPixel();
    break;
  case 2:
    picture =3;
    img = loadImage("weddingMom.jpg");
    break;
  case 3:
    picture =4;
    img = loadImage("oldMom3.jpg");
    break;
  case 4:
    picture =5;
    img = loadImage("currentMom.jpg");
    break;
  case 5: 
    picture = 1;
    img = loadImage("youngestMom.jpg");
    break;

  }
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "ProjectMedia1" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
