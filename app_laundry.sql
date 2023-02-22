-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 22, 2023 at 03:50 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `app_laundry`
--

-- --------------------------------------------------------

--
-- Table structure for table `history_hapus_user`
--

CREATE TABLE `history_hapus_user` (
  `id_log` int(11) NOT NULL,
  `id_user` char(20) DEFAULT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(6) DEFAULT NULL,
  `alamat` varchar(250) DEFAULT NULL,
  `no_hp` char(12) DEFAULT NULL,
  `akses` enum('admin','kasir') DEFAULT NULL,
  `waktu` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `history_hapus_user`
--

INSERT INTO `history_hapus_user` (`id_log`, `id_user`, `nama`, `username`, `password`, `alamat`, `no_hp`, `akses`, `waktu`) VALUES
(6, 'US0001', 'Heni Laundry', 'Heni Laundry', 'heni20', 'Jember', '0823123424', 'kasir', '2022-12-21'),
(7, 'US0007', 'Muhammad', 'lolololo', '123', 'giri', '089786567123', 'kasir', '2023-01-01'),
(8, 'US0007', 'jjjii', 'iji', 'ijij', 'ijj', '089098987876', 'kasir', '2023-01-02'),
(9, 'US0007', 'Muhammad Syahroni abdullah al makkah', 'roni', 'roni12', 'banyuwangi', '023123435612', 'kasir', '2023-01-02'),
(10, 'US0007', 'aris sah', 'arissah', 'aris20', 'jember', '089769837902', 'kasir', '2023-01-02'),
(11, 'US0007', 'gg', 'uh', 'uh', 'uh', '000000000000', 'kasir', '2023-01-04'),
(12, 'US0007', 'huh', 'jujuju', 'uhuhu', 'ihhu', '090909878767', 'kasir', '2023-01-06'),
(13, 'US0006', 'Aprilia Dwi Wahyuni', 'Aprilia Dwi Wahyuni', 'april2', 'Jember', '082313459712', 'kasir', '2023-01-06'),
(14, 'US0005', 'Dwi Ratna Amelia', 'Ratna Amelia', 'ratna2', 'Jember', '082341657818', 'kasir', '2023-01-07'),
(21, 'US0005', 'Monkey D Luffy', 'Luffy', 'luffy1', 'Jember', '082931934012', 'kasir', '2023-01-07'),
(22, 'US0006', 'jjj', 'ijij', 'ikiki', 'iji', '000000000000', 'kasir', '2023-01-07'),
(23, 'US0005', 'jjjijij', 'ijij', 'ijj', 'ijij', '00000000999', 'kasir', '2023-01-07'),
(24, 'US0007', 'huh', 'oooooooo', 'ijuj', 'uuhh', '998988889988', 'kasir', '2023-01-08'),
(25, 'US0007', 'Aprilia ', 'Agung Kuriniawan', 'aprili', 'jember', '08123456781', 'kasir', '2023-01-11');

-- --------------------------------------------------------

--
-- Table structure for table `history_transaksi`
--

CREATE TABLE `history_transaksi` (
  `id_hist` int(11) NOT NULL,
  `kode_order` char(20) NOT NULL,
  `id_user_awl` char(20) DEFAULT NULL,
  `id_user_br` char(20) DEFAULT NULL,
  `grand_total_awl` int(6) DEFAULT NULL,
  `grand_total_br` int(6) DEFAULT NULL,
  `bayar_awl` int(11) DEFAULT NULL,
  `bayar_br` int(11) DEFAULT NULL,
  `kurang_byr_awl` int(11) DEFAULT NULL,
  `kurang_byr_bru` int(11) DEFAULT NULL,
  `status_byr_awl` varchar(50) DEFAULT NULL,
  `status_byr_br` varchar(50) DEFAULT NULL,
  `kembalian_awl` int(11) DEFAULT NULL,
  `kembalian_br` int(11) DEFAULT NULL,
  `status_ambil_awl` varchar(50) DEFAULT NULL,
  `status_amblbr` varchar(50) DEFAULT NULL,
  `waktu` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `history_transaksi`
--

INSERT INTO `history_transaksi` (`id_hist`, `kode_order`, `id_user_awl`, `id_user_br`, `grand_total_awl`, `grand_total_br`, `bayar_awl`, `bayar_br`, `kurang_byr_awl`, `kurang_byr_bru`, `status_byr_awl`, `status_byr_br`, `kembalian_awl`, `kembalian_br`, `status_ambil_awl`, `status_amblbr`, `waktu`) VALUES
(14, 'TR0001', 'US0004', 'US0004', 94500, 144500, 100000, 100000, 0, 50000, 'lunas', 'lunas', 5500, 5500, 'belum di ambil', 'belum di ambil', '2022-12-21'),
(15, 'TR0001', 'US0004', 'US0004', 144500, 169000, 100000, 100000, 50000, 74500, 'lunas', 'lunas', 5500, 5500, 'belum di ambil', 'belum di ambil', '2022-12-21'),
(16, 'TR0001', 'US0004', 'US0004', 169000, 189000, 100000, 100000, 74500, 94500, 'lunas', 'lunas', 5500, 5500, 'belum di ambil', 'belum di ambil', '2022-12-21'),
(17, 'TR0002', 'US0004', 'US0004', 50000, 100000, 50000, 50000, 0, 50000, 'lunas', 'lunas', 0, 0, 'belum di ambil', 'belum di ambil', '2022-12-21'),
(18, 'TR0003', 'US0004', 'US0004', 20000, 40000, 50000, 50000, 0, 20000, 'lunas', 'lunas', 30000, 30000, 'belum di ambil', 'belum di ambil', '2022-12-21'),
(19, 'TR0004', 'US0004', 'US0004', 175000, 350000, 200000, 200000, 0, 175000, 'lunas', 'lunas', 25000, 25000, 'belum di ambil', 'belum di ambil', '2022-12-21'),
(20, 'TR0005', 'US0004', 'US0004', 37500, 75000, 50000, 50000, 0, 37500, 'lunas', 'lunas', 12500, 12500, 'belum di ambil', 'belum di ambil', '2022-12-21'),
(21, 'TR0006', 'US0004', 'US0004', 50000, 80000, 50000, 50000, 0, 30000, 'lunas', 'lunas', 0, 0, 'belum di ambil', 'belum di ambil', '2022-12-21'),
(22, 'TR0006', 'US0004', 'US0004', 80000, 100000, 50000, 50000, 30000, 50000, 'lunas', 'lunas', 0, 0, 'belum di ambil', 'belum di ambil', '2022-12-21'),
(23, 'TR0007', 'US0004', 'US0004', 20000, 40000, 20000, 20000, 0, 20000, 'lunas', 'lunas', 0, 0, 'belum di ambil', 'belum di ambil', '2022-12-21'),
(24, 'TR0008', 'US0004', 'US0004', 75000, 150000, 100000, 100000, 0, 75000, 'lunas', 'lunas', 25000, 25000, 'belum di ambil', 'belum di ambil', '2022-12-21'),
(25, 'TR0009', 'US0004', 'US0004', 80000, 160000, 100000, 100000, 0, 80000, 'lunas', 'lunas', 20000, 20000, 'belum di ambil', 'belum di ambil', '2022-12-22'),
(26, 'TR0010', 'US0004', 'US0004', 56000, 112000, 60000, 60000, 0, 56000, 'lunas', 'lunas', 4000, 4000, 'belum di ambil', 'belum di ambil', '2022-12-22'),
(27, 'TR0013', 'US0004', 'US0004', 22500, 45000, 25000, 25000, 0, 22500, 'lunas', 'lunas', 2500, 2500, 'belum di ambil', 'belum di ambil', '2022-12-22'),
(28, 'TR0001', 'US0004', 'US0004', 189000, 189000, 100000, 94500, 94500, 0, 'lunas', 'lunas', 5500, 0, 'belum di ambil', 'sudah di ambil', '2022-12-22'),
(29, 'TR0014', 'US0004', 'US0004', 126500, 151500, 200000, 200000, 0, 25000, 'lunas', 'lunas', 73500, 73500, 'belum di ambil', 'belum di ambil', '2022-12-22'),
(30, 'TR0014', 'US0004', 'US0004', 151500, 183000, 200000, 200000, 25000, 56500, 'lunas', 'lunas', 73500, 73500, 'belum di ambil', 'belum di ambil', '2022-12-22'),
(31, 'TR0014', 'US0004', 'US0004', 183000, 253000, 200000, 200000, 56500, 126500, 'lunas', 'lunas', 73500, 73500, 'belum di ambil', 'belum di ambil', '2022-12-22'),
(32, 'TR0015', 'US0004', 'US0004', 150000, 300000, 1500000, 1500000, 0, 150000, 'lunas', 'lunas', 1350000, 1350000, 'belum di ambil', 'belum di ambil', '2022-12-22'),
(33, 'TR0016', 'US0004', 'US0004', 72500, 110000, 100000, 100000, 0, 37500, 'lunas', 'lunas', 27500, 27500, 'belum di ambil', 'belum di ambil', '2022-12-22'),
(34, 'TR0016', 'US0004', 'US0004', 110000, 145000, 100000, 100000, 37500, 72500, 'lunas', 'lunas', 27500, 27500, 'belum di ambil', 'belum di ambil', '2022-12-22'),
(35, 'TR0005', 'US0004', 'US0004', 75000, 75000, 50000, 50000, 37500, 0, 'lunas', 'lunas', 12500, 12500, 'belum di ambil', 'sudah di ambil', '2022-12-22'),
(36, 'TR0017', 'US0004', 'US0004', 222500, 222500, 225000, 0, 0, 0, 'lunas', 'lunas', 2500, 2500, 'belum di ambil', 'sudah di ambil', '2022-12-22'),
(37, 'TR0002', 'US0004', 'US0004', 100000, 100000, 50000, 50000, 50000, 0, 'lunas', 'lunas', 0, 0, 'belum di ambil', 'sudah di ambil', '2022-12-22'),
(38, 'TR0003', 'US0004', 'US0004', 40000, 40000, 50000, 20000, 20000, 20000, 'lunas', 'lunas', 30000, 30000, 'belum di ambil', 'sudah di ambil', '2022-12-22'),
(39, 'TR0004', 'US0004', 'US0004', 350000, 350000, 200000, 175000, 175000, 0, 'lunas', 'lunas', 25000, 0, 'belum di ambil', 'sudah di ambil', '2022-12-22'),
(40, 'TR0005', 'US0004', 'US0004', 75000, 75000, 50000, 0, 0, 0, 'lunas', 'lunas', 12500, 12500, 'sudah di ambil', 'sudah di ambil', '2022-12-22'),
(41, 'TR0006', 'US0004', 'US0004', 100000, 100000, 50000, 50000, 50000, 0, 'lunas', 'lunas', 0, 0, 'belum di ambil', 'sudah di ambil', '2022-12-22'),
(42, 'TR0007', 'US0004', 'US0004', 40000, 40000, 20000, 20000, 20000, 0, 'lunas', 'lunas', 0, 0, 'belum di ambil', 'sudah di ambil', '2022-12-22'),
(43, 'TR0003', 'US0004', 'US0004', 40000, 40000, 20000, 20000, 20000, 0, 'lunas', 'lunas', 30000, 0, 'sudah di ambil', 'sudah di ambil', '2022-12-22'),
(44, 'TR0013', 'US0004', 'US0004', 45000, 45000, 25000, 25000, 22500, 22500, 'lunas', 'lunas', 2500, 2500, 'belum di ambil', 'sudah di ambil', '2022-12-23'),
(45, 'TR0019', 'US0004', 'US0004', 75000, 75000, 70000, 5000, 5000, 0, 'kurang', 'lunas', 0, 0, 'belum di ambil', 'sudah di ambil', '2022-12-23'),
(46, 'TR0023', 'US0004', 'US0004', 117000, 117000, 110000, 7000, 7000, 0, 'kurang', 'lunas', 0, 0, 'belum di ambil', 'sudah di ambil', '2022-12-24'),
(47, 'TR0024', 'US0004', 'US0004', 162500, 162500, 170000, 0, 0, 0, 'lunas', 'lunas', 7500, 7500, 'belum di ambil', 'sudah di ambil', '2022-12-25'),
(48, 'TR0026', 'US0004', 'US0004', 50000, 50000, 50000, 0, 0, 0, 'lunas', 'lunas', 0, 0, 'belum di ambil', 'sudah di ambil', '2022-12-26'),
(49, 'TR0027', 'US0004', 'US0004', 85000, 85000, 50000, 35000, 35000, 0, 'kurang', 'lunas', 0, 0, 'belum di ambil', 'sudah di ambil', '2022-12-27'),
(50, 'TR0028', 'US0004', 'US0004', 240000, 240000, 200000, 50000, 40000, 0, 'kurang', 'lunas', 0, 10000, 'belum di ambil', 'sudah di ambil', '2022-12-27'),
(51, 'TR0001', 'US0004', 'US0004', 125000, 125000, 100000, 25000, 25000, 0, 'kurang', 'lunas', 0, 0, 'belum di ambil', 'sudah di ambil', '2022-12-31'),
(53, 'TR0003', 'US0004', 'US0004', 32500, 32500, 50000, 0, 0, 0, 'lunas', 'lunas', 17500, 0, 'belum di ambil', 'sudah di ambil', '2023-01-01'),
(54, 'TR0004', 'US0004', 'US0004', 105000, 105000, 100000, 5000, 5000, 0, 'kurang', 'lunas', 0, 0, 'belum di ambil', 'sudah di ambil', '2023-01-01'),
(55, 'TR0005', 'US0004', 'US0004', 70000, 70000, 70000, 0, 0, 0, 'lunas', 'lunas', 0, 0, 'belum di ambil', 'sudah di ambil', '2023-01-01'),
(56, 'TR0006', 'US0004', 'US0004', 47500, 47500, 40000, 7500, 7500, 0, 'kurang', 'lunas', 0, 0, 'belum di ambil', 'belum di ambil', '2023-01-01'),
(57, 'TR0007', 'US0004', 'US0004', 22500, 22500, 20000, 3000, 2500, 0, 'kurang', 'lunas', 0, 500, 'belum di ambil', 'belum di ambil', '2023-01-01'),
(58, 'TR0007', 'US0004', 'US0004', 22500, 22500, 3000, 0, 0, 0, 'lunas', 'lunas', 500, 0, 'belum di ambil', 'sudah di ambil', '2023-01-01'),
(59, 'TR0006', 'US0004', 'US0004', 47500, 47500, 7500, 0, 0, 0, 'lunas', 'lunas', 0, 0, 'belum di ambil', 'sudah di ambil', '2023-01-01'),
(60, 'TR0001', 'US0004', 'US0004', 125000, 125000, 25000, 25000, 0, 0, 'lunas', 'lunas', 0, 0, 'sudah di ambil', 'sudah di ambil', '2023-01-01'),
(61, 'TR0002', 'US0004', 'US0004', 110000, 110000, 0, 0, 0, 0, 'lunas', 'lunas', 0, 0, 'sudah di ambil', 'sudah di ambil', '2023-01-01'),
(62, 'TR0001', 'US0004', 'US0004', 125000, 125000, 25000, 25000, 0, 0, 'lunas', 'lunas', 0, 0, 'sudah di ambil', 'sudah di ambil', '2023-01-01'),
(63, 'TR0002', 'US0004', 'US0004', 110000, 110000, 0, 0, 0, 0, 'lunas', 'lunas', 0, 0, 'sudah di ambil', 'sudah di ambil', '2023-01-01'),
(64, 'TR0001', 'US0004', 'US0004', 30000, 30000, 25000, 25000, 5000, 5000, 'kurang', 'kurang', 0, 0, 'belum di ambil', 'belum di ambil', '2023-01-01'),
(65, 'TR0002', 'US0004', 'US0004', 60000, 60000, 50000, 50000, 10000, 10000, 'kurang', 'kurang', 0, 0, 'belum di ambil', 'belum di ambil', '2023-01-01'),
(66, 'TR0003', 'US0004', 'US0004', 24500, 24500, 20000, 20000, 4500, 4500, 'kurang', 'kurang', 0, 0, 'belum di ambil', 'belum di ambil', '2023-01-01'),
(67, 'TR0001', 'US0004', 'US0004', 30000, 30000, 25000, 25000, 5000, 5000, 'kurang', 'kurang', 0, 0, 'belum di ambil', 'belum di ambil', '2023-01-01'),
(68, 'TR0002', 'US0004', 'US0004', 60000, 60000, 50000, 50000, 10000, 10000, 'kurang', 'kurang', 0, 0, 'belum di ambil', 'belum di ambil', '2023-01-01'),
(69, 'TR0004', 'US0004', 'US0004', 25000, 25000, 20000, 20000, 5000, 5000, 'kurang', 'kurang', 0, 0, 'belum di ambil', 'belum di ambil', '2023-01-01'),
(70, 'TR0001', 'US0004', 'US0004', 30000, 30000, 25000, 10000, 5000, 0, 'kurang', 'lunas', 0, 5000, 'belum di ambil', 'sudah di ambil', '2023-01-01'),
(72, 'TR0003', 'US0004', 'US0004', 24500, 24500, 20000, 5000, 4500, 0, 'kurang', 'lunas', 0, 500, 'belum di ambil', 'sudah di ambil', '2023-01-01'),
(73, 'TR0004', 'US0004', 'US0004', 25000, 25000, 20000, 5000, 5000, 0, 'kurang', 'lunas', 0, 0, 'belum di ambil', 'sudah di ambil', '2023-01-01'),
(75, 'TR0005', 'US0004', 'US0004', 32500, 32500, 20000, 20000, 12500, 0, 'kurang', 'lunas', 0, 7500, 'belum di ambil', 'sudah di ambil', '2023-01-01'),
(77, 'TR0001', 'US0004', 'US0004', 31500, 31500, 20000, 11500, 11500, 0, 'kurang', 'lunas', 0, 0, 'belum di ambil', 'sudah di ambil', '2023-01-04'),
(78, 'TR0002', 'US0004', 'US0004', 900000, 900000, 1000000, 1000000, 0, 0, 'lunas', 'lunas', 100000, 100000, 'belum di ambil', 'belum di ambil', '2023-01-04'),
(79, 'TR0001', 'US0004', 'US0004', 92000, 92000, 50000, 42000, 42000, 0, 'kurang', 'lunas', 0, 0, 'belum di ambil', 'sudah di ambil', '2023-01-05'),
(80, 'TR0002', 'US0004', 'US0004', 250000, 250000, 100000, 150000, 150000, 0, 'kurang', 'lunas', 0, 0, 'belum di ambil', 'sudah di ambil', '2023-01-05'),
(81, 'TR0003', 'US0004', 'US0004', 1600000, 1600000, 1000000, 600000, 600000, 0, 'kurang', 'lunas', 0, 0, 'belum di ambil', 'sudah di ambil', '2023-01-05'),
(82, 'TR0003', 'US0004', 'US0004', 1600000, 1600000, 600000, 600000, 0, 0, 'lunas', 'lunas', 0, 0, 'sudah di ambil', 'sudah di ambil', '2023-01-05'),
(83, 'TR0003', 'US0004', 'US0004', 1600000, 1600000, 600000, 600000, 0, 0, 'lunas', 'lunas', 0, 0, 'sudah di ambil', 'sudah di ambil', '2023-01-05'),
(84, 'TR0006', 'US0004', 'US0004', 175000, 175000, 170000, 5000, 5000, 0, 'kurang', 'lunas', 0, 0, 'belum di ambil', 'sudah di ambil', '2023-01-08'),
(85, 'TR0007', 'US0004', 'US0004', 50000, 50000, 50000, 50000, 0, 0, 'lunas', 'lunas', 0, 0, 'belum di ambil', 'sudah di ambil', '2023-01-08'),
(87, 'TR0005', 'US0004', 'US0004', 50000, 50000, 50000, 50000, 0, 0, 'lunas', 'lunas', 0, 0, 'belum di ambil', 'sudah di ambil', '2023-01-09'),
(88, 'TR0009', 'US0004', 'US0004', 75000, 75000, 20000, 20000, 55000, 55000, 'kurang', 'kurang', 0, 0, 'belum di ambil', 'sudah di ambil', '2023-01-10'),
(89, 'TR0004', 'US0004', 'US0004', 50000, 50000, 50000, 50000, 0, 0, 'lunas', 'lunas', 0, 0, 'belum di ambil', 'sudah di ambil', '2023-01-10'),
(90, 'TR0014', 'US0004', 'US0004', 40000, 40000, 30000, 20000, 10000, 0, 'kurang', 'lunas', 0, 10000, 'belum di ambil', 'sudah di ambil', '2023-01-11'),
(91, 'TR0016', 'US0004', 'US0004', 50000, 50000, 40000, 40000, 10000, 0, 'kurang', 'lunas', 0, 30000, 'belum di ambil', 'sudah di ambil', '2023-02-03'),
(92, 'TR0017', 'US0004', 'US0004', 107500, 107500, 50000, 60000, 57500, 0, 'kurang', 'lunas', 0, 2500, 'belum di ambil', 'sudah di ambil', '2023-02-14');

-- --------------------------------------------------------

--
-- Table structure for table `paket`
--

CREATE TABLE `paket` (
  `kd_paket` char(6) NOT NULL,
  `nama_paket` varchar(50) NOT NULL,
  `jenis_paket` enum('satuan','kiloan') NOT NULL,
  `harga` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `paket`
--

INSERT INTO `paket` (`kd_paket`, `nama_paket`, `jenis_paket`, `harga`) VALUES
('PK0001', 'Cuci Kering', 'kiloan', 2500),
('PK0002', 'Cuci Kering Setrika', 'kiloan', 3500),
('PK0003', 'Cuci Basah', 'kiloan', 2500),
('PK0004', 'Cuci Kering Sprei', 'satuan', 10000),
('PK0006', 'Cuci Kering Selimut', 'satuan', 5000);

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `id_pelanggan` char(20) NOT NULL,
  `nama_pelanggan` varchar(50) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `no_telp` char(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`id_pelanggan`, `nama_pelanggan`, `alamat`, `no_telp`) VALUES
('PL0001', 'Ajiz Saputra', 'Cawang Benelan Kidul', '089675843712'),
('PL0002', 'Yoga andika', 'jember', '082343859483'),
('PL0003', 'Hazim Fikri', 'Karangbendo', '082312435712'),
('PL0004', 'Fakhrizal Dwi', 'Bulusan', '082132458278'),
('PL0005', 'Firmansyah', 'Probolinggo', '098213645827'),
('PL0006', 'Febry Setiawan', 'Cawang Benelan Kidul', '082134256723'),
('PL0007', 'Daffa Shabibi', 'Kebalen', '082319348578'),
('PL0008', 'Achmad Rizal', 'Sobo', '082312453678'),
('PL0009', 'Ivang Sandwiki', 'Cawang Benelan Kidul', '082134256712'),
('PL0010', 'Davil Mangir', 'Mangir', '081232486957'),
('PL0011', 'Sellio Arkhipo', 'Stadion', '089877876675'),
('PL0012', 'Fahmi Bludz', 'Cawang Benelan Kidul', '081232343948'),
('PL0013', 'Kristu Indrawi', 'Cawang Benelan Kidul', '081231243561'),
('PL0014', 'Icha Riska Nadilla', 'Labanasem', '081232459875'),
('PL0015', 'Nurul Aulia Salsabilla', 'Pabrikan', '089867548372'),
('PL0016', 'Sekar Kurnia Sari', 'Kertosari', '082193847291'),
('PL0017', 'Agung Dian', 'Grogol', '096958391823'),
('PL0018', 'Ahmad Rofiul', 'Licin', '096857481238'),
('PL0019', 'Aldo Prametya', 'Jami', '093821846787'),
('PL0020', 'Deriawan', 'Temenggungan', '084738172878'),
('PL0021', 'Charis Maulana', 'Bulusan', '096859481283'),
('PL0022', 'Muhammad Ridwan', 'Pakis', '086758371238'),
('PL0023', 'Rahman Hidayat', 'Pakis', '092819284748'),
('PL0024', 'Miko Pangestu', 'Bakungan', '096859481273'),
('PL0025', 'Zidni Mubarok', 'Jember', '085948391899'),
('PL0026', 'Lukas Dwi', 'Olehsari', '085948398899'),
('PL0027', 'Abdurrahman', 'Benelan Lor', '082312345610'),
('PL0028', 'Puja Agustin', 'Cawang', '089128391837'),
('PL0030', 'Bintang Lutfi', 'Benelan Lor', '081928367456'),
('PL0031', 'Salsabilla Armiliya', 'Gitik', '081293874673'),
('PL0032', 'Jesa Virgianta', 'Banyuwangi', '081239137878'),
('PL0033', 'Muhammad Syahroni', 'Umbul', '081948374631'),
('PL0034', 'ananta ', 'semanggi', '08123456789'),
('PL0035', 'zainal', 'silo', '081230857448'),
('PL0036', 'anggi', 'jember', '089765432112'),
('PL0037', 'Audrey', 'Jember', '087776564437');

-- --------------------------------------------------------

--
-- Table structure for table `pembukuan`
--

CREATE TABLE `pembukuan` (
  `kode_pembukuan` char(20) NOT NULL,
  `tgl_pembukuan` date NOT NULL,
  `tgl_awal_pemasukan` date NOT NULL,
  `tgl_akhir_pemasukan` date NOT NULL,
  `total_pemasukan` int(5) NOT NULL,
  `kd_pengeluaran` char(6) NOT NULL,
  `laba` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pembukuan`
--

INSERT INTO `pembukuan` (`kode_pembukuan`, `tgl_pembukuan`, `tgl_awal_pemasukan`, `tgl_akhir_pemasukan`, `total_pemasukan`, `kd_pengeluaran`, `laba`) VALUES
('PB0002', '2023-01-02', '2022-12-26', '2023-01-02', 109500, 'PN0003', 37500);

-- --------------------------------------------------------

--
-- Table structure for table `pengeluaran`
--

CREATE TABLE `pengeluaran` (
  `kd_pengeluaran` char(15) NOT NULL,
  `tanggal_pengeluaran` date NOT NULL,
  `biaya_listrik` int(5) NOT NULL,
  `biaya_air` int(5) NOT NULL,
  `biaya_pewangi` int(5) NOT NULL,
  `total` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pengeluaran`
--

INSERT INTO `pengeluaran` (`kd_pengeluaran`, `tanggal_pengeluaran`, `biaya_listrik`, `biaya_air`, `biaya_pewangi`, `total`) VALUES
('PN0003', '2023-02-02', 56000, 12000, 10000, 78000),
('PN0004', '2023-01-07', 100000, 50000, 20000, 170000),
('PN0005', '2023-01-07', 0, 40000, 25000, 65000),
('PN0006', '2023-01-07', 0, 42000, 22000, 64000),
('PN0007', '2023-01-07', 200000, 50000, 33000, 283000),
('PN0008', '2023-01-09', 70000, 0, 0, 70000),
('PN0009', '2023-01-11', 50000, 15000, 2000, 67000),
('PN0010', '2023-02-14', 50000, 0, 0, 50000),
('PN0011', '2023-02-16', 20000, 0, 0, 20000);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_detail_order`
--

CREATE TABLE `tbl_detail_order` (
  `kode_order` char(20) NOT NULL,
  `kd_paket` char(6) NOT NULL,
  `qty` int(2) NOT NULL,
  `subtotal` int(5) NOT NULL,
  `keterangan` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_detail_order`
--

INSERT INTO `tbl_detail_order` (`kode_order`, `kd_paket`, `qty`, `subtotal`, `keterangan`) VALUES
('TR0001', 'PK0001', 20, 50000, 'Baju Hello Kitty, Celana Panjang'),
('TR0001', 'PK0002', 12, 42000, 'Kemeja Seragam'),
('TR0002', 'PK0001', 100, 250000, 'Baju'),
('TR0003', 'PK0006', 200, 1600000, 'Sprei'),
('TR0004', 'PK0001', 20, 50000, 'Baju'),
('TR0005', 'PK0001', 20, 50000, 'Baju'),
('TR0006', 'PK0003', 70, 175000, 'Celana'),
('TR0007', 'PK0001', 20, 50000, 'Baju, Celana'),
('TR0008', 'PK0001', 12, 30000, 'Baju'),
('TR0009', 'PK0001', 30, 75000, 'Baju'),
('TR0010', 'PK0001', 12, 30000, 'Baju'),
('TR0011', 'PK0001', 2, 5000, 'baju celana sarung'),
('TR0012', 'PK0001', 2, 5000, 'kaos,sarungdll'),
('TR0012', 'PK0004', 1, 10000, 'bedcover'),
('TR0013', 'PK0002', 3, 10500, 'Baju'),
('TR0013', 'PK0004', 1, 10000, 'selimut'),
('TR0014', 'PK0001', 12, 30000, 'Baju'),
('TR0014', 'PK0003', 4, 10000, 'Celana'),
('TR0016', 'PK0001', 20, 50000, 'Celana'),
('TR0017', 'PK0003', 5, 12500, 'Celanna'),
('TR0017', 'PK0004', 6, 60000, 'Baju'),
('TR0017', 'PK0006', 7, 35000, 'dsgfdb'),
('TR0018', 'PK0001', 2, 5000, 'baju 5'),
('TR0018', 'PK0006', 1, 5000, 'sprei');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_order`
--

CREATE TABLE `tbl_order` (
  `kode_order` char(20) NOT NULL,
  `id_pelanggan` char(20) NOT NULL,
  `id_user` char(20) NOT NULL,
  `tgl_pesan` date DEFAULT NULL,
  `tgl_selesai` date DEFAULT NULL,
  `grand_total` int(5) NOT NULL,
  `bayar` int(5) NOT NULL,
  `kurang_bayar` int(5) NOT NULL,
  `status_bayar` enum('lunas','belum bayar','kurang') DEFAULT NULL,
  `kembalian` int(5) NOT NULL,
  `status_ambil` enum('sudah di ambil','belum di ambil') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_order`
--

INSERT INTO `tbl_order` (`kode_order`, `id_pelanggan`, `id_user`, `tgl_pesan`, `tgl_selesai`, `grand_total`, `bayar`, `kurang_bayar`, `status_bayar`, `kembalian`, `status_ambil`) VALUES
('TR0001', 'PL0001', 'US0004', '2023-01-05', '2023-01-08', 92000, 42000, 0, 'lunas', 0, 'sudah di ambil'),
('TR0002', 'PL0002', 'US0004', '2023-01-05', '2023-01-08', 250000, 150000, 0, 'lunas', 0, 'sudah di ambil'),
('TR0003', 'PL0002', 'US0004', '2023-02-05', '2023-02-08', 1600000, 600000, 0, 'lunas', 0, 'sudah di ambil'),
('TR0004', 'PL0004', 'US0004', '2023-01-05', '2023-01-08', 50000, 50000, 0, 'lunas', 0, 'sudah di ambil'),
('TR0005', 'PL0011', 'US0004', '2023-01-05', '2023-01-08', 50000, 50000, 0, 'lunas', 0, 'sudah di ambil'),
('TR0006', 'PL0012', 'US0004', '2023-01-05', '2023-01-08', 175000, 5000, 0, 'lunas', 0, 'sudah di ambil'),
('TR0007', 'PL0017', 'US0004', '2023-01-08', '2023-01-11', 50000, 50000, 0, 'lunas', 0, 'sudah di ambil'),
('TR0008', 'PL0015', 'US0004', '2023-01-08', '2023-01-11', 30000, 10000, 0, 'lunas', 0, 'sudah di ambil'),
('TR0009', 'PL0012', 'US0004', '2023-01-10', '2023-01-13', 75000, 20000, 55000, 'kurang', 0, 'sudah di ambil'),
('TR0010', 'PL0011', 'US0004', '2023-01-10', '2023-01-13', 30000, 50000, 0, 'lunas', 20000, 'belum di ambil'),
('TR0011', 'PL0002', 'US0004', '2023-01-11', '2023-01-14', 5000, 10000, 0, 'lunas', 5000, 'belum di ambil'),
('TR0012', 'PL0035', 'US0004', '2023-01-11', '2023-01-14', 15000, 20000, 0, 'lunas', 5000, 'belum di ambil'),
('TR0013', 'PL0037', 'US0007', '2023-01-11', '2023-01-14', 20500, 21000, 0, 'lunas', 500, 'belum di ambil'),
('TR0014', 'PL0033', 'US0004', '2023-01-11', '2023-01-14', 40000, 20000, 0, 'lunas', 10000, 'sudah di ambil'),
('TR0015', 'PL0021', 'US0004', '2023-01-11', '2023-01-14', 0, 10000, 0, 'lunas', 10000, 'belum di ambil'),
('TR0016', 'PL0008', 'US0004', '2023-02-03', '2023-02-06', 50000, 40000, 0, 'lunas', 30000, 'sudah di ambil'),
('TR0017', 'PL0035', 'US0004', '2023-02-14', '2023-02-17', 107500, 60000, 0, 'lunas', 2500, 'sudah di ambil'),
('TR0018', 'PL0023', 'US0004', '2023-02-16', '2023-02-19', 10000, 4000, 6000, 'kurang', 0, 'belum di ambil');

--
-- Triggers `tbl_order`
--
DELIMITER $$
CREATE TRIGGER `history_order` AFTER UPDATE ON `tbl_order` FOR EACH ROW BEGIN INSERT INTO history_transaksi SET kode_order=old.kode_order,id_user_awl=old.id_user,id_user_br=new.id_user,grand_total_awl=old.grand_total,
grand_total_br=new.grand_total,bayar_awl=old.bayar,bayar_br=new.bayar,
kurang_byr_awl=old.kurang_bayar,kurang_byr_bru=new.kurang_bayar,status_byr_awl=old.status_bayar,status_byr_br=new.status_bayar,kembalian_awl=old.kembalian,kembalian_br=new.kembalian,status_ambil_awl=old.status_ambil,status_amblbr=new.status_ambil,
waktu=NOW(); END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id_user` char(20) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `no_hp` char(12) NOT NULL,
  `akses` enum('admin','kasir') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `nama`, `username`, `password`, `alamat`, `no_hp`, `akses`) VALUES
('US0001', 'Heni Laundry', 'Heni Laundry', 'heni2022', 'Jember', '082343454516', 'admin'),
('US0002', 'Agung Kurniawan', 'Agung Kurniawan', '12345678', 'Banyuwangi', '0823248956', 'admin'),
('US0003', 'Muhammad Syahroni', 'Syahroni', 'roni2022', 'Jember', '0854563481', 'admin'),
('US0004', 'Laila Wulandari', 'Laila Wulandari', '12345678', 'Jember', '082345791012', 'kasir'),
('US0005', 'Kamado Tanjiro', 'Tanjiro', 'tanjiro123', 'Banyuwangi', '098998718231', 'kasir'),
('US0006', 'Zenitsu Agatsuma', 'Zenitsu', 'zenitsu123', 'Banyuwangi', '09898989898', 'kasir'),
('US0007', 'Dwi Ratna', 'dwi ratna', 'iyootahh', 'jember', '08730440944', 'kasir'),
('US0008', 'Zaiinal', 'zain', '12345678', 'jogja', '098548686289', 'kasir');

--
-- Triggers `user`
--
DELIMITER $$
CREATE TRIGGER `hapus_kasir` BEFORE DELETE ON `user` FOR EACH ROW BEGIN
INSERT INTO history_hapus_user SET id_user=old.id_user,nama =old.nama,username = old.username,password = old.password,alamat=old.alamat,no_hp=old.no_hp,akses=old.akses,waktu= NOW();
END
$$
DELIMITER ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `history_hapus_user`
--
ALTER TABLE `history_hapus_user`
  ADD PRIMARY KEY (`id_log`);

--
-- Indexes for table `history_transaksi`
--
ALTER TABLE `history_transaksi`
  ADD PRIMARY KEY (`id_hist`);

--
-- Indexes for table `paket`
--
ALTER TABLE `paket`
  ADD PRIMARY KEY (`kd_paket`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`id_pelanggan`);

--
-- Indexes for table `pembukuan`
--
ALTER TABLE `pembukuan`
  ADD PRIMARY KEY (`kode_pembukuan`),
  ADD KEY `kd_pengeluaran` (`kd_pengeluaran`);

--
-- Indexes for table `pengeluaran`
--
ALTER TABLE `pengeluaran`
  ADD PRIMARY KEY (`kd_pengeluaran`);

--
-- Indexes for table `tbl_detail_order`
--
ALTER TABLE `tbl_detail_order`
  ADD KEY `kode_order` (`kode_order`),
  ADD KEY `kd_paket` (`kd_paket`);

--
-- Indexes for table `tbl_order`
--
ALTER TABLE `tbl_order`
  ADD PRIMARY KEY (`kode_order`),
  ADD KEY `id_user` (`id_user`),
  ADD KEY `id_pelanggan` (`id_pelanggan`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `history_hapus_user`
--
ALTER TABLE `history_hapus_user`
  MODIFY `id_log` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT for table `history_transaksi`
--
ALTER TABLE `history_transaksi`
  MODIFY `id_hist` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=93;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `pembukuan`
--
ALTER TABLE `pembukuan`
  ADD CONSTRAINT `pembukuan_ibfk_1` FOREIGN KEY (`kd_pengeluaran`) REFERENCES `pengeluaran` (`kd_pengeluaran`);

--
-- Constraints for table `tbl_detail_order`
--
ALTER TABLE `tbl_detail_order`
  ADD CONSTRAINT `tbl_detail_order_ibfk_1` FOREIGN KEY (`kode_order`) REFERENCES `tbl_order` (`kode_order`),
  ADD CONSTRAINT `tbl_detail_order_ibfk_2` FOREIGN KEY (`kd_paket`) REFERENCES `paket` (`kd_paket`);

--
-- Constraints for table `tbl_order`
--
ALTER TABLE `tbl_order`
  ADD CONSTRAINT `tbl_order_ibfk_2` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`),
  ADD CONSTRAINT `tbl_order_ibfk_3` FOREIGN KEY (`id_pelanggan`) REFERENCES `pelanggan` (`id_pelanggan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
