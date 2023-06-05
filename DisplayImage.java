import java.applet.*;
import java.awt.*;

public class DisplayImage extends Applet{
	Image picture;
	public void init(){
		picture = getImage(getDocumentBase(),"dls1.png");
	}
	public void paint(Graphics g){
		g.drawImage(picture,0,0,this);
	}
}
