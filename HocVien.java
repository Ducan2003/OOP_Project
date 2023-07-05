package Bai11;

import java.text.Format;
import java.time.LocalDate;
public class HocVien {
	private String hoten;
	private LocalDate namsinh;
	private double dToan, dLy, dHoa, dSinh, dAnh;
	
	
	public HocVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HocVien(String hoten, LocalDate namsinh, double dToan, double dLy, double dHoa, double dSinh,double dAnh) {
		this.hoten = hoten;
		this.namsinh = namsinh;
		this.dToan = dToan;
		this.dLy = dLy;
		this.dHoa = dHoa;
		this.dSinh = dSinh;
		this.dAnh = dAnh;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public LocalDate getNamsinh() {
		return namsinh;
	}

	public void setNamsinh(LocalDate namsinh) {
		this.namsinh = namsinh;
	}

	public double getdToan() {
		return dToan;
	}

	public void setdToan(double dToan) {
		this.dToan = dToan;
	}

	public double getdLy() {
		return dLy;
	}

	public void setdLy(double dLy) {
		 this.dLy = dLy;
	}

	public double getdHoa() {
		return dHoa;
	}

	public void setdHoa(double dHoa) {
		this.dHoa = dHoa;
	}

	public double getdSinh() {
		return dSinh;
	}

	public void setdSinh(double dSinh) {
		this.dSinh = dSinh;
	}

	public double getdAnh() {
		return dAnh;
	}

	public void setdAnh(double dAnh) {	
		 this.dAnh = dAnh;
		
	}
	public double DiemTB(double dToan, double dLy, double dHoa, double dSinh, double dAnh) {
		double TBmon=0;
		TBmon = (dToan + dLy + dHoa + dSinh + dAnh) / 5;
		return TBmon;
	}
	
	public boolean ktduoi5(double[] diem) {
		for (int i = 0; i < diem.length; i++) {
			if (diem[i] < 5)
				return true;
		}
		return false;
	}
	public void Ketluan() {
		double[] a = new double [5];
		a[0] = dToan;
		a[1] = dLy;
		a[2] = dHoa;
		a[3] = dSinh;
		a[4] = dAnh;
		double diemTrungBinh = DiemTB(dToan, dLy, dHoa, dSinh, dAnh);
		if (!ktduoi5(a) && diemTrungBinh > 7) 
			System.out.println("Duoc lam luan van");
		if(!ktduoi5(a) && diemTrungBinh <= 7)
			System.out.println("Thi tot nghiep");
		if(ktduoi5(a))
			System.out.println("Thi lai");
	}
	@Override
	public String toString() {
		return 	
			"HocVien\n Ho va ten: " + hoten 
				+ ", Nam sinh: " + namsinh 
				+ ", dToan=" + dToan 
				+ ", dLy=" + dLy 
				+ ", dHoa=" + dHoa 
				+ ", dSinh=" + dSinh 
				+ ", dAnh=" + dAnh
				+ ", TBmon=" + DiemTB(dToan, dLy, dHoa, dSinh, dAnh);
	}
}	
