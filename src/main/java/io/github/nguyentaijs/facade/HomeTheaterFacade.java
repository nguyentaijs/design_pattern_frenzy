package io.github.nguyentaijs.facade;

public class HomeTheaterFacade {
	private Amplifier amplifier;
	private CdPlayer cdPlayer;
	private DvdPlayer dvdPlayer;
	private PopcornPopper popcornPopper;
	private Projector projector;
	private Screen screen;
	private TheaterLight theaterLight;
	private Tunner tunner;

	public HomeTheaterFacade(Amplifier amplifier, CdPlayer cdPlayer, DvdPlayer dvdPlayer, PopcornPopper popcornPopper,
			Projector projector, Screen screen, TheaterLight theaterLight, Tunner tunner) {
		this.amplifier = amplifier;
		this.cdPlayer = cdPlayer;
		this.dvdPlayer = dvdPlayer;
		this.popcornPopper = popcornPopper;
		this.projector = projector;
		this.screen = screen;
		this.theaterLight = theaterLight;
		this.tunner = tunner;
	}

	public void watchMovie(String movie) {
		System.out.println("Ready to watch movie");
		popcornPopper.on();
		popcornPopper.pop();

		theaterLight.dim();

		screen.down();

		projector.on();

		amplifier.on();
		amplifier.setDVD(dvdPlayer);
		amplifier.setVolume(5);

		dvdPlayer.on();
		dvdPlayer.play(movie);
	}

	public void endMovie() {
		System.out.println("End movie");

		popcornPopper.off();

		theaterLight.on();

		screen.up();

		projector.off();

		amplifier.off();

		dvdPlayer.stop();
		dvdPlayer.eject();
		dvdPlayer.off();
	}

	public void listenToCd() {

	}

	public void endCd() {

	}
}
