package lap4encapsul;

import java.util.Scanner;

public class bookMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a, b, c;
        
        System.out.println("DAFTAR TAMU SEMINAR GAME DEVELOPMENT");
        System.out.println("");
        System.out.print("Jumlah tamu yang akan ditambahkan  : ");
        int jum = in.nextInt();
        
        book[] guestbook;
        guestbook = new book[jum];
        for (int i = 0; i < guestbook.length; i++) {
            System.out.println("");
            System.out.print("Masukkan Nama       : ");
            a = in.next();
            System.out.print("Masukkan No.HP      : ");
            c = in.next();
            System.out.print("Masukkan Jurusan    : ");
            b = in.next();
            System.out.println("");
            book x = new book(a, b, c);
            x.DisplayMessages();
            System.out.println("Kode tamu : "+book.idTamu());
        }
    }

}
