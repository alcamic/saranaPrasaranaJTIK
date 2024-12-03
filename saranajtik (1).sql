-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 03, 2024 at 04:09 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `saranajtik`
--

-- --------------------------------------------------------

--
-- Table structure for table `databarang`
--

CREATE TABLE `databarang` (
  `id_barang` int(255) NOT NULL,
  `nama_barang` varchar(255) NOT NULL,
  `jumlah_total` int(255) NOT NULL,
  `jumlah_baik` int(255) NOT NULL,
  `jumlah_kurang_baik` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `databarang`
--

INSERT INTO `databarang` (`id_barang`, `nama_barang`, `jumlah_total`, `jumlah_baik`, `jumlah_kurang_baik`) VALUES
(1101, 'Converter HDMI', 2, 1, 1),
(1102, 'Kabel HDMI', 8, 6, 2),
(1103, 'Meja', 458, 418, 40),
(1104, 'AC', 16, 13, 3),
(1105, 'Papan Tulis', 24, 16, 8),
(1106, 'Proyektor', 5, 2, 2),
(1108, 'Printer', 12, 10, 2),
(1115, 'Komputer', 16, 14, 2);

-- --------------------------------------------------------

--
-- Table structure for table `datakelas`
--

CREATE TABLE `datakelas` (
  `id_kelas` int(255) NOT NULL,
  `nama_kelas` varchar(255) NOT NULL,
  `peminjam` varchar(255) DEFAULT 'Kosong',
  `status` enum('Tidak Terpakai','Terpakai') NOT NULL DEFAULT 'Tidak Terpakai'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `datakelas`
--

INSERT INTO `datakelas` (`id_kelas`, `nama_kelas`, `peminjam`, `status`) VALUES
(101, 'AE 102', 'Tekom B 24', 'Terpakai'),
(102, 'AE 102', 'Kosong', 'Tidak Terpakai'),
(103, 'AE 103', 'Kosong', 'Tidak Terpakai'),
(104, 'AE 104', 'Kosong', 'Tidak Terpakai'),
(105, 'Lab Sistem Cerdas', 'Kosong', 'Tidak Terpakai'),
(106, 'Lab Embedded System', 'Kosong', 'Tidak Terpakai'),
(107, 'Lab Jaringan', 'Tekom F 24', 'Terpakai'),
(108, 'AE 108', 'Kosong', 'Tidak Terpakai'),
(109, 'AE 109', 'Kosong', 'Tidak Terpakai');

-- --------------------------------------------------------

--
-- Table structure for table `pinjambarang`
--

CREATE TABLE `pinjambarang` (
  `id_pinjam` int(255) NOT NULL,
  `nama_barang` varchar(255) NOT NULL,
  `nama_peminjam` varchar(255) NOT NULL,
  `jumlah_pinjam` int(255) NOT NULL,
  `tanggal_pinjam` date NOT NULL,
  `tanggal_kembali` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pinjambarang`
--

INSERT INTO `pinjambarang` (`id_pinjam`, `nama_barang`, `nama_peminjam`, `jumlah_pinjam`, `tanggal_pinjam`, `tanggal_kembali`) VALUES
(7, 'Meja', 'Rois Surya', 10, '2024-11-30', '2024-11-30'),
(8, 'Meja', 'HIMATIK FT', 32, '2024-11-30', NULL),
(9, 'Converter HDMI', 'Tekom B', 1, '2024-11-30', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `databarang`
--
ALTER TABLE `databarang`
  ADD PRIMARY KEY (`id_barang`);

--
-- Indexes for table `datakelas`
--
ALTER TABLE `datakelas`
  ADD PRIMARY KEY (`id_kelas`);

--
-- Indexes for table `pinjambarang`
--
ALTER TABLE `pinjambarang`
  ADD PRIMARY KEY (`id_pinjam`),
  ADD KEY `nama_barang` (`nama_barang`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `databarang`
--
ALTER TABLE `databarang`
  MODIFY `id_barang` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1116;

--
-- AUTO_INCREMENT for table `datakelas`
--
ALTER TABLE `datakelas`
  MODIFY `id_kelas` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=112;

--
-- AUTO_INCREMENT for table `pinjambarang`
--
ALTER TABLE `pinjambarang`
  MODIFY `id_pinjam` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
