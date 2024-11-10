# Aplikasi Absensi

Aplikasi Absensi adalah aplikasi berbasis GUI yang dibuat menggunakan NetBeans versi 8.2 dan JDK. Aplikasi ini menggunakan MySQL sebagai basis datanya.

## Fitur

- Manajemen pengguna (admin dan pengguna biasa)
- Pencatatan absensi harian
- Laporan absensi pegawai

## Persyaratan

- NetBeans IDE 8.2
- JDK 8 atau versi terbaru
- MySQL Server

## Instalasi

1. **Kloning Repositori**

    ```sh
    git clone [https://github.com/username/absensi-netbeans.git](https://github.com/rahmate2003/ABSENSI-NETBEANS-GUI.git)
    cd ABSENSI-NETBEANS-GUI
    ```

2. **Buka Proyek di NetBeans**

    - Buka NetBeans IDE 8.2.
    - Pilih `File` -> `Open Project` dan arahkan ke folder tempat Anda mengkloning repositori ini.

3. **Konfigurasi Basis Data**

    - Buat database baru di MySQL dengan nama `absensi`.
    - Impor file SQL yang terdapat di folder `database` untuk membuat tabel-tabel yang diperlukan:

      ```sh
      mysql -u root -p absensi < path/to/database/absensi.sql
      ```

    - Ubah pengaturan koneksi basis data di dalam kode (biasanya di kelas `DatabaseConnection` atau sejenisnya) sesuai dengan kredensial MySQL Anda.

4. **Jalankan Proyek**

    - Jalankan proyek dengan mengklik tombol `Run` di NetBeans atau dengan menekan `Shift + F6`.

## Penggunaan

1. **Login**

    - Masuk sebagai admin atau pengguna biasa dengan kredensial yang telah ditentukan.

2. **Pencatatan Absensi**

    - Pilih menu `Absensi` dan lakukan pencatatan kehadiran harian.

3. **Laporan**

    - Pilih menu `Laporan` untuk melihat laporan absensi.



## Lisensi

Proyek ini dilisensikan di bawah lisensi MIT. Lihat file [LICENSE](LICENSE) untuk informasi lebih lanjut.

