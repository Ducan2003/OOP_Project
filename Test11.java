package Bai11;

import java.time.LocalDate;

public class Test11 {
	public static void main(String[] args) {
		HocVien hv1 = new HocVien("Truong Tan Kiet", LocalDate.of(2003, 12, 01), 7.1, 8.0, 5.5, 6.6, 6.5);
		HocVien hv2 = new HocVien ("Nguyen Van A", LocalDate.of(2003, 07, 03), 5.5, 8.8, 7.0, 8.5, 8.0);
		HocVien hv3 = new HocVien ("Nguyen Van B", LocalDate.of(2003, 07, 03), 1.5, 2.8, 7.1, 3.0, 4.5  );
		hv1.DiemTB(7.1, 8.0, 5.5, 6.6, 6.5);
		hv2.DiemTB(5.5, 8.8, 7.0, 8.5, 8.0);
		hv3.DiemTB(1.5, 2.8, 7.1, 3.0, 4.5);
		System.out.printf("Thong tin:\n" +hv1.toString());
		hv1.Ketluan();
		System.out.printf("Thong tin:\n" +hv2.toString());
		hv2.Ketluan();
		System.out.printf("Thong tin:\n" +hv3.toString());
		hv3.Ketluan();
	}
}
