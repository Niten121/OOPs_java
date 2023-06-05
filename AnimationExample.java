import java.awt.*;
import java.applet.*;
public class AnimationExample extends Applet{
	Image pic;
	public void init(){
		pic=getImage(getDocumentBase(),"dls1.png");
	}
	public void paint(Graphics g){
		for(int i=0;i<100;i++)
		{
			g.drawImage(pic,i,50,this);
			try{
				Thread.sleep(10);
				}
			catch(Exception e){}
		}
	}
}