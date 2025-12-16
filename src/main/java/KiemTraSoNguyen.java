public class KiemTraSoNguyen {
    public String soNguyen (int so){
        if(so<1||so>100){
            throw new IllegalArgumentException("Số nguyên phải nằm trong khoảng từ 0 đến 100");
        }
        return "So nguyen duong";
    }
}
