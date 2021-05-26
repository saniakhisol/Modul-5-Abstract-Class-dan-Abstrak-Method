package praktikum5;
public final class OperasiBilanganAbsCetak {
    public static void main (String []args){
        OperasiPenjumlahan jumlah = new OperasiPenjumlahan();
        jumlah.set_A(6.5);
        jumlah.set_B(0.5);
        jumlah.set_C();
        
        System.out.println("PENJUMLAHAN");
        System.out.println("Bilangan A : "+jumlah.get_A());
        System.out.println("Bilangan B : "+jumlah.get_B());
        System.out.println("A + B = "+jumlah.get_C());
        
        jumlah.tampil();
        System.out.println();
        
        OperasiPengurangan kurang = new OperasiPengurangan();
        kurang.set_A(6.5);
        kurang.set_B(0.5);
        kurang.set_C();
        
        System.out.println("PENGURANGAN");
        System.out.println("Bilangan A : "+kurang.get_A());
        System.out.println("Bilangan B : "+kurang.get_B());
        System.out.println("A - B = "+kurang.get_C());
        
        kurang.tampil();
        System.out.println();
        
        OperasiPerkalian kali = new OperasiPerkalian();
        kali.set_A(6.5);
        kali.set_B(0.5);
        kali.set_C();
        
        System.out.println("PERKALIAN");
        System.out.println("Bilangan A : "+kali.get_A());
        System.out.println("Bilangan B : "+kali.get_B());
        System.out.println("A * B = "+kali.get_C());
        
        kali.tampil();
        System.out.println();
        
        OperasiPembagian bagi = new OperasiPembagian();
        bagi.set_A(6.5);
        bagi.set_B(0.5);
        bagi.set_C();
        
        System.out.println("PEMBAGIAN");
        System.out.println("Bilangan A : "+bagi.get_A());
        System.out.println("Bilangan B : "+bagi.get_B());
        System.out.println("A / B = "+bagi.get_C());
        
        bagi.tampil();
    }
}