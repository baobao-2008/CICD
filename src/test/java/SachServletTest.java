import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class SachServletTest {
SachServlet div;

@BeforeEach
    public void setUp(){
    div = new SachServlet();
}

@Test
    public void HL_NamBangmin(){
    Sach s = new Sach("th06015","Baobao","VanBao",1990,464664);
    assertTrue(div.sua("th06015",s));
}

    @Test
    public void HL_NamBangmax(){
        Sach s = new Sach("th06015","Baobao","VanBao",1991,464664);
        assertTrue(div.sua("th06015",s));
    }

    @Test
    public void HL_NamBangminCong1(){
        Sach s = new Sach("th06015","Baobao","VanBao",2025,464664);
        assertTrue(div.sua("th06015",s));
    }

    @Test
    public void HL_NamBangmaxTru1(){
        Sach s = new Sach("th06015","Baobao","VanBao",2024,464664);
        assertTrue(div.sua("th06015",s));
    }

    @Test
    public void HL_NamBangmintru1(){
        Sach s = new Sach("th06015","Baobao","VanBao",1989,464664);
        assertThrows(IllegalArgumentException.class,()->div.sua("th06015",s));
    }
    @Test
    public void HL_MaDeTrong(){
        Sach s = new Sach("","Baobao","VanBao",2026,464664);
        assertThrows(IllegalArgumentException.class,()->div.sua("",s));
    }
    @Test
    public void HL_TenSachDeTrong(){
        Sach s = new Sach("th06015","","VanBao",2026,464664);
        assertThrows(IllegalArgumentException.class,()->div.sua("th06015",s));
    }
    @Test
    public void HL_TenTacGiaDeTrong(){
        Sach s = new Sach("th06015","Baobao","",2026,464664);
        assertThrows(IllegalArgumentException.class,()->div.sua("th06015",s));
    }
}