package IP2015.Util;

import java.io.File;
import java.nio.file.Paths;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ImageIconHandler {
	private static ImageIcon test;
	
	public static void getIcons()
	{
		try{
			test = new ImageIcon(ImageIO.read(new File(Paths.get(ImageIconHandler.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getParent()+"/images/test.png")));
		}
		catch (Exception e1)
		{
			try{
				test = new ImageIcon(ImageIO.read(ImageIconHandler.class.getResource("/images/test.png")));
			}
			catch (Exception e2)
			{
				JOptionPane.showMessageDialog(null, "Error: Images not found");
			}
		}
	}

	

}
