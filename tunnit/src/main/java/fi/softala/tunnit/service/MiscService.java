package fi.softala.tunnit.service;

import org.springframework.security.access.prepost.PreAuthorize;

public interface MiscService {

	@PreAuthorize("hasRole('admin')")
	public abstract void palveluAdmineille();

	@PreAuthorize("isAuthenticated()")
	public abstract void palveluSisaankirjautuneille();

	@PreAuthorize("permitAll")
	public abstract void palveluKaikille();

}