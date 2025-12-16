import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class KiemTraSoNguyenTest {
    KiemTraSoNguyen div;
    @BeforeEach
    public void setUp(){
        div= new KiemTraSoNguyen();
    }

    @Test
    public void HL_SoNguyenMin(){
        String thucTe = div.soNguyen(1);
        String mongMuon = "So nguyen duong";
        assertEquals(thucTe,mongMuon);
    }
    @Test
    public void HL_SoNguyenMax(){
        String thucTe = div.soNguyen(100);
        String mongMuon = "So nguyen duong";
        assertEquals(thucTe,mongMuon);
    }
    @Test
    public void HL_SoNguyenMinCong1(){
        String thucTe = div.soNguyen(2);
        String mongMuon = "So nguyen duong";
        assertEquals(thucTe,mongMuon);
    }
    @Test
    public void HL_SoNguyenMaxTru1(){
        String thucTe = div.soNguyen(99);
        String mongMuon = "So nguyen duong";
        assertEquals(thucTe,mongMuon);
    }

    @Test
    public void KHL_SoNguyenMinTru1(){
        assertThrows(IllegalArgumentException.class,() -> div.soNguyen(0));
    }
    @Test
    public void KHL_SoNguyenMaxCong1(){
        assertThrows(IllegalArgumentException.class,() -> div.soNguyen(101));
    }


}