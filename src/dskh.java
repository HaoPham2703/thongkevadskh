import java.util.ArrayList;
import java.util.Scanner;

public class DSKH implements IChucNang {
    Scanner sc = new Scanner(System.in);
    static ArrayList<KhachHang> dskh = new ArrayList<>();

    @Override
    public void them() {
        System.out.println("----------- THEM KHACH HANG -----------");
        KhachHang khachHang = new KhachHangThuong(); // Mặc định thêm khách hàng thường
        nhapThongTinKhachHang(khachHang);
        dskh.add(khachHang);
        System.out.println("Khach hang da duoc them.");
    }

    @Override
    public void sua() {
        sc.nextLine(); // Đọc bỏ ký tự newline từ bước trước
        System.out.println("----------- SUA KHACH HANG -----------");
        System.out.print("Nhap ten khach hang can sua: ");
        String tenKhachHangCanSua = sc.nextLine();

        KhachHang khachHang = timKhachHangTheoTen(tenKhachHangCanSua);
        if (khachHang != null) {
            suaThongTinKhachHang(khachHang);
            System.out.println("Khach hang da duoc sua.");
        } else {
            System.out.println("Khong tim thay khach hang co ten: " + tenKhachHangCanSua);
        }
    }

    @Override
    public void xoa() {
        sc.nextLine(); // Đọc bỏ ký tự newline từ bước trước
        System.out.println("----------- XOA KHACH HANG -----------");
        System.out.print("Nhap ten khach hang can xoa: ");
        String tenKhachHangCanXoa = sc.nextLine();

        KhachHang khachHang = timKhachHangTheoTen(tenKhachHangCanXoa);
        if (khachHang != null) {
            dskh.remove(khachHang);
            System.out.println("Khach hang da duoc xoa.");
        } else {
            System.out.println("Khong tim thay khach hang co ten: " + tenKhachHangCanXoa);
        }
    }

    @Override
    public void timKiem() {
        sc.nextLine(); // Đọc bỏ ký tự newline từ bước trước
        System.out.println("----------- TIM KIEM KHACH HANG -----------");
        System.out.print("Nhap ten khach hang can tim: ");
        String tenKhachHangCanTim = sc.nextLine();

        KhachHang khachHang = timKhachHangTheoTen(tenKhachHangCanTim);
        if (khachHang != null) {
            khachHang.xuat();
        } else {
            System.out.println("Khong tim thay khach hang co ten: " + tenKhachHangCanTim);
        }
    }

    @Override
    public void xuat() {
        for (KhachHang khachHang : dskh) {
            khachHang.xuat();
        }
    }

    @Override
    public void menu() {
        boolean cont = true;
        do {
            System.out.println("---------------- MENU ----------------");
            System.out.println("1. Them");
            System.out.println("2. Sua");
            System.out.println("3. Xoa");
            System.out.println("4. Tim kiem");
            System.out.println("5. Xuat");
            System.out.println("6. Thoat");
            System.out.println("---------------- END -----------------");
            System.out.println("Nhap lua chon: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    them();
                    break;
                case 2:
                    sua();
                    break;
                case 3:
                    xoa();
                    break;
                case 4:
                    timKiem();
                    break;
                case 5:
                    xuat();
                    break;
                case 6:
                    cont = false;
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
                    break;
            }
        } while (cont);
    }

    private void nhapThongTinKhachHang(KhachHang khachHang) {
        khachHang.nhap();
    }

    private void suaThongTinKhachHang(KhachHang khachHang) {
        khachHang.sua();
    }

    private KhachHang timKhachHangTheoTen(String tenKhachHang) {
        for (KhachHang khachHang : dskh) {
            if (khachHang.getTenKhachHang().equalsIgnoreCase(tenKhachHang)) {
                return khachHang;
            }
        }
        return null;
    }
}
