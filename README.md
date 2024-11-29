# Sistem Sarana Prasarana JTIK

Welcome to the **Sistem Sarana Prasarana JTIK** project! This system is designed for managing and organizing the facilities and infrastructure within the JTIK department. The project is built using **Java**, **MySQL**, with a desktop-based user interface, and **Ant** as the build tool.

## How to Set Up the Database

To get started, you need to set up the database for this system. Below is an example of how to create a MySQL database for the system, named `saranajtik`.

### 1. Create the Database

```sql
CREATE DATABASE saranajtik;
```

### 2. Create the Tables
This system requires three main tables: datakelas, databarang, and pinjambarang.
```sql
CREATE TABLE datakelas (
    id_kelas INT AUTO_INCREMENT PRIMARY KEY,
    nama_kelas VARCHAR(255) NOT NULL,
    peminjam VARCHAR(255) NULL DEFAULT 'Kosong',
    status enum('Tidak Terpakai','Terpakai') DEFAULT 'Tidak Terpakai'
);
```
```sql
CREATE TABLE databarang (
    id_barang INT AUTO_INCREMENT PRIMARY KEY,
    nama_barang VARCHAR(255) NOT NULL,
    jumlah_total INT NOT NULL,
    jumlah_baik INT NOT NULL,
    jumlah_kurang_baik INT NOT NULL,
);
```
```sql
CREATE TABLE pinjambarang (
  id_pinjam INT NOT NULL,
  nama_barang VARCHAR(255) NOT NULL,
  nama_peminjam VARCHAR(255) NOT NULL,
  jumlah_pinjam INT NOT NULL,
  tanggal_pinjam DATE NOT NULL,
  tanggal_kembali DATE DEFAULT NULL
);
```

### 3. Screenshot or Preview from Project
#### 3.1 Homepage
<img src="Beranda.png" alt="Beranda" width="400" height="200" />

#### 3.2 Item Data Page
<img src="Data Barang.png" alt="Data Barang" width="400" height="200" />

#### 3.3 Class Data Page
<img src="Data Kelas.png" alt="Data Kelas" width="400" height="200" />

#### 3.4 Item Borrowing Page
<img src="Pinjam Barang.png" alt="Pinjam Barang" width="400" height="200" />

#### 3.5 Item Return Page
<img src="Pengembalian Barang.png" alt="Pengembalian Barang" width="400" height="200" />

#### 3.6 Class Borrowing Page
<img src="Pinjam Kelas.png" alt="Pinjam Kelas" width="400" height="200" />

#### 3.7 Class Return Page
<img src="Pengembalian Kelas.PNG" alt="Pengembalian Kelas" width="400" height="200" />

MIT License

Copyright (c) 2024 alcamic

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.

