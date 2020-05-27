package net.alwimuhammad.dongenginteraktif.model;

import net.alwimuhammad.dongenginteraktif.R;

/**
 *
 */
public class Dongeng {
    private Halaman[] mHalamans;

    public Dongeng() {
        mHalamans = new Halaman[13];

        mHalamans[0] = new Halaman(
                R.drawable.gambar0,
                "Tom dan Jerry adalah sahabat sedari kecil. Tapi sahabat ini selalu bertengkar satu sama lain. Di satu waktu, Tom mendapati Jerry sedang memakan ayam goreng di kotak makan miliknya. Kamu, %1$s, apa yang seharusnya Tom lakukan?",
                new Pilihan("Bilang secara baik baik", 1),
                new Pilihan("Ajak ribut", 2)
        );

        mHalamans[1] = new Halaman(
                R.drawable.gambar1,
                "Tom memberi tahu Jerry secara baik baik, bahwa janganlah mengambil makanan miliknya. Jerry pun merasa bersalah. Tom merasa Jerry harus minta maaf",
                new Pilihan("Bilang ke Jerry", 3),
                new Pilihan("Balas dendam", 4));

        mHalamans[2] = new Halaman(
                R.drawable.gambar2,
                "Tom memilih untuk mengajak ribut Jerry. Tapi Jerry tidak takut dan langsung berani melawan Tom",
                new Pilihan("Kejar dan balas dendam", 7),
                new Pilihan("Tom tidak mau berkelahi", 6));

        mHalamans[3] = new Halaman(
                R.drawable.gambar3,
                "Tom bilang ke Jerry bahwa jerry harus minta maaf. Tapi Jerry tidak mendengarkan dan malah mengejek ngejek Tom. Tom pun mengejarnya. Tom punya dua rencana, tapi dia bingung rencana mana yang harus dia lakukan.",
                new Pilihan("Jebak Jerry dengan petasan", 4),
                new Pilihan("Jebak Jerry dengan keju", 5));

        mHalamans[4] = new Halaman(
                R.drawable.gambar4,
                "Tom memasang petasan dekat kamar Jerry. Tapi jerry lebih cerdik, dia pun memasang petasan dibelakang Tom. Petasan pun meledak dan Tom kesakitan",
                new Pilihan("Jebak lagi dengan keju", 5),
                new Pilihan("Menyusun rencana", 12));

        mHalamans[5] = new Halaman(
                R.drawable.gambar5,
                "Tom mencoba menjebak jerry dengan keju. Ternyata jebakan itu berhasil dan Jerry tidak bisa berkutik kembali.");

        mHalamans[6] = new Halaman(
                R.drawable.gambar6,
                "Tom memilih berdamai dan jerry pun mengiyakan nya.");

        mHalamans[7] = new Halaman(
                R.drawable.gambar7,
                "Jerry berlari menuju spike yang sedang tidur dan mengganggunya, saat tom datang seolah olah tom yang mengganggu spike. Jerry pun mengejek tom dan kabur.",
                new Pilihan("Jebak Jerry dengan petasan", 4),
                new Pilihan("Kejar dan balas dendam", 9));

        mHalamans[8] = new Halaman(
                R.drawable.gambar8,
                "Sadar tidak bisa menang melawan Jerry, Tom pun memilih untuk mengakui kekalahan.");

        mHalamans[9] = new Halaman(
                R.drawable.gambar9,
                "Tom mengejar Jerry ke Dapur. Disana mereka berantem dengan sengit. Namun, ternyata Jerry lebih diuntungkan oleh keadaan. Apa yang harus dilakukan Tom?",
                new Pilihan("Tom mengakui kekalahan", 8),
                new Pilihan("Berdamai", 6));

        mHalamans[10] = new Halaman(
                    R.drawable.gambar10,
                    "Tom memanggil teman-temannya dalam upaya untuk menangkap jerry dan kali ini tom tidak bergerak sendiri, dia memanggil temannya agar dapat berhasil menangkap Jerry",
                    new Pilihan("Mengekeroyok Jerry", 11),
                    new Pilihan("Berdamai", 6));

        mHalamans[11] = new Halaman(
                R.drawable.gambar11,
                "Tanpa disangka, ternyata Jerry sangatlah kuat sehingga ia dapat membereskan teman-teman Tom. Apa yang harus dilakukan Tom",
                new Pilihan("Tom mengakui kekalahan", 8),
                new Pilihan("Berdamai", 6));

        mHalamans[12] = new Halaman(
                R.drawable.gambar12,
                "Tom pun mulai merencanakan lagi hal apa yang harus ia lakukan untuk bisa menangkap Jerry",
                new Pilihan("Minta bantuan", 10),
                new Pilihan("Jebak dengan Keju", 5));


    }

    public Halaman getHalaman(int pageNumber) {
        return mHalamans[pageNumber];
    }
}
