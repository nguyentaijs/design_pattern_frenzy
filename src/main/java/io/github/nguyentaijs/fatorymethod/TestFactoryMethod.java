package io.github.nguyentaijs.fatorymethod;

public class TestFactoryMethod {

	public static void main(String[] args) {
		System.out.println("Chọn giống cho 12 nông dân ở Tây Nguyên");
		GiongCayTrongFactory tayNguyenFactory = new TayNguyenFactory();
		for (int i = 1; i <= 12; i++) {
			Giong giongDuocChon = tayNguyenFactory.chonGiong();
			System.out.println(String.format("Nguời thứ %d nhận được giống của %s", i, giongDuocChon.showTenGiong()));
		}
		System.out.println("-----");
		System.out.println("Chọn giống cho 12 nông dân ở Đồng bằng sông Cửu Long");
		GiongCayTrongFactory dbSCLFactory = new DBSongCuuLongFactory();
		for (int i = 1; i <= 12; i++) {
			Giong giongDuocChon = dbSCLFactory.chonGiong();
			System.out.println(String.format("Nguời thứ %d nhận được giống của %s", i, giongDuocChon.showTenGiong()));
		}
	}
}
