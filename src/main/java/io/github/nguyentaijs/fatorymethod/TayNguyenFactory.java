package io.github.nguyentaijs.fatorymethod;

import java.util.Random;

public class TayNguyenFactory implements GiongCayTrongFactory {

	/**
	 * Cho phép chọn bất kỳ cây công nghiệp nào trong danh sách: Cà phê, tiêu, cao su
	 */
	@Override
	public Giong chonGiong() {
		Random chonGiongNgauNhien = new Random();

		switch (chonGiongNgauNhien.nextInt(3)) {
		case 0:
			return new CaPhe();
		case 1:
			return new Tieu();
		case 2:
			return new CaoSu();
		default:
			return null;
		}
	}
}
