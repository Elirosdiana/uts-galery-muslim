package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Galery;
import simple.example.hewanpedia.model.Pria;
import simple.example.hewanpedia.model.Wanita;

public class DataProvider {
    private static List<Galery> galeries = new ArrayList<>();

    private static List<Pria> initDataPria(Context ctx) {
        List<Pria> prias = new ArrayList<>();
        prias.add(new Pria("JV7", "Rp 200.000","pakaian gamis pria merk JV7 ini sangan nyaman digunakan", R.drawable.pria_1));
        prias.add(new Pria("LV", "Rp 300.000","baju muslim jenis ini sangat nyaman untuk digunakan", R.drawable.pria_2));
        prias.add(new Pria("JV7", "Rp 250.000","pakaian muslim pria dengan merk JV7 yang sangan bagus dan nyaman ", R.drawable.pria_3));
        prias.add(new Pria("JV7", "rp 230.000","pakaian pria dengan model gamis merk JV7", R.drawable.pria_4));
        prias.add(new Pria("JV7", "Rp 150.000","pakaian muslim jenis koko merk JV7", R.drawable.pria_5));
        prias.add(new Pria("JV7", "Rp 230.000","pakaian pria koko merk JV7", R.drawable.pria_6));
        return prias;
    }

    private static List<Wanita> initDataWanita(Context ctx) {
        List<Wanita> wanitas = new ArrayList<>();
        wanitas.add(new Wanita("Clarissa", "Rp 120.000","Gamis muslimah clarissa", R.drawable.wanita_1));
        wanitas.add(new Wanita("Tya", "Rp 225.000","Gamis muslimah wanita tya", R.drawable.wanita_2));
        wanitas.add(new Wanita("Jil set", "Rp 270.000","Gamis muslimah remaja", R.drawable.wanita_3));
        wanitas.add(new Wanita("Rebana", "Rp 315.000","Gamis wanita dengan kain lembut dan nyaman", R.drawable.wanita_4));
        wanitas.add(new Wanita("Hagiya", "Rp 199.000","pakaian gamis muslim hagiya sopiya", R.drawable.wanita_5));
        wanitas.add(new Wanita("Beliwa", "Rp 200.000","pakaian muslimah dengan merk beliwa yang nyaman dan halus ", R.drawable.wanita_6));
        return wanitas;
    }

    private static void initAllBajus(Context ctx) {
        galeries.addAll(initDataPria(ctx));
        galeries.addAll(initDataWanita(ctx));
    }

    public static List<Galery> getAllPakaian(Context ctx) {
        if (galeries.size() == 0) {
            initAllBajus(ctx);
        }
        return galeries;
    }

    public static List<Galery> getBajusByTipe(Context ctx, String jenis) {
        List<Galery> bajusByType = new ArrayList<>();
        if (galeries.size() == 0) {
            initAllBajus(ctx);
        }
        for (Galery h : galeries) {
            if (h.getJenis().equals(jenis)) {
                bajusByType.add(h);
            }
        }
        return bajusByType;
    }

}
