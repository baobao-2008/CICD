import java.util.ArrayList;
import java.util.List;

public class SachServlet {
    List<Sach> ls = new ArrayList<>();
    public Boolean sua(String ma, Sach s){

        if(s.getMaSach().isEmpty()||s.getTenSach().isEmpty()||s.getTacGia().isEmpty()){
            throw new IllegalArgumentException("Các trường trên không được để trống");
        }

        if(s.getNamXuatBan()<1990 || s.getNamXuatBan()>2025){
            throw new IllegalArgumentException("Năm Xuất bản phải nằm trong khoảng từ 1990 - 2025");
        }
        return true;
    }
}
