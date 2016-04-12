package fi.softala.tunnit.service;

import org.springframework.stereotype.Service;

import fi.softala.tunnit.service.MiscService;

@Service
public class MiscServiceImpl implements MiscService {

	public void palveluAdmineille() {
		System.out.println("misc admineille");
	}

	public void palveluSisaankirjautuneille() {
		System.out.println("misc sisaankirjautuneille");
	}

	public void palveluKaikille() {
		System.out.println("misc kaikille");
	}

}
