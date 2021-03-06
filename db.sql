USE [QuanLiSieuThiMini]
GO
/****** Object:  Table [dbo].[BangGia]    Script Date: 24/12/2020 11:20:15 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[BangGia](
	[IDBangGia] [varchar](10) NOT NULL,
	[DonGia] [float] NULL,
	[Giam] [float] NULL,
	[GiaVonSP] [float] NULL,
 CONSTRAINT [PK_BangGia] PRIMARY KEY CLUSTERED 
(
	[IDBangGia] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[BoPhan]    Script Date: 24/12/2020 11:20:15 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[BoPhan](
	[IDBoPhan] [varchar](10) NOT NULL,
	[TenBoPhan] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[IDBoPhan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CaLam]    Script Date: 24/12/2020 11:20:15 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CaLam](
	[IDCaLam] [varchar](10) NOT NULL,
	[BatDauTu] [time](7) NULL,
	[KetThucLuc] [time](7) NULL,
PRIMARY KEY CLUSTERED 
(
	[IDCaLam] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DiaChi]    Script Date: 24/12/2020 11:20:15 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DiaChi](
	[STT] [int] IDENTITY(1,1) NOT NULL,
	[TenTinh] [nvarchar](100) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DongHoaDon]    Script Date: 24/12/2020 11:20:15 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DongHoaDon](
	[IDDongHoaDon] [varchar](10) NOT NULL,
	[IDHoaDon] [varchar](10) NULL,
	[IDSanPham] [varchar](10) NULL,
	[IDDonViTinh] [nvarchar](20) NULL,
	[SoLuong] [int] NULL,
	[Giam] [float] NULL,
	[TraLai] [float] NULL,
	[TinhTrang] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[IDDongHoaDon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DonViTinh]    Script Date: 24/12/2020 11:20:15 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DonViTinh](
	[IDDonViTinh] [nvarchar](20) NOT NULL,
	[MacDinh] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[IDDonViTinh] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 24/12/2020 11:20:15 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[IDHoaDon] [varchar](10) NOT NULL,
	[NgayTao] [datetime] NULL,
	[IDKhachHang] [varchar](10) NULL,
	[IDNhanVien] [varchar](10) NULL,
	[TongTien] [float] NULL,
	[TrangThai] [int] NULL,
	[IDThongTin] [varchar](10) NULL,
	[LoaiHoaDon] [int] NULL,
	[ThueVAT] [float] NULL,
	[NoiDung] [nvarchar](max) NULL,
	[IDPhieu] [varchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[IDHoaDon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 24/12/2020 11:20:15 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[IDKhachHang] [varchar](10) NOT NULL,
	[IDNhomKH] [varchar](10) NULL,
	[HoTen] [nvarchar](150) NULL,
	[GioiTinh] [nvarchar](5) NULL,
	[SoDienThoai] [char](10) NULL,
	[DiaChi] [nvarchar](max) NULL,
	[MaSoThue] [varchar](10) NULL,
	[TraDK] [float] NULL,
	[ThuDK] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[IDKhachHang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Kho]    Script Date: 24/12/2020 11:20:15 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Kho](
	[SKU] [varchar](25) NOT NULL,
	[IDSanPham] [varchar](10) NULL,
	[NgayNhap] [datetime] NULL,
	[NgayXuat] [datetime] NULL,
	[SoLuongNhap] [int] NULL,
	[SoLuongXuat] [int] NULL,
	[TinhTrang] [int] NULL,
	[IDKVKho] [varchar](10) NULL,
 CONSTRAINT [PK_Kho] PRIMARY KEY CLUSTERED 
(
	[SKU] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhuVuc]    Script Date: 24/12/2020 11:20:15 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhuVuc](
	[IDKhuVuc] [varchar](10) NOT NULL,
	[TenKhuVuc] [nvarchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[IDKhuVuc] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhuVucKho]    Script Date: 24/12/2020 11:20:15 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhuVucKho](
	[IDKVKho] [varchar](10) NOT NULL,
	[TenKho] [nvarchar](130) NULL,
PRIMARY KEY CLUSTERED 
(
	[IDKVKho] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 24/12/2020 11:20:15 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[IDNhanVien] [varchar](10) NOT NULL,
	[IDBoPhan] [varchar](10) NULL,
	[HoTen] [nvarchar](150) NULL,
	[GioiTinh] [nvarchar](5) NULL,
	[SoDienThoai] [char](10) NULL,
	[DiaChi] [nvarchar](max) NULL,
	[TinhTrang] [int] NULL,
	[IDCaLam] [varchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[IDNhanVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhomKhachHang]    Script Date: 24/12/2020 11:20:15 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhomKhachHang](
	[IDNhomKH] [varchar](10) NOT NULL,
	[TenNhom] [nvarchar](100) NULL,
	[LoaiNhom] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[IDNhomKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhomSanPham]    Script Date: 24/12/2020 11:20:15 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhomSanPham](
	[IDNhomSanPham] [varchar](10) NOT NULL,
	[TenNhom] [nvarchar](100) NULL,
	[LoaiNhom] [int] NULL,
	[IDKhuVuc] [varchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[IDNhomSanPham] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhieuKho]    Script Date: 24/12/2020 11:20:15 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuKho](
	[IDPhieu] [varchar](10) NOT NULL,
	[IDHoaDon] [varchar](10) NULL,
	[NgayNhap] [datetime] NULL,
	[NgayXuat] [datetime] NULL,
	[IDKVKho] [varchar](10) NULL,
 CONSTRAINT [PK_PhieuKho] PRIMARY KEY CLUSTERED 
(
	[IDPhieu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhuongThucThanhToan]    Script Date: 24/12/2020 11:20:15 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhuongThucThanhToan](
	[IDPTThanhToan] [varchar](10) NOT NULL,
	[TenPTThanhToan] [nvarchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[IDPTThanhToan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 24/12/2020 11:20:15 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPham](
	[IDSanPham] [varchar](10) NOT NULL,
	[IDNhomSanPham] [varchar](10) NULL,
	[TenSanPham] [nvarchar](100) NULL,
	[IDDonViTinh] [nvarchar](20) NULL,
	[NgaySanXuat] [date] NULL,
	[HanSuDung] [date] NULL,
	[UrlImage] [varchar](20) NULL,
	[IDBangGia] [varchar](10) NULL,
	[IDKhachHang] [varchar](10) NULL,
	[TinhTrang] [int] NULL,
	[SKU] [varchar](25) NULL,
PRIMARY KEY CLUSTERED 
(
	[IDSanPham] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 24/12/2020 11:20:15 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[TaiKhoan] [varchar](20) NULL,
	[MatKhau] [varchar](20) NULL,
	[IDBoPhan] [varchar](10) NULL,
	[IDNhanVien] [varchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ThongTinThanhToan]    Script Date: 24/12/2020 11:20:15 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ThongTinThanhToan](
	[IDThongTin] [varchar](10) NOT NULL,
	[IDPTThanhToan] [varchar](10) NULL,
	[LoaiThe] [varchar](40) NULL,
	[SoTaiKhoan] [varchar](20) NULL,
	[TenTaiKhoan] [varchar](100) NULL,
	[ChiNhanh] [nvarchar](100) NULL,
	[TenNganHang] [nvarchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[IDThongTin] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TichDiem]    Script Date: 24/12/2020 11:20:15 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TichDiem](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[IDKhachHang] [varchar](10) NULL,
	[SoDiem] [int] NULL,
	[IsVip] [int] NULL,
	[QuyDoiDiem] [int] NULL,
	[TienQuyDoi] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG1000001', 47900, 0, 40000)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG1000002', 41000, 0, 36000)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG1000003', 12000, 0, 7000)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG1000004', 19900, 0, 15400)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG1000005', 19900, 0, 15400)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG1000006', 120000, 0, 110000)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG1000007', 47500, 0, 41000)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG1000008', 184000, 0, 170000)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG1000009', 205000, 0, 187000)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG1000010', 31000, 0, 27000)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG1000011', 4300, 0, 2000)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG1000012', 8400, 0, 6500)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG1000013', 17500, 0, 14900)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG1000014', 13900, 0, 11000)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG1000015', 17900, 0, 15000)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG1000016', 8500, 0, 7000)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG1000017', 9000, 0, 7300)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG1000018', 9500, 0, 7800)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG1000019', 21500, 0, 18100)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG1000020', 8000, 0, 6300)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG1000021', 21900, 0, 16300)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG1000022', 52000, 0, 46100)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG1000023', 10200, 0, 7100)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG1000024', 45900, 0, 39900)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG1000025', 20200, 0, 14200)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG1000026', 26500, 0, 20200)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG1000027', 13700, 0, 8900)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG1000028', 15700, 0, 11000)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG1000029', 24900, 0, 18600)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG1000030', 21600, 0, 14200)
GO
INSERT [dbo].[BoPhan] ([IDBoPhan], [TenBoPhan]) VALUES (N'BP100001', N'Quản Lí')
INSERT [dbo].[BoPhan] ([IDBoPhan], [TenBoPhan]) VALUES (N'BP100002', N'Thủ Kho')
INSERT [dbo].[BoPhan] ([IDBoPhan], [TenBoPhan]) VALUES (N'BP100003', N'Nhân Viên Bán Hàng')
GO
INSERT [dbo].[CaLam] ([IDCaLam], [BatDauTu], [KetThucLuc]) VALUES (N'CALAM1', CAST(N'06:00:00' AS Time), CAST(N'11:30:00' AS Time))
INSERT [dbo].[CaLam] ([IDCaLam], [BatDauTu], [KetThucLuc]) VALUES (N'CALAM2', CAST(N'11:30:00' AS Time), CAST(N'17:00:00' AS Time))
INSERT [dbo].[CaLam] ([IDCaLam], [BatDauTu], [KetThucLuc]) VALUES (N'CALAM3', CAST(N'17:00:00' AS Time), CAST(N'10:30:00' AS Time))
GO
SET IDENTITY_INSERT [dbo].[DiaChi] ON 

INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (1, N'An Giang')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (2, N'Bà Rịa-Vũng Tàu')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (3, N'Bạc Liêu')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (4, N'Bắc Kạn')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (5, N'Bắc Giang')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (6, N'Bắc Ninh')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (7, N'Bến Tre')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (8, N'Bình Dương')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (9, N'Bình Định')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (10, N'Bình Phước')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (11, N'Bình Thuận')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (12, N'Cà Mau')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (13, N'Cao Bằng')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (14, N'Cần Thơ')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (15, N'Đà Nẵng')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (16, N'Đắk Lắk')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (17, N'Đắk Nông')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (18, N'Điện Biên')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (19, N'Đồng Nai')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (20, N'Đồng Tháp')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (21, N'Gia Lai')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (22, N'Hà Giang')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (23, N'Hà Nam')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (24, N'Hà Nội (TP)')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (25, N'Hà Tây')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (26, N'Hà Tĩnh')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (27, N'Hải Dương')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (28, N'Hải Phòng (TP)')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (29, N'Hòa Bình')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (30, N'Hồ Chí Minh (TP)')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (31, N'Hậu Giang')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (32, N'Hưng Yên')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (33, N'Khánh Hòa')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (34, N'Kiên Giang')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (35, N'Kon Tum')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (36, N'Lai Châu')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (37, N'Lào Cai')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (38, N'Lạng Sơn')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (39, N'Lâm Đồng')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (40, N'Long An')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (41, N'Nam Định')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (42, N'Nghệ An')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (43, N'Ninh Bình')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (44, N'Ninh Thuận')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (45, N'Phú Thọ')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (46, N'Phú Yên')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (47, N'Quảng Bình')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (48, N'Quảng Nam')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (49, N'Quảng Ngãi')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (50, N'Quảng Ninh')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (51, N'Quảng Trị')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (52, N'Sóc Trăng')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (53, N'Sơn La')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (54, N'Tây Ninh')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (55, N'Thái Bình')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (56, N'Thái Nguyên')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (57, N'Thanh Hóa')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (58, N'Thừa Thiên – Huế')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (59, N'Tiền Giang')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (60, N'Trà Vinh')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (61, N'Tuyên Quang')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (62, N'Vĩnh Long')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (63, N'Vĩnh Phúc')
INSERT [dbo].[DiaChi] ([STT], [TenTinh]) VALUES (64, N'Yên Bái')
SET IDENTITY_INSERT [dbo].[DiaChi] OFF
GO
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100001', N'HD1000003', N'SP10000001', N'Chai', 1000, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100002', N'HD1000003', N'SP10000002', N'Hộp', 500, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100003', N'HD1000003', N'SP10000003', N'Hộp', 800, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100004', N'HD1000003', N'SP10000004', N'Bịch', 800, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100005', N'HD1000003', N'SP10000005', N'Bịch', 300, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100006', N'HD1000003', N'SP10000006', N'Chai', 400, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100007', N'HD1000003', N'SP10000007', N'Gói', 500, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100008', N'HD1000003', N'SP10000008', N'Chai', 1000, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100009', N'HD1000003', N'SP10000009', N'Chai', 1000, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100010', N'HD1000003', N'SP10000010', N'Hộp', 150, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100011', N'HD1000004', N'SP10000011', N'Chai', 3000, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100012', N'HD1000004', N'SP10000012', N'Lon', 2300, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100013', N'HD1000004', N'SP10000013', N'Chai', 2100, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100014', N'HD1000004', N'SP10000014', N'Lon', 4599, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100015', N'HD1000004', N'SP10000015', N'Lon', 5600, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100016', N'HD1000004', N'SP10000016', N'Chai', 100, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100017', N'HD1000004', N'SP10000017', N'Chai', 900, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100018', N'HD1000004', N'SP10000018', N'Lon', 7000, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100019', N'HD1000004', N'SP10000019', N'Chai', 2000, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100020', N'HD1000004', N'SP10000020', N'Lon', 1050, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100021', N'HD1000005', N'SP10000021', N'Gói', 100, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100022', N'HD1000005', N'SP10000022', N'Hộp', 100, 0, 0, 0)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100023', N'HD1000005', N'SP10000023', N'Gói', 100, 0, 0, 0)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100024', N'HD1000005', N'SP10000024', N'Hộp', 100, 0, 0, 0)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100025', N'HD1000005', N'SP10000025', N'Gói', 100, 0, 0, 0)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100026', N'HD1000005', N'SP10000026', N'Gói', 100, 0, 0, 0)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100027', N'HD1000005', N'SP10000027', N'Bịch', 100, 0, 0, 0)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100028', N'HD1000005', N'SP10000028', N'Gói', 100, 0, 0, 0)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100029', N'HD1000005', N'SP10000029', N'Gói', 100, 0, 0, 0)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100030', N'HD1000005', N'SP10000030', N'Gói', 100, 0, 0, 0)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100031', N'HD1000006', N'SP10000001', N'Chai', 1, NULL, NULL, NULL)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100032', N'HD1000006', N'SP10000002', N'Hộp', 1, NULL, NULL, NULL)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100033', N'HD1000007', N'SP10000001', N'Chai', 1, NULL, NULL, NULL)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100034', N'HD1000007', N'SP10000002', N'Hộp', 1, NULL, NULL, NULL)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100035', N'HD1000007', N'SP10000003', N'Hộp', 1, NULL, NULL, NULL)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100036', N'HD1000007', N'SP10000004', N'Bịch', 1, NULL, NULL, NULL)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100037', N'HD1000008', N'SP10000001', N'Chai', 11, NULL, NULL, NULL)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100038', N'HD1000008', N'SP10000002', N'Hộp', 1, NULL, NULL, NULL)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100039', N'HD1000008', N'SP10000003', N'Hộp', 1, NULL, NULL, NULL)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100040', N'HD1000008', N'SP10000004', N'Bịch', 1, NULL, NULL, NULL)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100041', N'HD1000009', N'SP10000001', N'Chai', 1, NULL, NULL, NULL)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100042', N'HD1000009', N'SP10000002', N'Hộp', 1, NULL, NULL, NULL)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100043', N'HD1000009', N'SP10000003', N'Hộp', 1, NULL, NULL, NULL)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100044', N'HD1000010', N'SP10000011', N'Chai', 1, NULL, NULL, NULL)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD100045', N'HD1000010', N'SP10000012', N'Lon', 51, NULL, NULL, NULL)
GO
INSERT [dbo].[DonViTinh] ([IDDonViTinh], [MacDinh]) VALUES (N'Bát', 0)
INSERT [dbo].[DonViTinh] ([IDDonViTinh], [MacDinh]) VALUES (N'Bịch', 0)
INSERT [dbo].[DonViTinh] ([IDDonViTinh], [MacDinh]) VALUES (N'Bình', 0)
INSERT [dbo].[DonViTinh] ([IDDonViTinh], [MacDinh]) VALUES (N'Chai', 0)
INSERT [dbo].[DonViTinh] ([IDDonViTinh], [MacDinh]) VALUES (N'Cốc', 0)
INSERT [dbo].[DonViTinh] ([IDDonViTinh], [MacDinh]) VALUES (N'Đôi', 0)
INSERT [dbo].[DonViTinh] ([IDDonViTinh], [MacDinh]) VALUES (N'g', 0)
INSERT [dbo].[DonViTinh] ([IDDonViTinh], [MacDinh]) VALUES (N'Gói', 0)
INSERT [dbo].[DonViTinh] ([IDDonViTinh], [MacDinh]) VALUES (N'Hộp', 0)
INSERT [dbo].[DonViTinh] ([IDDonViTinh], [MacDinh]) VALUES (N'Hủ', 0)
INSERT [dbo].[DonViTinh] ([IDDonViTinh], [MacDinh]) VALUES (N'Kg', 0)
INSERT [dbo].[DonViTinh] ([IDDonViTinh], [MacDinh]) VALUES (N'Lốc', 0)
INSERT [dbo].[DonViTinh] ([IDDonViTinh], [MacDinh]) VALUES (N'Lon', 0)
INSERT [dbo].[DonViTinh] ([IDDonViTinh], [MacDinh]) VALUES (N'Ly', 0)
INSERT [dbo].[DonViTinh] ([IDDonViTinh], [MacDinh]) VALUES (N'Ổ', 0)
INSERT [dbo].[DonViTinh] ([IDDonViTinh], [MacDinh]) VALUES (N'Thùng', 0)
GO
INSERT [dbo].[HoaDon] ([IDHoaDon], [NgayTao], [IDKhachHang], [IDNhanVien], [TongTien], [TrangThai], [IDThongTin], [LoaiHoaDon], [ThueVAT], [NoiDung], [IDPhieu]) VALUES (N'HD1000003', CAST(N'2020-12-12T07:21:41.000' AS DateTime), N'KH1000004', N'NV100001', 506089984, 0, NULL, 1, 0, N'Chuyển Xog Báo Nha', N'PK100001')
INSERT [dbo].[HoaDon] ([IDHoaDon], [NgayTao], [IDKhachHang], [IDNhanVien], [TongTien], [TrangThai], [IDThongTin], [LoaiHoaDon], [ThueVAT], [NoiDung], [IDPhieu]) VALUES (N'HD1000004', CAST(N'2020-12-12T07:25:58.000' AS DateTime), N'KH1000004', N'NV100001', 291514016, 1, NULL, 1, 0, N'Chuyển Xog Báo Nha', N'PK100002')
INSERT [dbo].[HoaDon] ([IDHoaDon], [NgayTao], [IDKhachHang], [IDNhanVien], [TongTien], [TrangThai], [IDThongTin], [LoaiHoaDon], [ThueVAT], [NoiDung], [IDPhieu]) VALUES (N'HD1000005', CAST(N'2020-12-12T07:35:47.000' AS DateTime), N'KH1000002', N'NV100001', 19650000, 1, NULL, 1, 0, N'Đợt 3', N'PK100003')
INSERT [dbo].[HoaDon] ([IDHoaDon], [NgayTao], [IDKhachHang], [IDNhanVien], [TongTien], [TrangThai], [IDThongTin], [LoaiHoaDon], [ThueVAT], [NoiDung], [IDPhieu]) VALUES (N'HD1000006', CAST(N'2020-12-13T06:52:34.000' AS DateTime), N'KH1000009', N'NV100003', 88900, 1, NULL, 0, 0, NULL, NULL)
INSERT [dbo].[HoaDon] ([IDHoaDon], [NgayTao], [IDKhachHang], [IDNhanVien], [TongTien], [TrangThai], [IDThongTin], [LoaiHoaDon], [ThueVAT], [NoiDung], [IDPhieu]) VALUES (N'HD1000007', CAST(N'2020-12-13T06:52:34.000' AS DateTime), N'KH1000010', N'NV100003', 120800, 1, NULL, 0, 0, NULL, NULL)
INSERT [dbo].[HoaDon] ([IDHoaDon], [NgayTao], [IDKhachHang], [IDNhanVien], [TongTien], [TrangThai], [IDThongTin], [LoaiHoaDon], [ThueVAT], [NoiDung], [IDPhieu]) VALUES (N'HD1000008', CAST(N'2020-12-13T06:52:34.000' AS DateTime), N'KH1000011', N'NV100003', 599800, 1, NULL, 0, 0, NULL, NULL)
INSERT [dbo].[HoaDon] ([IDHoaDon], [NgayTao], [IDKhachHang], [IDNhanVien], [TongTien], [TrangThai], [IDThongTin], [LoaiHoaDon], [ThueVAT], [NoiDung], [IDPhieu]) VALUES (N'HD1000009', CAST(N'2020-12-13T06:52:34.000' AS DateTime), N'KH1000012', N'NV100003', 100900, 1, NULL, 0, 0, NULL, NULL)
INSERT [dbo].[HoaDon] ([IDHoaDon], [NgayTao], [IDKhachHang], [IDNhanVien], [TongTien], [TrangThai], [IDThongTin], [LoaiHoaDon], [ThueVAT], [NoiDung], [IDPhieu]) VALUES (N'HD1000010', CAST(N'2020-12-13T06:52:34.000' AS DateTime), N'KH1000013', N'NV100003', 432700, 1, NULL, 0, 0, NULL, NULL)
GO
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [MaSoThue], [TraDK], [ThuDK]) VALUES (N'KH1000001', N'NKH10003', N'Công Ty Phân Phối Rau Sạch Hạnh Nhân', NULL, N'18008261  ', N'Đà Nẵng', N'98172652', 0, 0)
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [MaSoThue], [TraDK], [ThuDK]) VALUES (N'KH1000002', N'NKH10003', N'Công Ty Bánh Kẹo Nhật Cường', NULL, N'227815    ', N'Hải Phòng', N'122331', 0, 0)
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [MaSoThue], [TraDK], [ThuDK]) VALUES (N'KH1000003', N'NKH10003', N'Siêu Thị Big C', NULL, N'9836151   ', N'Đà Nẵng', N'221334', 0, 0)
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [MaSoThue], [TraDK], [ThuDK]) VALUES (N'KH1000004', N'NKH10003', N'Công Ty Mỹ Phẩm Hoa Sơn', NULL, N'19000011  ', N'Đồng Tháp', N'10289363', 0, 0)
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [MaSoThue], [TraDK], [ThuDK]) VALUES (N'KH1000005', N'NKH10003', N'Công Ty Nước Giải Khát Hòa Minh', NULL, N'19283634  ', N'Điện Biên', N'92782634', 0, 0)
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [MaSoThue], [TraDK], [ThuDK]) VALUES (N'KH1000006', N'NKH10003', N'Công Ty Phân Phối Rượu Bia Hải Yến', NULL, N'192824535 ', N'Quảng Nam', N'192187363', 0, 0)
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [MaSoThue], [TraDK], [ThuDK]) VALUES (N'KH1000007', N'NKH10003', N'Công Ty Sản Xuất Sữa Khánh Huy', NULL, N'92826345  ', N'Bình Dương', N'102892373', 0, 0)
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [MaSoThue], [TraDK], [ThuDK]) VALUES (N'KH1000008', N'NKH10002', N'Lê Văn Nam', N'Nữ', N'KH1000008 ', N'Đà Nẵng', N'0', 0, 0)
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [MaSoThue], [TraDK], [ThuDK]) VALUES (N'KH1000009', N'NKH10002', N'Hồ Duy Hiệp', N'Nam', N'0983635123', N'Bắc Giang', N'0', 0, 0)
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [MaSoThue], [TraDK], [ThuDK]) VALUES (N'KH1000010', N'NKH10002', N'Lê Đại Lộc', N'Nam', N'0987612314', N'Hà Nội (TP)', N'0', 0, 0)
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [MaSoThue], [TraDK], [ThuDK]) VALUES (N'KH1000011', N'NKH10002', N'Kim Xuyến Hồng', N'Nam', N'0987654321', N'Cần Thơ', N'0', 0, 0)
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [MaSoThue], [TraDK], [ThuDK]) VALUES (N'KH1000012', N'NKH10002', N'KH1000012', N'Nam', N'KH1000012 ', N'Đắk Lắk', N'0', 0, 0)
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [MaSoThue], [TraDK], [ThuDK]) VALUES (N'KH1000013', N'NKH10002', N'KH1000013', N'Nam', N'KH1000013 ', N'Hà Giang', N'0', 0, 0)
GO
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho]) VALUES (N'1', N'SP10000001', CAST(N'2020-12-12T09:15:35.000' AS DateTime), NULL, 1000, 0, 1, N'IDKV10002')
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho]) VALUES (N'10', N'SP10000010', CAST(N'2020-12-12T09:15:35.000' AS DateTime), NULL, 150, 0, 1, N'IDKV10002')
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho]) VALUES (N'11', N'SP10000011', CAST(N'2020-12-12T09:16:35.000' AS DateTime), NULL, 3000, 0, 1, N'IDKV10002')
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho]) VALUES (N'12', N'SP10000012', CAST(N'2020-12-12T09:16:35.000' AS DateTime), NULL, 2300, 0, 1, N'IDKV10002')
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho]) VALUES (N'13', N'SP10000013', CAST(N'2020-12-12T09:16:35.000' AS DateTime), NULL, 2100, 0, 1, N'IDKV10002')
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho]) VALUES (N'14', N'SP10000014', CAST(N'2020-12-12T09:16:35.000' AS DateTime), NULL, 4599, 0, 1, N'IDKV10002')
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho]) VALUES (N'15', N'SP10000015', CAST(N'2020-12-12T09:16:35.000' AS DateTime), NULL, 5600, 0, 1, N'IDKV10002')
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho]) VALUES (N'16', N'SP10000016', CAST(N'2020-12-12T09:16:35.000' AS DateTime), NULL, 100, 0, 1, N'IDKV10002')
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho]) VALUES (N'17', N'SP10000017', CAST(N'2020-12-12T09:16:35.000' AS DateTime), NULL, 900, 0, 1, N'IDKV10002')
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho]) VALUES (N'18', N'SP10000018', CAST(N'2020-12-12T09:16:35.000' AS DateTime), NULL, 7000, 0, 1, N'IDKV10002')
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho]) VALUES (N'19', N'SP10000019', CAST(N'2020-12-12T09:16:35.000' AS DateTime), NULL, 2000, 0, 1, N'IDKV10002')
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho]) VALUES (N'2', N'SP10000002', CAST(N'2020-12-12T09:15:35.000' AS DateTime), NULL, 500, 0, 1, N'IDKV10002')
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho]) VALUES (N'20', N'SP10000020', CAST(N'2020-12-12T09:16:35.000' AS DateTime), NULL, 1050, 0, 1, N'IDKV10002')
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho]) VALUES (N'3', N'SP10000002', CAST(N'2020-12-12T09:15:35.000' AS DateTime), NULL, 500, 0, 1, N'IDKV10002')
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho]) VALUES (N'333', N'SP10000021', CAST(N'2020-12-13T08:56:30.000' AS DateTime), NULL, 100, 0, 1, N'IDKV10001')
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho]) VALUES (N'4', N'SP10000004', CAST(N'2020-12-12T09:15:35.000' AS DateTime), NULL, 800, 0, 1, N'IDKV10002')
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho]) VALUES (N'5', N'SP10000005', CAST(N'2020-12-12T09:15:35.000' AS DateTime), NULL, 300, 0, 1, N'IDKV10002')
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho]) VALUES (N'6', N'SP10000006', CAST(N'2020-12-12T09:15:35.000' AS DateTime), NULL, 400, 0, 1, N'IDKV10002')
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho]) VALUES (N'7', N'SP10000007', CAST(N'2020-12-12T09:15:35.000' AS DateTime), NULL, 500, 0, 1, N'IDKV10002')
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho]) VALUES (N'8', N'SP10000008', CAST(N'2020-12-12T09:15:35.000' AS DateTime), NULL, 1000, 0, 1, N'IDKV10002')
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho]) VALUES (N'9', N'SP10000008', CAST(N'2020-12-12T09:15:35.000' AS DateTime), NULL, 1000, 0, 1, N'IDKV10002')
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho]) VALUES (N'Sp', NULL, NULL, NULL, NULL, NULL, NULL, NULL)
GO
INSERT [dbo].[KhuVuc] ([IDKhuVuc], [TenKhuVuc]) VALUES (N'KV001', N'A')
INSERT [dbo].[KhuVuc] ([IDKhuVuc], [TenKhuVuc]) VALUES (N'KV002', N'B')
INSERT [dbo].[KhuVuc] ([IDKhuVuc], [TenKhuVuc]) VALUES (N'KV003', N'C')
INSERT [dbo].[KhuVuc] ([IDKhuVuc], [TenKhuVuc]) VALUES (N'KV004', N'D')
INSERT [dbo].[KhuVuc] ([IDKhuVuc], [TenKhuVuc]) VALUES (N'KV005', N'E')
INSERT [dbo].[KhuVuc] ([IDKhuVuc], [TenKhuVuc]) VALUES (N'KV006', N'F')
INSERT [dbo].[KhuVuc] ([IDKhuVuc], [TenKhuVuc]) VALUES (N'KV007', N'G')
INSERT [dbo].[KhuVuc] ([IDKhuVuc], [TenKhuVuc]) VALUES (N'KV008', N'H')
INSERT [dbo].[KhuVuc] ([IDKhuVuc], [TenKhuVuc]) VALUES (N'KV009', N'J')
INSERT [dbo].[KhuVuc] ([IDKhuVuc], [TenKhuVuc]) VALUES (N'KV010', N'K')
GO
INSERT [dbo].[KhuVucKho] ([IDKVKho], [TenKho]) VALUES (N'IDKV10001', N'Hải Châu')
INSERT [dbo].[KhuVucKho] ([IDKVKho], [TenKho]) VALUES (N'IDKV10002', N'Ngũ Hành Sơn')
GO
INSERT [dbo].[NhanVien] ([IDNhanVien], [IDBoPhan], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [TinhTrang], [IDCaLam]) VALUES (N'NV100001', N'BP100001', N'Trà Tấn Hưởng', N'Nam', N'0354114665', N'Quảng Nam', 1, NULL)
INSERT [dbo].[NhanVien] ([IDNhanVien], [IDBoPhan], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [TinhTrang], [IDCaLam]) VALUES (N'NV100002', N'BP100002', N'Trần Nguyễn Nguyên Thảo', N'Nữ', N'0123456789', N'Quảng Nam', 1, NULL)
INSERT [dbo].[NhanVien] ([IDNhanVien], [IDBoPhan], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [TinhTrang], [IDCaLam]) VALUES (N'NV100003', N'BP100003', N'Cường Seven', N'Nam', N'0122334455', N'Thái Nguyên', 1, NULL)
INSERT [dbo].[NhanVien] ([IDNhanVien], [IDBoPhan], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [TinhTrang], [IDCaLam]) VALUES (N'NV100004', N'BP100003', N'Nguyễn Tấn Lợi', N'Nam', N'0983643522', N'Huế', 1, NULL)
INSERT [dbo].[NhanVien] ([IDNhanVien], [IDBoPhan], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [TinhTrang], [IDCaLam]) VALUES (N'NV100005', N'BP100002', N'Hoàng Thị Thám', N'Nữ', N'0782363524', N'Núi Thành', 1, NULL)
INSERT [dbo].[NhanVien] ([IDNhanVien], [IDBoPhan], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [TinhTrang], [IDCaLam]) VALUES (N'NV100006', N'BP100002', N'Lê Văn Tiến', N'Nam', N'0989827252', N'Hà Nội', 2, NULL)
INSERT [dbo].[NhanVien] ([IDNhanVien], [IDBoPhan], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [TinhTrang], [IDCaLam]) VALUES (N'NV100007', N'BP100002', N'Hoàng Thu Uyên', N'Nữ', N'0982635241', N'Thái Bình', 1, NULL)
INSERT [dbo].[NhanVien] ([IDNhanVien], [IDBoPhan], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [TinhTrang], [IDCaLam]) VALUES (N'NV100008', N'BP100003', N'1111', N'Nam', N'11111     ', N'Đồng Tháp', 1, NULL)
INSERT [dbo].[NhanVien] ([IDNhanVien], [IDBoPhan], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [TinhTrang], [IDCaLam]) VALUES (N'NV100009', N'BP100003', N'Hòa ', N'Nam', N'0928273662', N'Bình Dương', 1, NULL)
INSERT [dbo].[NhanVien] ([IDNhanVien], [IDBoPhan], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [TinhTrang], [IDCaLam]) VALUES (N'NV100010', N'BP100003', N'Lê Lợi', N'Nam', N'0876222412', N'Hòa Bình', 1, NULL)
GO
INSERT [dbo].[NhomKhachHang] ([IDNhomKH], [TenNhom], [LoaiNhom]) VALUES (N'NKH10001', N'Khách VIP', 1)
INSERT [dbo].[NhomKhachHang] ([IDNhomKH], [TenNhom], [LoaiNhom]) VALUES (N'NKH10002', N'Khách Defa', 2)
INSERT [dbo].[NhomKhachHang] ([IDNhomKH], [TenNhom], [LoaiNhom]) VALUES (N'NKH10003', N'Nhà Cung Cấp', 3)
GO
INSERT [dbo].[NhomSanPham] ([IDNhomSanPham], [TenNhom], [LoaiNhom], [IDKhuVuc]) VALUES (N'BANKEO1', N'Bánh Kẹo Và Đồ Ăn Vặt', 5, N'KV005')
INSERT [dbo].[NhomSanPham] ([IDNhomSanPham], [TenNhom], [LoaiNhom], [IDKhuVuc]) VALUES (N'HHMP01', N'Hàng Hóa Mỹ Phẩm', 1, N'KV001')
INSERT [dbo].[NhomSanPham] ([IDNhomSanPham], [TenNhom], [LoaiNhom], [IDKhuVuc]) VALUES (N'NHTHVU1', N'Thời Vụ', 7, N'KV007')
INSERT [dbo].[NhomSanPham] ([IDNhomSanPham], [TenNhom], [LoaiNhom], [IDKhuVuc]) VALUES (N'RBNGK0', N'Rượu Bia Nước Giải Khát', 3, N'KV003')
INSERT [dbo].[NhomSanPham] ([IDNhomSanPham], [TenNhom], [LoaiNhom], [IDKhuVuc]) VALUES (N'SVSPVS1', N'Sữa Và Các Sản Phẩm Về Sữa', 4, N'KV004')
INSERT [dbo].[NhomSanPham] ([IDNhomSanPham], [TenNhom], [LoaiNhom], [IDKhuVuc]) VALUES (N'TCFTUDD', N'Trà Cà Phê Thức Uống Dinh Dưỡng', 4, N'KV004')
INSERT [dbo].[NhomSanPham] ([IDNhomSanPham], [TenNhom], [LoaiNhom], [IDKhuVuc]) VALUES (N'TPCBSDL', N'Thực Phẩm Chế Biến Sẵn Đông Lạnh', 6, N'KV006')
INSERT [dbo].[NhomSanPham] ([IDNhomSanPham], [TenNhom], [LoaiNhom], [IDKhuVuc]) VALUES (N'TPKVCB1', N'Thực Phẩm Khô Và Chế Biến', 2, N'KV002')
GO
INSERT [dbo].[PhieuKho] ([IDPhieu], [IDHoaDon], [NgayNhap], [NgayXuat], [IDKVKho]) VALUES (N'PK100001', N'HD1000003', CAST(N'2020-12-12T07:21:03.000' AS DateTime), NULL, N'IDKV10002')
INSERT [dbo].[PhieuKho] ([IDPhieu], [IDHoaDon], [NgayNhap], [NgayXuat], [IDKVKho]) VALUES (N'PK100002', N'HD1000004', NULL, CAST(N'2020-12-12T07:21:03.000' AS DateTime), N'IDKV10002')
INSERT [dbo].[PhieuKho] ([IDPhieu], [IDHoaDon], [NgayNhap], [NgayXuat], [IDKVKho]) VALUES (N'PK100003', N'HD1000005', CAST(N'2020-12-13T07:35:30.000' AS DateTime), NULL, N'IDKV10001')
GO
INSERT [dbo].[PhuongThucThanhToan] ([IDPTThanhToan], [TenPTThanhToan]) VALUES (N'TIENMAT1', N'Tiền Mặt')
INSERT [dbo].[PhuongThucThanhToan] ([IDPTThanhToan], [TenPTThanhToan]) VALUES (N'TTTATM01', N'ATM')
GO
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000000', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL)
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000001', N'HHMP01', N'Sữa rửa tay Vinmart Home ', N'Chai', CAST(N'2020-11-11' AS Date), CAST(N'2020-11-12' AS Date), N'BANKEO1.png', N'BG1000001', N'KH1000004', 0, N'1')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000002', N'HHMP01', N'Kem đánh răng Closeup bạc hà 230g', N'Hộp', CAST(N'2020-11-12' AS Date), CAST(N'2020-11-13' AS Date), N'BANKEO1.png', N'BG1000002', N'KH1000004', 0, N'3')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000003', N'HHMP01', N'Gel rửa tay Kleen hương trà xanh 40ml ', N'Hộp', CAST(N'2020-11-13' AS Date), CAST(N'2020-11-14' AS Date), N'BANKEO1.png', N'BG1000003', N'KH1000004', 0, N'3')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000004', N'HHMP01', N'Mặt nạ linh chi Vinmart Care 25ml', N'Bịch', CAST(N'2020-11-14' AS Date), CAST(N'2020-11-15' AS Date), N'BANKEO1.png', N'BG1000004', N'KH1000004', 0, N'4')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000005', N'HHMP01', N'Mặt nạ ốc sên Vinmart Care 25ml', N'Bịch', CAST(N'2020-11-15' AS Date), CAST(N'2020-11-16' AS Date), N'BANKEO1.png', N'BG1000005', N'KH1000004', 0, N'5')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000006', N'HHMP01', N'Dầu gội siêu mượt rejoice chai 650g', N'Chai', CAST(N'2020-11-16' AS Date), CAST(N'2020-11-17' AS Date), N'BANKEO1.png', N'BG1000006', N'KH1000004', 0, N'6')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000007', N'HHMP01', N'Gói 5 khẩu trang kháng khuẩn LookAtMe', N'Gói', CAST(N'2020-11-17' AS Date), CAST(N'2020-11-18' AS Date), N'BANKEO1.png', N'BG1000007', N'KH1000004', 0, N'7')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000008', N'HHMP01', N'Dầu gội Treseemé vào nếp mượt mà 640g', N'Chai', CAST(N'2020-11-18' AS Date), CAST(N'2020-11-19' AS Date), N'BANKEO1.png', N'BG1000008', N'KH1000004', 0, N'9')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000009', N'HHMP01', N'Dầu gội cao cấp Romano Classic 900g', N'Chai', CAST(N'2020-11-19' AS Date), CAST(N'2020-11-20' AS Date), N'BANKEO1.png', N'BG1000009', N'KH1000004', 0, N'9')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000010', N'HHMP01', N'Tăm bông thân giấy Niva 200 quê', N'Hộp', CAST(N'2020-11-20' AS Date), CAST(N'2020-11-21' AS Date), N'BANKEO1.png', N'BG1000010', N'KH1000004', 0, N'10')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000011', N'RBNGK0', N'Nước khoáng thiên nhiên aquafina 200ml', N'Chai', CAST(N'2020-11-21' AS Date), CAST(N'2020-11-20' AS Date), N'BANKEO1.png', N'BG1000011', N'KH1000004', 0, N'11')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000012', N'RBNGK0', N'Nước uống tăng lực RedBull 250ml', N'Lon', CAST(N'2020-11-22' AS Date), CAST(N'2020-11-21' AS Date), N'BANKEO1.png', N'BG1000012', N'KH1000004', 0, N'12')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000013', N'RBNGK0', N'Nước táo lên men StrongBow', N'Chai', CAST(N'2020-11-23' AS Date), CAST(N'2020-11-22' AS Date), N'BANKEO1.png', N'BG1000013', N'KH1000004', 0, N'13')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000014', N'RBNGK0', N'Bia Tiger Lon 330ml', N'Lon', CAST(N'2020-11-24' AS Date), CAST(N'2020-11-23' AS Date), N'BANKEO1.png', N'BG1000014', N'KH1000004', 0, N'14')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000015', N'RBNGK0', N'Bia Heniken lon 330ml', N'Lon', CAST(N'2020-11-25' AS Date), CAST(N'2020-11-24' AS Date), N'BANKEO1.png', N'BG1000015', N'KH1000004', 0, N'15')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000016', N'RBNGK0', N'Nước tăng lực sting vàng chai 330ml', N'Chai', CAST(N'2020-11-26' AS Date), CAST(N'2020-11-25' AS Date), N'BANKEO1.png', N'BG1000016', N'KH1000004', 0, N'16')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000017', N'RBNGK0', N'Nước tăng lực sting đỏ chai 330ml', N'Chai', CAST(N'2020-11-27' AS Date), CAST(N'2020-11-26' AS Date), N'BANKEO1.png', N'BG1000017', N'KH1000004', 0, N'17')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000018', N'RBNGK0', N'Nước giải khát có gas mirinda vị soda kem', N'Lon', CAST(N'2020-11-28' AS Date), CAST(N'2020-11-27' AS Date), N'BANKEO1.png', N'BG1000018', N'KH1000004', 0, N'18')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000019', N'RBNGK0', N'Nước uống vị dậu pororo chai 235ml', N'Chai', CAST(N'2020-11-29' AS Date), CAST(N'2020-11-28' AS Date), N'BANKEO1.png', N'BG1000019', N'KH1000004', 0, N'19')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000020', N'RBNGK0', N'Nước tăng lực Hổ Vằn lon 245ml', N'Lon', CAST(N'2020-11-30' AS Date), CAST(N'2020-11-29' AS Date), N'BANKEO1.png', N'BG1000020', N'KH1000004', 0, N'20')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000021', N'BANKEO1', N'Bánh gạo nướng Orion An vị tảo biển ', N'Gói', CAST(N'2020-11-01' AS Date), CAST(N'2020-11-01' AS Date), N'BANKEO1.png', N'BG1000021', N'KH1000002', 0, N'333')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000022', N'BANKEO1', N'Bánh custas kem trứng Orion hộp 276g', N'Hộp', CAST(N'2020-11-02' AS Date), CAST(N'2020-11-01' AS Date), N'BANKEO1.png', N'BG1000022', N'KH1000002', 0, NULL)
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000023', N'BANKEO1', N'Snack nhân đậu phộng vị nước cốt dừa', N'Gói', CAST(N'2020-11-03' AS Date), CAST(N'2020-11-02' AS Date), N'BANKEO1.png', N'BG1000023', N'KH1000002', 0, NULL)
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000024', N'BANKEO1', N'Bánh Choco - Pie Orion Hộp 396g', N'Hộp', CAST(N'2020-11-04' AS Date), CAST(N'2020-11-03' AS Date), N'BANKEO1.png', N'BG1000024', N'KH1000002', 0, NULL)
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000025', N'BANKEO1', N'Snack que nhân sửa Akiko gói 160g', N'Gói', CAST(N'2020-11-05' AS Date), CAST(N'2020-11-04' AS Date), N'BANKEO1.png', N'BG1000025', N'KH1000002', 0, NULL)
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000026', N'BANKEO1', N'Snack mực tẩm gia vị cay ngọt Bento gói 24g', N'Gói', CAST(N'2020-11-06' AS Date), CAST(N'2020-11-05' AS Date), N'BANKEO1.png', N'BG1000026', N'KH1000002', 0, NULL)
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000027', N'BANKEO1', N'Kẹo nhai Socola hương bạc hà ', N'Bịch', CAST(N'2020-11-07' AS Date), CAST(N'2020-11-06' AS Date), N'BANKEO1.png', N'BG1000027', N'KH1000002', 0, NULL)
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000028', N'BANKEO1', N'Bánh quy kem việt quất Oreo gói 133g', N'Gói', CAST(N'2020-11-08' AS Date), CAST(N'2020-11-07' AS Date), N'BANKEO1.png', N'BG1000028', N'KH1000002', 0, NULL)
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000029', N'BANKEO1', N'Kẹo trái cây Starmix gói 80g', N'Gói', CAST(N'2020-11-09' AS Date), CAST(N'2020-11-08' AS Date), N'BANKEO1.png', N'BG1000029', N'KH1000002', 0, NULL)
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000030', N'BANKEO1', N'Bánh snack khoai tây tươi vị tảo biển gói 90g', N'Gói', CAST(N'2020-11-10' AS Date), CAST(N'2020-11-09' AS Date), N'BANKEO1.png', N'BG1000030', N'KH1000002', 0, NULL)
GO
SET IDENTITY_INSERT [dbo].[TaiKhoan] ON 

INSERT [dbo].[TaiKhoan] ([ID], [TaiKhoan], [MatKhau], [IDBoPhan], [IDNhanVien]) VALUES (11, N'admin', N'admin', N'BP100001', N'NV100001')
INSERT [dbo].[TaiKhoan] ([ID], [TaiKhoan], [MatKhau], [IDBoPhan], [IDNhanVien]) VALUES (12, N'nhanvien', N'nhanvien', N'BP100003', N'NV100003')
INSERT [dbo].[TaiKhoan] ([ID], [TaiKhoan], [MatKhau], [IDBoPhan], [IDNhanVien]) VALUES (13, N'thukho1', N'123', N'BP100002', N'NV100002')
INSERT [dbo].[TaiKhoan] ([ID], [TaiKhoan], [MatKhau], [IDBoPhan], [IDNhanVien]) VALUES (14, N'loi', N'123', N'BP100003', N'NV100010')
SET IDENTITY_INSERT [dbo].[TaiKhoan] OFF
GO
INSERT [dbo].[ThongTinThanhToan] ([IDThongTin], [IDPTThanhToan], [LoaiThe], [SoTaiKhoan], [TenTaiKhoan], [ChiNhanh], [TenNganHang]) VALUES (N'TTTT1000', NULL, NULL, NULL, NULL, NULL, NULL)
INSERT [dbo].[ThongTinThanhToan] ([IDThongTin], [IDPTThanhToan], [LoaiThe], [SoTaiKhoan], [TenTaiKhoan], [ChiNhanh], [TenNganHang]) VALUES (N'TTTT1001', N'TTTATM01', N'TP Bank', N'03928363542', N'TRA TAN HUONG', N'Đà Nẵng', N'Ngân Hàng Tiền Phong')
GO
SET IDENTITY_INSERT [dbo].[TichDiem] ON 

INSERT [dbo].[TichDiem] ([ID], [IDKhachHang], [SoDiem], [IsVip], [QuyDoiDiem], [TienQuyDoi]) VALUES (110, N'KH1000008', 0, 0, 100000, 1000)
INSERT [dbo].[TichDiem] ([ID], [IDKhachHang], [SoDiem], [IsVip], [QuyDoiDiem], [TienQuyDoi]) VALUES (111, N'KH1000009', 0, 0, 100000, 1000)
INSERT [dbo].[TichDiem] ([ID], [IDKhachHang], [SoDiem], [IsVip], [QuyDoiDiem], [TienQuyDoi]) VALUES (112, N'KH1000010', 1, 0, 100000, 1000)
INSERT [dbo].[TichDiem] ([ID], [IDKhachHang], [SoDiem], [IsVip], [QuyDoiDiem], [TienQuyDoi]) VALUES (113, N'KH1000011', 5, 0, 100000, 1000)
INSERT [dbo].[TichDiem] ([ID], [IDKhachHang], [SoDiem], [IsVip], [QuyDoiDiem], [TienQuyDoi]) VALUES (114, N'KH1000012', 1, 0, 100000, 1000)
INSERT [dbo].[TichDiem] ([ID], [IDKhachHang], [SoDiem], [IsVip], [QuyDoiDiem], [TienQuyDoi]) VALUES (115, N'KH1000013', 4, 0, 100000, 1000)
SET IDENTITY_INSERT [dbo].[TichDiem] OFF
GO
ALTER TABLE [dbo].[DongHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_DongHoaDon_DonViTinh] FOREIGN KEY([IDDonViTinh])
REFERENCES [dbo].[DonViTinh] ([IDDonViTinh])
GO
ALTER TABLE [dbo].[DongHoaDon] CHECK CONSTRAINT [FK_DongHoaDon_DonViTinh]
GO
ALTER TABLE [dbo].[DongHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_DongHoaDon_HoaDon] FOREIGN KEY([IDHoaDon])
REFERENCES [dbo].[HoaDon] ([IDHoaDon])
GO
ALTER TABLE [dbo].[DongHoaDon] CHECK CONSTRAINT [FK_DongHoaDon_HoaDon]
GO
ALTER TABLE [dbo].[DongHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_DongHoaDon_SanPham] FOREIGN KEY([IDSanPham])
REFERENCES [dbo].[SanPham] ([IDSanPham])
GO
ALTER TABLE [dbo].[DongHoaDon] CHECK CONSTRAINT [FK_DongHoaDon_SanPham]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_KhachHang] FOREIGN KEY([IDKhachHang])
REFERENCES [dbo].[KhachHang] ([IDKhachHang])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_KhachHang]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_NhanVien] FOREIGN KEY([IDNhanVien])
REFERENCES [dbo].[NhanVien] ([IDNhanVien])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_NhanVien]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_PhieuKho] FOREIGN KEY([IDPhieu])
REFERENCES [dbo].[PhieuKho] ([IDPhieu])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_PhieuKho]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_ThongTinThanhToan] FOREIGN KEY([IDThongTin])
REFERENCES [dbo].[ThongTinThanhToan] ([IDThongTin])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_ThongTinThanhToan]
GO
ALTER TABLE [dbo].[KhachHang]  WITH CHECK ADD  CONSTRAINT [FK_KhachHang_NhomKhachHang] FOREIGN KEY([IDNhomKH])
REFERENCES [dbo].[NhomKhachHang] ([IDNhomKH])
GO
ALTER TABLE [dbo].[KhachHang] CHECK CONSTRAINT [FK_KhachHang_NhomKhachHang]
GO
ALTER TABLE [dbo].[Kho]  WITH CHECK ADD  CONSTRAINT [FK_Kho_KhuVucKho] FOREIGN KEY([IDKVKho])
REFERENCES [dbo].[KhuVucKho] ([IDKVKho])
GO
ALTER TABLE [dbo].[Kho] CHECK CONSTRAINT [FK_Kho_KhuVucKho]
GO
ALTER TABLE [dbo].[Kho]  WITH CHECK ADD  CONSTRAINT [FK_Kho_SanPham] FOREIGN KEY([IDSanPham])
REFERENCES [dbo].[SanPham] ([IDSanPham])
GO
ALTER TABLE [dbo].[Kho] CHECK CONSTRAINT [FK_Kho_SanPham]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_BoPhan] FOREIGN KEY([IDBoPhan])
REFERENCES [dbo].[BoPhan] ([IDBoPhan])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_BoPhan]
GO
ALTER TABLE [dbo].[NhomSanPham]  WITH CHECK ADD  CONSTRAINT [FK_NhomSanPham_KhuVuc] FOREIGN KEY([IDKhuVuc])
REFERENCES [dbo].[KhuVuc] ([IDKhuVuc])
GO
ALTER TABLE [dbo].[NhomSanPham] CHECK CONSTRAINT [FK_NhomSanPham_KhuVuc]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_BangGia1] FOREIGN KEY([IDBangGia])
REFERENCES [dbo].[BangGia] ([IDBangGia])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SanPham_BangGia1]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_DonViTinh] FOREIGN KEY([IDDonViTinh])
REFERENCES [dbo].[DonViTinh] ([IDDonViTinh])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SanPham_DonViTinh]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_NhomSanPham] FOREIGN KEY([IDNhomSanPham])
REFERENCES [dbo].[NhomSanPham] ([IDNhomSanPham])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SanPham_NhomSanPham]
GO
ALTER TABLE [dbo].[TaiKhoan]  WITH CHECK ADD  CONSTRAINT [FK_TaiKhoan_BoPhan] FOREIGN KEY([IDBoPhan])
REFERENCES [dbo].[BoPhan] ([IDBoPhan])
GO
ALTER TABLE [dbo].[TaiKhoan] CHECK CONSTRAINT [FK_TaiKhoan_BoPhan]
GO
ALTER TABLE [dbo].[TaiKhoan]  WITH CHECK ADD  CONSTRAINT [FK_TaiKhoan_NhanVien] FOREIGN KEY([IDNhanVien])
REFERENCES [dbo].[NhanVien] ([IDNhanVien])
GO
ALTER TABLE [dbo].[TaiKhoan] CHECK CONSTRAINT [FK_TaiKhoan_NhanVien]
GO
ALTER TABLE [dbo].[ThongTinThanhToan]  WITH CHECK ADD  CONSTRAINT [FK_ThongTinThanhToan_PhuongThucThanhToan] FOREIGN KEY([IDPTThanhToan])
REFERENCES [dbo].[PhuongThucThanhToan] ([IDPTThanhToan])
GO
ALTER TABLE [dbo].[ThongTinThanhToan] CHECK CONSTRAINT [FK_ThongTinThanhToan_PhuongThucThanhToan]
GO
ALTER TABLE [dbo].[TichDiem]  WITH CHECK ADD  CONSTRAINT [FK_TichDiem_KhachHang1] FOREIGN KEY([IDKhachHang])
REFERENCES [dbo].[KhachHang] ([IDKhachHang])
GO
ALTER TABLE [dbo].[TichDiem] CHECK CONSTRAINT [FK_TichDiem_KhachHang1]
GO
