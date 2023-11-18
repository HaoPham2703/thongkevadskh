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
    public void capNhatThongKeSach(ArrayList<Sach> danhSachSach) {
        for (Sach sach : danhSachSach) {
            doanhThu += tinhDoanhThu(sach); // Gọi phương thức tinhDoanhThu ở đây
            soLuongSachTonKho += sach.soLuong;
        }
    }

    // Phương thức cập nhật số lượng nhân viên từ danh sách nhân viên
    public void capNhatThongKeNhanVien(ArrayList<NhanVien> danhSachNhanVien) {
        soLuongNhanVien = danhSachNhanVien.size();
    }

    // Phương thức tính doanh thu cho từng đối tượng Sach
    private float tinhDoanhThu(Sach sach) {
        // Sử dụng getter để lấy giá sách
        int giaSach = sach.getGia();
        // Thực hiện tính doanh thu
        return giaSach * sach.soLuong;
    }
}
