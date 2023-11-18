import java.util.ArrayList;
import java.util.Scanner;

// Lớp ThongKe
public class ThongKe {
    private float doanhThu;
    private int soLuongSachTonKho;
    private int soLuongNhanVien;

    // Phương thức xuat
    public void xuat() {
        System.out.println("Doanh Thu: " + doanhThu);
        System.out.println("Số Lượng Sách Tồn Kho: " + soLuongSachTonKho);
        System.out.println("Số Lượng Nhân Viên: " + soLuongNhanVien);
    }

    // Phương thức cập nhật dữ liệu từ danh sách sách
    public void capNhatThongKe(ArrayList<Sach> danhSachSach) {
        // Tính doanh thu và số lượng sách tồn kho
        for (Sach sach : danhSachSach) {
            doanhThu += sach.tinhDoanhThu();
            soLuongSachTonKho += sach.soLuong;
        }
    }

    // Phương thức cập nhật số lượng nhân viên từ danh sách nhân viên
    public void capNhatThongKeNhanVien(ArrayList<NhanVien> danhSachNhanVien) {
        soLuongNhanVien = danhSachNhanVien.size();
    }
}