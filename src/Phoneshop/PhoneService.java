package Phoneshop;

import java.math.BigDecimal;
import java.util.ArrayList;

public class PhoneService {
    private final ArrayList<Phone> phones = new ArrayList<>();
    void phonemaking() {
        phones.add(new Phone(1,"Huawei", "P30", BigDecimal.valueOf(697), "6.47' FHD+ (2340x1080) OLED, Kirin 980 Octa-Core (2x Cortex-A76 2.6GHz+ 2x Cortex-A76 1.92GHz + 4x Cortex-A55 1.8GHz), 8GB RAM, 128GB ROM,40+20+8+TOF/32MP, Dual SIM, 4200mAh, Android 9.0 + EMUI 9.1"));
        phones.add(new Phone(2,"Samsung", "GalaxyA52", BigDecimal.valueOf(399), "64 megapixel camera, 4k videokwaliteit 6.5 inch AMOLED scherm 128 GBopslaggeheugen (Uitbreidbaar met Micro-sd) Water- en stofbestendig(IP67)"));
        phones.add(new Phone(3,"Apple", "IPhone11", BigDecimal.valueOf(619), "Met de dubbele camera schiet je in elke situatie een perfecte foto of videoDe krachtige A13-chipset zorgt voor razendsnelle prestaties Met Face IDhoef je enkel en alleen naar je toestel te kijken om te ontgrendelen Hettoestel heeft een lange accuduur dankzij een energiezuinige processor"));
        phones.add(new Phone(4,"Google", "Pixel4a", BigDecimal.valueOf(411), "12.2 megapixel camera, 4k videokwaliteit 5.81 inch OLED scherm 128 GBopslaggeheugen 3140 mAh accucapaciteit"));
        phones.add(new Phone(5,"Xiaomi", "RedmiNote10 Pro", BigDecimal.valueOf(298), "108 megapixel camera, 4k videokwaliteit 6.67 inch AMOLED scherm 128GB opslaggeheugen (Uitbreidbaar met Micro-sd) Water- en stofbestendig(IP53)"));
    }

    Phone getPhone(int id){
        return phones.get(id);
    }
    int getPhonesSize(){
        return phones.size();
    }

    ArrayList<Phone> phonelist(){
        return phones;
    }
}
