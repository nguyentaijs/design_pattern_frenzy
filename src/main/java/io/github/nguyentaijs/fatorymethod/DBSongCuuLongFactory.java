package io.github.nguyentaijs.fatorymethod;

public class DBSongCuuLongFactory implements GiongCayTrongFactory {

	private int count = 0;
	
	@Override
	public Giong chonGiong() {
		switch (count) {
		case 0:
			count ++;
			return new Cam();
		case 1:
			count ++;
			return new Xoai();
		case 2:
			count ++;
			return new Nhan();
		case 3:
			count = 0;
			return new SauRieng();
		default:
			count = 0;
			return null;
		}
	}
}
