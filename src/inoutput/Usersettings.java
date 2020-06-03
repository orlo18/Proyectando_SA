package inoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Usersettings {
	public boolean devolverSettings() {
		boolean dev;
		try {
			File fich = new File(".\\rsrc\\config.conf");
			if (!fich.exists()) {
				fich.createNewFile();
			}
			FileInputStream io = new FileInputStream(fich);
			ObjectInputStream oo = new ObjectInputStream(io);
			dev = oo.readBoolean();
			oo.close();
			io.close();
		} catch (Exception e) {
			dev = true;
		}
		return dev;
	}
	
	public void guardarCambios (boolean dev) {
		try {
			File fich = new File(".\\rsrc\\config.conf");
			if (!fich.exists()) {
				fich.createNewFile();
			}
			FileOutputStream io = new FileOutputStream(fich);
			ObjectOutputStream oo = new ObjectOutputStream(io);
			oo.writeBoolean(dev);
			oo.close();
			io.close();
		} catch (Exception e) {
		}
	}
}
