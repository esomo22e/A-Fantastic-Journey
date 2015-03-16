PImage img;
int pix=5;
int picture = 1;


int x,y,yinc;
void setup()
{
  size(450,550);
  background(0);
  noStroke();
  img = loadImage("youngestMom.jpg");
  img.resize(450,550);
}
void drawPixel1(){
    if(picture == 1){
      pix=int(map(mouseY,10,width,5,50));
    }
   
  else if(picture == 2){
   pix=int(map(mouseY,10,width,5,150));
 
  }
  else if(picture == 3){
 pix=int(map(mouseY,10,width,5,250));
  }
  else if(picture == 4){
     pix=int(map(mouseY,10,width,5,350));
  }
  else{
 pix=int(map(mouseY,10,width,5,450));
  }
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

void drawPixel2(){
   pix=int(map(mouseY,0,height,5,100));
 
  
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
void drawPixel3(){
  
      pix=int(map(mouseY,0,height,5,150));

  
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
void drawPixel4(){
  
      pix=int(map(mouseY,0,height,5,200));

  
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
void drawPixel5(){
 pix=int(map(mouseY,0,height,5,250));

  
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
void draw()
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

void mousePressed() {
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

