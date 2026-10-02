package app.auth;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Login extends Usuario {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
}
