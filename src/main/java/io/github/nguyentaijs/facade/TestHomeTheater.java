package io.github.nguyentaijs.facade;

public class TestHomeTheater {
	public static void main(String[] args) {

		DvdPlayer dvdPlayer = new DvdPlayer();
		PopcornPopper popcornPopper = new PopcornPopper();
		Projector projector = new Projector();
		Screen screen = new Screen();
		TheaterLight theaterLight = new TheaterLight();
		Amplifier amplifier = new Amplifier();
		CdPlayer cdPlayer = new CdPlayer();
		Tunner tunner = new Tunner();

		HomeTheaterFacade homeRemote = new HomeTheaterFacade(amplifier, cdPlayer, dvdPlayer, popcornPopper, projector,
				screen, theaterLight, tunner);
		homeRemote.watchMovie("Aang - the last air bender");
		homeRemote.endMovie();
	}
}
