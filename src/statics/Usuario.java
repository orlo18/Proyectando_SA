package statics;

import java.util.Arrays;

public class Usuario {
	private String login;
	private char[] contrasena;
	
	public Usuario(String login, char[] contrasena) {
		this.login = login;
		this.contrasena = contrasena;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public char[] getContrasena() {
		return contrasena;
	}

	public void setContrasena(char[] contrasena) {
		this.contrasena = contrasena;
	}

	@Override
	public String toString() {
		return "Usuario [login=" + login + ", contrasena=" + Arrays.toString(contrasena) + "]";
	}
	
}
