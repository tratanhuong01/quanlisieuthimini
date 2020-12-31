USE [QuanLiSieuThiMini]
GO
/****** Object:  Table [dbo].[BangGia]    Script Date: 31/12/2020 5:57:10 PM ******/
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
/****** Object:  Table [dbo].[BoPhan]    Script Date: 31/12/2020 5:57:10 PM ******/
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
/****** Object:  Table [dbo].[CaLam]    Script Date: 31/12/2020 5:57:10 PM ******/
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
/****** Object:  Table [dbo].[DiaChi]    Script Date: 31/12/2020 5:57:10 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DiaChi](
	[STT] [int] IDENTITY(1,1) NOT NULL,
	[TenTinh] [nvarchar](100) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DongHoaDon]    Script Date: 31/12/2020 5:57:10 PM ******/
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
/****** Object:  Table [dbo].[DonViTinh]    Script Date: 31/12/2020 5:57:10 PM ******/
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
/****** Object:  Table [dbo].[HoaDon]    Script Date: 31/12/2020 5:57:10 PM ******/
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
/****** Object:  Table [dbo].[KhachHang]    Script Date: 31/12/2020 5:57:10 PM ******/
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
	[TinhTrang] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[IDKhachHang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Kho]    Script Date: 31/12/2020 5:57:10 PM ******/
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
	[SoLuongTonKho] [int] NULL,
	[SoLuongHienTai] [int] NULL,
 CONSTRAINT [PK_Kho] PRIMARY KEY CLUSTERED 
(
	[SKU] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhuVuc]    Script Date: 31/12/2020 5:57:10 PM ******/
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
/****** Object:  Table [dbo].[KhuVucKho]    Script Date: 31/12/2020 5:57:10 PM ******/
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
/****** Object:  Table [dbo].[NhanVien]    Script Date: 31/12/2020 5:57:10 PM ******/
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
/****** Object:  Table [dbo].[NhomKhachHang]    Script Date: 31/12/2020 5:57:10 PM ******/
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
/****** Object:  Table [dbo].[NhomSanPham]    Script Date: 31/12/2020 5:57:10 PM ******/
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
/****** Object:  Table [dbo].[PhieuKho]    Script Date: 31/12/2020 5:57:10 PM ******/
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
/****** Object:  Table [dbo].[PhuongThucThanhToan]    Script Date: 31/12/2020 5:57:10 PM ******/
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
/****** Object:  Table [dbo].[SanPham]    Script Date: 31/12/2020 5:57:10 PM ******/
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
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 31/12/2020 5:57:10 PM ******/
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
/****** Object:  Table [dbo].[ThongTinThanhToan]    Script Date: 31/12/2020 5:57:10 PM ******/
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
/****** Object:  Table [dbo].[TichDiem]    Script Date: 31/12/2020 5:57:10 PM ******/
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
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG10000000', 1, 1, 1)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG10000001', 63000, 0, 57400)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG10000002', 102000, 0, 91200)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG10000003', 65000, 0, 58800)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG10000004', 13000, 0, 9700)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG10000005', 20000, 0, 14400)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG10000006', 28900, 0, 21000)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG10000007', 45900, 0, 39900)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG10000008', 35000, 0, 27700)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG10000009', 6500, 0, 4300)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG10000010', 193700, 0, 176000)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG10000011', 41600, 0, 36700)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG10000012', 21000, 0, 18000)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG10000013', 14500, 0, 10000)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG10000014', 103600, 0, 95000)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG10000015', 29900, 0, 23300)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG10000016', 14000, 0, 9300)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG10000017', 59000, 0, 50000)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG10000018', 30100, 0, 26500)
INSERT [dbo].[BangGia] ([IDBangGia], [DonGia], [Giam], [GiaVonSP]) VALUES (N'BG10000019', 26600, 0, 18100)
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
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000001', NULL, NULL, NULL, NULL, NULL, NULL, NULL)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000002', N'HD1', N'SP10000001', N'Hộp', 500, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000003', N'HD1', N'SP10000002', N'Chai', 1000, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000004', N'HD1', N'SP10000004', N'Gói', 300, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000005', N'HD1', N'SP10000003', N'Gói', 500, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000006', N'HD1', N'SP10000005', N'Bịch', 600, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000007', N'HD1', N'SP10000006', N'Hủ', 700, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000008', N'HD1', N'SP10000007', N'Hộp', 800, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000009', N'HD1', N'SP10000008', N'Gói', 340, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000010', N'HD1', N'SP10000009', N'Gói', 450, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000011', N'HD1', N'SP10000010', N'Hộp', 900, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000012', N'HD1', N'SP10000011', N'Bịch', 390, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000013', N'HD1', N'SP10000012', N'Gói', 600, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000014', N'HD1', N'SP10000013', N'Hộp', 650, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000015', N'HD1', N'SP10000014', N'Hộp', 200, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000016', N'HD1', N'SP10000015', N'Hủ', 250, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000017', N'HD1', N'SP10000016', N'Gói', 165, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000018', N'HD1', N'SP10000017', N'Hộp', 250, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000019', N'HD1', N'SP10000018', N'Hủ', 220, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000020', N'HD1', N'SP10000019', N'Túi', 100, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000021', N'HD2', N'SP10000001', N'Hộp', 300, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000022', N'HD2', N'SP10000002', N'Chai', 500, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000023', N'HD2', N'SP10000003', N'Gói', 400, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000024', N'HD2', N'SP10000004', N'Gói', 250, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000025', N'HD2', N'SP10000005', N'Bịch', 500, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000026', N'HD2', N'SP10000006', N'Hủ', 450, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000027', N'HD2', N'SP10000007', N'Hộp', 650, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000028', N'HD2', N'SP10000008', N'Gói', 300, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000029', N'HD2', N'SP10000009', N'Gói', 400, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000030', N'HD2', N'SP10000011', N'Bịch', 350, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000031', N'HD2', N'SP10000010', N'Hộp', 650, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000032', N'HD2', N'SP10000012', N'Gói', 150, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000033', N'HD2', N'SP10000013', N'Hộp', 500, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000034', N'HD2', N'SP10000014', N'Hộp', 150, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000035', N'HD2', N'SP10000015', N'Hủ', 200, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000036', N'HD2', N'SP10000016', N'Gói', 150, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000037', N'HD2', N'SP10000018', N'Hủ', 200, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000038', N'HD2', N'SP10000019', N'Túi', 50, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000039', N'HD2', N'SP10000017', N'Hộp', 200, 0, 0, 1)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000040', N'HD3', N'SP10000001', N'Hộp', 1, NULL, NULL, NULL)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000041', N'HD3', N'SP10000002', N'Chai', 1, NULL, NULL, NULL)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000042', N'HD3', N'SP10000003', N'Gói', 1, NULL, NULL, NULL)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000043', N'HD3', N'SP10000004', N'Gói', 1, NULL, NULL, NULL)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000044', N'HD4', N'SP10000006', N'Hủ', 1, NULL, NULL, NULL)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000045', N'HD4', N'SP10000007', N'Hộp', 1, NULL, NULL, NULL)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000046', N'HD4', N'SP10000008', N'Gói', 1, NULL, NULL, NULL)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000047', N'HD4', N'SP10000009', N'Gói', 1, NULL, NULL, NULL)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000048', N'HD5', N'SP10000002', N'Chai', 10, NULL, NULL, NULL)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong], [Giam], [TraLai], [TinhTrang]) VALUES (N'DHD1000049', N'HD6', N'SP10000001', N'Hộp', 1, NULL, NULL, NULL)
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
INSERT [dbo].[DonViTinh] ([IDDonViTinh], [MacDinh]) VALUES (N'Túi', 0)
GO
INSERT [dbo].[HoaDon] ([IDHoaDon], [NgayTao], [IDKhachHang], [IDNhanVien], [TongTien], [TrangThai], [IDThongTin], [LoaiHoaDon], [ThueVAT], [NoiDung], [IDPhieu]) VALUES (N'HD1', CAST(N'2020-12-31T03:40:58.000' AS DateTime), N'KH1000002', N'NV100001', 550955968, 1, NULL, 1, 10, N'', N'PK10000001')
INSERT [dbo].[HoaDon] ([IDHoaDon], [NgayTao], [IDKhachHang], [IDNhanVien], [TongTien], [TrangThai], [IDThongTin], [LoaiHoaDon], [ThueVAT], [NoiDung], [IDPhieu]) VALUES (N'HD2', CAST(N'2020-12-31T04:20:23.000' AS DateTime), NULL, N'NV100001', 312834976, 1, NULL, 2, 0, N'1', N'PK10000002')
INSERT [dbo].[HoaDon] ([IDHoaDon], [NgayTao], [IDKhachHang], [IDNhanVien], [TongTien], [TrangThai], [IDThongTin], [LoaiHoaDon], [ThueVAT], [NoiDung], [IDPhieu]) VALUES (N'HD3', CAST(N'2020-12-31T04:38:45.000' AS DateTime), N'KH1000008', N'NV100003', 243000, 1, NULL, 0, 0, NULL, NULL)
INSERT [dbo].[HoaDon] ([IDHoaDon], [NgayTao], [IDKhachHang], [IDNhanVien], [TongTien], [TrangThai], [IDThongTin], [LoaiHoaDon], [ThueVAT], [NoiDung], [IDPhieu]) VALUES (N'HD4', CAST(N'2020-12-31T04:39:32.000' AS DateTime), N'KH1000009', N'NV100003', 116300, 1, N'TTTT1001', 0, 0, NULL, NULL)
INSERT [dbo].[HoaDon] ([IDHoaDon], [NgayTao], [IDKhachHang], [IDNhanVien], [TongTien], [TrangThai], [IDThongTin], [LoaiHoaDon], [ThueVAT], [NoiDung], [IDPhieu]) VALUES (N'HD5', CAST(N'2020-12-31T04:49:08.000' AS DateTime), N'KH1000010', N'NV100003', 1020000, 1, N'TTTT1002', 0, 0, NULL, NULL)
INSERT [dbo].[HoaDon] ([IDHoaDon], [NgayTao], [IDKhachHang], [IDNhanVien], [TongTien], [TrangThai], [IDThongTin], [LoaiHoaDon], [ThueVAT], [NoiDung], [IDPhieu]) VALUES (N'HD6', CAST(N'2020-12-31T04:56:54.000' AS DateTime), N'KH1000012', N'NV100003', 63000, 1, N'TTTT1003', 0, 0, NULL, NULL)
GO
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [MaSoThue], [TraDK], [ThuDK], [TinhTrang]) VALUES (N'KH1000001', N'NKH10003', N'Công Ty Phân Phối Rau Sạch Hạnh Nhân', NULL, N'18008261  ', N'Đà Nẵng', N'MSS10192', 0, 0, 0)
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [MaSoThue], [TraDK], [ThuDK], [TinhTrang]) VALUES (N'KH1000002', N'NKH10003', N'Công Ty Bánh Kẹo Nhật Cường', NULL, N'023938464 ', N'Hải Phòng', N'MSS10193', 0, 0, 0)
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [MaSoThue], [TraDK], [ThuDK], [TinhTrang]) VALUES (N'KH1000003', N'NKH10003', N'Siêu Thị Big C', NULL, N'19002311  ', N'Đà Nẵng', N'MSS10194', 0, 0, 0)
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [MaSoThue], [TraDK], [ThuDK], [TinhTrang]) VALUES (N'KH1000004', N'NKH10003', N'Công Ty Mỹ Phẩm Hoa Sơn', NULL, N'19000011  ', N'Đồng Tháp', N'MSS10195', 0, 0, 0)
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [MaSoThue], [TraDK], [ThuDK], [TinhTrang]) VALUES (N'KH1000005', N'NKH10003', N'Công Ty Nước Giải Khát Hòa Minh', NULL, N'19283634  ', N'Điện Biên', N'MSS10196', 0, 0, 0)
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [MaSoThue], [TraDK], [ThuDK], [TinhTrang]) VALUES (N'KH1000006', N'NKH10003', N'Công Ty Phân Phối Rượu Bia Hải Yến', NULL, N'19282453  ', N'Quảng Nam', N'MSS10197', 0, 0, 0)
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [MaSoThue], [TraDK], [ThuDK], [TinhTrang]) VALUES (N'KH1000007', N'NKH10003', N'Công Ty Sản Xuất Sữa Khánh Huy', NULL, N'098922534 ', N'Bình Dương', N'MSS10198', 0, 0, 0)
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [MaSoThue], [TraDK], [ThuDK], [TinhTrang]) VALUES (N'KH1000008', N'NKH10002', N'KH1000008', N'Nam', N'KH1000008 ', N'Bắc Giang', N'0', 0, 0, NULL)
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [MaSoThue], [TraDK], [ThuDK], [TinhTrang]) VALUES (N'KH1000009', N'NKH10002', N'KH1000009', N'Nam', N'KH1000009 ', N'Bà Rịa-Vũng Tàu', N'0', 0, 0, NULL)
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [MaSoThue], [TraDK], [ThuDK], [TinhTrang]) VALUES (N'KH1000010', N'NKH10002', N'KH1000010', N'Nam', N'KH1000010 ', N'Bến Tre', N'0', 0, 0, NULL)
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [MaSoThue], [TraDK], [ThuDK], [TinhTrang]) VALUES (N'KH1000011', N'NKH10002', N'KH1000011', N'Nam', N'KH1000011 ', N'Bắc Giang', N'0', 0, 0, NULL)
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [MaSoThue], [TraDK], [ThuDK], [TinhTrang]) VALUES (N'KH1000012', N'NKH10002', N'KH1000012', N'Nam', N'KH1000012 ', N'Bắc Giang', N'0', 0, 0, NULL)
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [MaSoThue], [TraDK], [ThuDK], [TinhTrang]) VALUES (N'KH1000013', N'NKH10003', N'KH1000013', NULL, N'KH1000013 ', N'Bắc Ninh', N'MSS10198', 0, 0, 0)
GO
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho], [SoLuongTonKho], [SoLuongHienTai]) VALUES (N'MV23456789', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL)
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho], [SoLuongTonKho], [SoLuongHienTai]) VALUES (N'MV23456790', N'SP10000001', CAST(N'2020-12-31T04:07:56.000' AS DateTime), CAST(N'2020-12-31T04:28:03.000' AS DateTime), 500, 300, 0, N'IDKV10002', 200, 199)
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho], [SoLuongTonKho], [SoLuongHienTai]) VALUES (N'MV23456791', N'SP10000002', CAST(N'2020-12-31T04:07:56.000' AS DateTime), CAST(N'2020-12-31T04:28:03.000' AS DateTime), 1000, 500, 0, N'IDKV10002', 500, 490)
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho], [SoLuongTonKho], [SoLuongHienTai]) VALUES (N'MV23456792', N'SP10000004', CAST(N'2020-12-31T04:07:56.000' AS DateTime), CAST(N'2020-12-31T04:28:03.000' AS DateTime), 300, 250, 0, N'IDKV10002', 50, 50)
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho], [SoLuongTonKho], [SoLuongHienTai]) VALUES (N'MV23456793', N'SP10000003', CAST(N'2020-12-31T04:07:56.000' AS DateTime), CAST(N'2020-12-31T04:28:03.000' AS DateTime), 500, 400, 0, N'IDKV10002', 100, 100)
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho], [SoLuongTonKho], [SoLuongHienTai]) VALUES (N'MV23456794', N'SP10000005', CAST(N'2020-12-31T04:07:56.000' AS DateTime), CAST(N'2020-12-31T04:28:03.000' AS DateTime), 600, 500, 0, N'IDKV10002', 100, 100)
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho], [SoLuongTonKho], [SoLuongHienTai]) VALUES (N'MV23456795', N'SP10000006', CAST(N'2020-12-31T04:07:56.000' AS DateTime), CAST(N'2020-12-31T04:28:03.000' AS DateTime), 700, 450, 0, N'IDKV10002', 250, 250)
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho], [SoLuongTonKho], [SoLuongHienTai]) VALUES (N'MV23456796', N'SP10000007', CAST(N'2020-12-31T04:07:56.000' AS DateTime), CAST(N'2020-12-31T04:28:03.000' AS DateTime), 800, 650, 0, N'IDKV10002', 150, 150)
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho], [SoLuongTonKho], [SoLuongHienTai]) VALUES (N'MV23456797', N'SP10000008', CAST(N'2020-12-31T04:07:56.000' AS DateTime), CAST(N'2020-12-31T04:28:03.000' AS DateTime), 340, 300, 0, N'IDKV10002', 40, 40)
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho], [SoLuongTonKho], [SoLuongHienTai]) VALUES (N'MV23456798', N'SP10000009', CAST(N'2020-12-31T04:07:56.000' AS DateTime), CAST(N'2020-12-31T04:28:03.000' AS DateTime), 450, 400, 0, N'IDKV10002', 50, 50)
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho], [SoLuongTonKho], [SoLuongHienTai]) VALUES (N'MV23456799', N'SP10000010', CAST(N'2020-12-31T04:07:56.000' AS DateTime), CAST(N'2020-12-31T04:28:03.000' AS DateTime), 900, 650, 0, N'IDKV10002', 250, 250)
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho], [SoLuongTonKho], [SoLuongHienTai]) VALUES (N'MV23456800', N'SP10000011', CAST(N'2020-12-31T04:07:56.000' AS DateTime), CAST(N'2020-12-31T04:28:03.000' AS DateTime), 390, 350, 0, N'IDKV10002', 40, 40)
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho], [SoLuongTonKho], [SoLuongHienTai]) VALUES (N'MV23456801', N'SP10000012', CAST(N'2020-12-31T04:07:56.000' AS DateTime), CAST(N'2020-12-31T04:28:03.000' AS DateTime), 600, 150, 0, N'IDKV10002', 450, 450)
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho], [SoLuongTonKho], [SoLuongHienTai]) VALUES (N'MV23456802', N'SP10000013', CAST(N'2020-12-31T04:07:56.000' AS DateTime), CAST(N'2020-12-31T04:28:03.000' AS DateTime), 650, 500, 0, N'IDKV10002', 150, 150)
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho], [SoLuongTonKho], [SoLuongHienTai]) VALUES (N'MV23456803', N'SP10000014', CAST(N'2020-12-31T04:07:56.000' AS DateTime), CAST(N'2020-12-31T04:28:03.000' AS DateTime), 200, 150, 0, N'IDKV10002', 50, 50)
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho], [SoLuongTonKho], [SoLuongHienTai]) VALUES (N'MV23456804', N'SP10000015', CAST(N'2020-12-31T04:07:56.000' AS DateTime), CAST(N'2020-12-31T04:28:03.000' AS DateTime), 250, 200, 0, N'IDKV10002', 50, 50)
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho], [SoLuongTonKho], [SoLuongHienTai]) VALUES (N'MV23456805', N'SP10000016', CAST(N'2020-12-31T04:07:56.000' AS DateTime), CAST(N'2020-12-31T04:28:03.000' AS DateTime), 165, 150, 0, N'IDKV10002', 15, 15)
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho], [SoLuongTonKho], [SoLuongHienTai]) VALUES (N'MV23456806', N'SP10000017', CAST(N'2020-12-31T04:07:56.000' AS DateTime), CAST(N'2020-12-31T04:28:03.000' AS DateTime), 250, 200, 0, N'IDKV10002', 50, 50)
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho], [SoLuongTonKho], [SoLuongHienTai]) VALUES (N'MV23456807', N'SP10000018', CAST(N'2020-12-31T04:07:56.000' AS DateTime), CAST(N'2020-12-31T04:28:03.000' AS DateTime), 220, 200, 0, N'IDKV10002', 20, 20)
INSERT [dbo].[Kho] ([SKU], [IDSanPham], [NgayNhap], [NgayXuat], [SoLuongNhap], [SoLuongXuat], [TinhTrang], [IDKVKho], [SoLuongTonKho], [SoLuongHienTai]) VALUES (N'MV23456808', N'SP10000019', CAST(N'2020-12-31T04:07:56.000' AS DateTime), CAST(N'2020-12-31T04:28:03.000' AS DateTime), 100, 50, 0, N'IDKV10002', 50, 50)
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
INSERT [dbo].[NhanVien] ([IDNhanVien], [IDBoPhan], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [TinhTrang], [IDCaLam]) VALUES (N'NV100003', N'BP100003', N'Cường Seven', N'Nữ', N'0122334455', N'Thái Nguyên', 1, NULL)
INSERT [dbo].[NhanVien] ([IDNhanVien], [IDBoPhan], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [TinhTrang], [IDCaLam]) VALUES (N'NV100004', N'BP100003', N'Nguyễn Tấn Lợi', N'Nam', N'0983643522', N'Huế', 1, NULL)
INSERT [dbo].[NhanVien] ([IDNhanVien], [IDBoPhan], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [TinhTrang], [IDCaLam]) VALUES (N'NV100005', N'BP100002', N'Hoàng Thị Thám', N'Nữ', N'0782363524', N'Núi Thành', 1, NULL)
INSERT [dbo].[NhanVien] ([IDNhanVien], [IDBoPhan], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [TinhTrang], [IDCaLam]) VALUES (N'NV100006', N'BP100002', N'Lê Văn Tiến', N'Nam', N'0989827252', N'Hà Nội', 2, NULL)
INSERT [dbo].[NhanVien] ([IDNhanVien], [IDBoPhan], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [TinhTrang], [IDCaLam]) VALUES (N'NV100007', N'BP100002', N'Hoàng Thu Uyên', N'Nữ', N'0982635241', N'Thái Bình', 1, NULL)
INSERT [dbo].[NhanVien] ([IDNhanVien], [IDBoPhan], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [TinhTrang], [IDCaLam]) VALUES (N'NV100008', N'BP100003', N'Lê Văn Hùng', N'Nam', N'0782454361', N'Đồng Tháp', 1, NULL)
INSERT [dbo].[NhanVien] ([IDNhanVien], [IDBoPhan], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [TinhTrang], [IDCaLam]) VALUES (N'NV100009', N'BP100003', N'Hòa ', N'Nam', N'0928273662', N'Bình Dương', 1, NULL)
INSERT [dbo].[NhanVien] ([IDNhanVien], [IDBoPhan], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [TinhTrang], [IDCaLam]) VALUES (N'NV100010', N'BP100003', N'Lê Lợi', N'Nam', N'0876222412', N'Hòa Bình', 1, NULL)
INSERT [dbo].[NhanVien] ([IDNhanVien], [IDBoPhan], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [TinhTrang], [IDCaLam]) VALUES (N'NV100011', N'BP100002', N'Nguyễn Thị Hải', N'Nữ', N'0971561142', N'Bắc Ninh', 1, NULL)
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
INSERT [dbo].[PhieuKho] ([IDPhieu], [IDHoaDon], [NgayNhap], [NgayXuat], [IDKVKho]) VALUES (N'PK10000000', NULL, NULL, NULL, NULL)
INSERT [dbo].[PhieuKho] ([IDPhieu], [IDHoaDon], [NgayNhap], [NgayXuat], [IDKVKho]) VALUES (N'PK10000001', N'HD1', NULL, NULL, N'IDKV10002')
INSERT [dbo].[PhieuKho] ([IDPhieu], [IDHoaDon], [NgayNhap], [NgayXuat], [IDKVKho]) VALUES (N'PK10000002', N'HD2', NULL, NULL, N'IDKV10002')
GO
INSERT [dbo].[PhuongThucThanhToan] ([IDPTThanhToan], [TenPTThanhToan]) VALUES (N'TIENMAT1', N'Tiền Mặt')
INSERT [dbo].[PhuongThucThanhToan] ([IDPTThanhToan], [TenPTThanhToan]) VALUES (N'TTTATM01', N'ATM')
GO
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000000', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL)
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000001', N'BANKEO1', N'Bánh flan Ánh Hồng lốc 10 hộp 54g', N'Hộp', CAST(N'2019-12-21' AS Date), CAST(N'2020-12-31' AS Date), N'BANKEO1.png', N'BG10000001', N'KH1000002', 0, N'MV23456790')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000002', N'BANKEO1', N'Kem tươi Paysan Breton dạng xịt chai 250g        ', N'Chai', CAST(N'2019-10-10' AS Date), CAST(N'2021-02-03' AS Date), N'BANKEO1.png', N'BG10000002', N'KH1000002', 0, N'MV23456791')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000003', N'BANKEO1', N'Phô mai que Mozzarella Baker Brand gói 140g ', N'Gói', CAST(N'2019-03-03' AS Date), CAST(N'2021-01-03' AS Date), N'BANKEO1.png', N'BG10000003', N'KH1000002', 0, N'MV23456793')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000004', N'BANKEO1', N'Bánh quy nhân kem vani Oreo gói 133g ', N'Gói', CAST(N'2020-11-09' AS Date), CAST(N'2021-10-10' AS Date), N'BANKEO1.png', N'BG10000004', N'KH1000002', 0, N'MV23456792')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000005', N'BANKEO1', N'Bánh gạo nướng orin vị tảo biển', N'Bịch', CAST(N'2020-12-22' AS Date), CAST(N'2021-12-22' AS Date), N'BANKEO1.png', N'BG10000005', N'KH1000002', 0, N'MV23456794')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000006', N'BANKEO1', N'Kẹo gum không đường hướng chanh ', N'Hủ', CAST(N'2019-07-19' AS Date), CAST(N'2021-01-08' AS Date), N'BANKEO1.png', N'BG10000006', N'KH1000002', 0, N'MV23456795')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000007', N'BANKEO1', N'Bánh choco-Pie Orion hộp 396g', N'Hộp', CAST(N'2019-01-23' AS Date), CAST(N'2021-01-06' AS Date), N'BANKEO1.png', N'BG10000007', N'KH1000002', 0, N'MV23456796')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000008', N'BANKEO1', N'Mít sấy vinamit gói 100g', N'Gói', CAST(N'2018-11-22' AS Date), CAST(N'2021-01-01' AS Date), N'BANKEO1.png', N'BG10000008', N'KH1000002', 0, N'MV23456797')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000009', N'BANKEO1', N'Snack tonnnies vị phô mai gói 36g', N'Gói', CAST(N'2020-08-18' AS Date), CAST(N'2021-01-19' AS Date), N'BANKEO1.png', N'BG10000009', N'KH1000002', 0, N'MV23456798')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000010', N'BANKEO1', N'Bánh quy bơ Danasia hộp 681g', N'Hộp', CAST(N'2020-09-09' AS Date), CAST(N'2022-09-09' AS Date), N'BANKEO1.png', N'BG10000010', N'KH1000002', 0, N'MV23456799')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000011', N'BANKEO1', N'Bánh kem xốp phômai Richeese Nabati cheese wafer 320g', N'Bịch', CAST(N'2020-03-03' AS Date), CAST(N'2021-09-03' AS Date), N'BANKEO1.png', N'BG10000011', N'KH1000002', 0, N'MV23456800')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000012', N'BANKEO1', N'Mực tẩm gia vị Thái Bento gói 24g', N'Gói', CAST(N'2020-10-20' AS Date), CAST(N'2021-09-09' AS Date), N'BANKEO1.png', N'BG10000012', N'KH1000002', 0, N'MV23456801')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000013', N'BANKEO1', N'Bánh gấu vị sô cô la Lotte Koala''s March hộp 37g', N'Hộp', CAST(N'2020-12-22' AS Date), CAST(N'2021-12-22' AS Date), N'BANKEO1.png', N'BG10000013', N'KH1000002', 0, N'MV23456802')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000014', N'BANKEO1', N'Bánh quy bơ Pháp Lu hộp 300g', N'Hộp', CAST(N'2020-09-09' AS Date), CAST(N'2022-09-09' AS Date), N'BANKEO1.png', N'BG10000014', N'KH1000002', 0, N'MV23456803')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000015', N'BANKEO1', N'Kẹo gum Lotte Doraemon hương cam 3,2g', N'Hủ', CAST(N'2020-08-18' AS Date), CAST(N'2021-01-19' AS Date), N'BANKEO1.png', N'BG10000015', N'KH1000002', 0, N'MV23456804')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000016', N'BANKEO1', N'Kẹo dẻo hương trái cây CHUPA CHIPS gói 56g', N'Gói', CAST(N'2019-01-23' AS Date), CAST(N'2021-01-06' AS Date), N'BANKEO1.png', N'BG10000016', N'KH1000002', 0, N'MV23456805')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000017', N'BANKEO1', N'Kẹo lồng cún cảnh PlayMore', N'Hộp', CAST(N'2020-12-22' AS Date), CAST(N'2021-12-22' AS Date), N'BANKEO1.png', N'BG10000017', N'KH1000002', 0, N'MV23456806')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000018', N'BANKEO1', N'Kẹo the vị táo xanh PlayMore Hủ 22g', N'Hủ', CAST(N'2019-10-10' AS Date), CAST(N'2021-02-03' AS Date), N'BANKEO1.png', N'BG10000018', N'KH1000002', 0, N'MV23456807')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia], [IDKhachHang], [TinhTrang], [SKU]) VALUES (N'SP10000019', N'BANKEO1', N'Thạch rau câu trái cây tổng hợp túi 1kg', N'Túi', CAST(N'2019-10-10' AS Date), CAST(N'2021-02-03' AS Date), N'BANKEO1.png', N'BG10000019', N'KH1000002', 0, N'MV23456808')
GO
SET IDENTITY_INSERT [dbo].[TaiKhoan] ON 

INSERT [dbo].[TaiKhoan] ([ID], [TaiKhoan], [MatKhau], [IDBoPhan], [IDNhanVien]) VALUES (11, N'admin', N'admin', N'BP100001', N'NV100001')
INSERT [dbo].[TaiKhoan] ([ID], [TaiKhoan], [MatKhau], [IDBoPhan], [IDNhanVien]) VALUES (12, N'nhanvien', N'nhanvien', N'BP100003', N'NV100003')
INSERT [dbo].[TaiKhoan] ([ID], [TaiKhoan], [MatKhau], [IDBoPhan], [IDNhanVien]) VALUES (13, N'thukho1', N'123', N'BP100002', N'NV100002')
INSERT [dbo].[TaiKhoan] ([ID], [TaiKhoan], [MatKhau], [IDBoPhan], [IDNhanVien]) VALUES (14, N'loi', N'123', N'BP100003', N'NV100010')
INSERT [dbo].[TaiKhoan] ([ID], [TaiKhoan], [MatKhau], [IDBoPhan], [IDNhanVien]) VALUES (15, N'thukho2', N'123', N'BP100002', N'NV100011')
SET IDENTITY_INSERT [dbo].[TaiKhoan] OFF
GO
INSERT [dbo].[ThongTinThanhToan] ([IDThongTin], [IDPTThanhToan], [LoaiThe], [SoTaiKhoan], [TenTaiKhoan], [ChiNhanh], [TenNganHang]) VALUES (N'TTTT1000', NULL, NULL, NULL, NULL, NULL, NULL)
INSERT [dbo].[ThongTinThanhToan] ([IDThongTin], [IDPTThanhToan], [LoaiThe], [SoTaiKhoan], [TenTaiKhoan], [ChiNhanh], [TenNganHang]) VALUES (N'TTTT1001', N'TTTATM01', N'VietinBank', N'KH1000009', N'KH1000009', N'KH1000009', N'Ngân Hàng Công thương Việt Nam')
INSERT [dbo].[ThongTinThanhToan] ([IDThongTin], [IDPTThanhToan], [LoaiThe], [SoTaiKhoan], [TenTaiKhoan], [ChiNhanh], [TenNganHang]) VALUES (N'TTTT1002', N'TTTATM01', N'Sacombank', N'KH1000010', N'KH1000010', N'KH1000010', N'Ngân Hàng Sài Gòn Thương Tín')
INSERT [dbo].[ThongTinThanhToan] ([IDThongTin], [IDPTThanhToan], [LoaiThe], [SoTaiKhoan], [TenTaiKhoan], [ChiNhanh], [TenNganHang]) VALUES (N'TTTT1003', N'TTTATM01', N'Vietcombank', N'KH1000012', N'KH1000012', N'KH1000012', N'Ngân Hàng Ngoại Thương Việt Nam')
GO
SET IDENTITY_INSERT [dbo].[TichDiem] ON 

INSERT [dbo].[TichDiem] ([ID], [IDKhachHang], [SoDiem], [IsVip], [QuyDoiDiem], [TienQuyDoi]) VALUES (165, N'KH1000008', 2, 0, 0, 0)
INSERT [dbo].[TichDiem] ([ID], [IDKhachHang], [SoDiem], [IsVip], [QuyDoiDiem], [TienQuyDoi]) VALUES (166, N'KH1000009', 1, 0, 0, 0)
INSERT [dbo].[TichDiem] ([ID], [IDKhachHang], [SoDiem], [IsVip], [QuyDoiDiem], [TienQuyDoi]) VALUES (167, N'KH1000010', 10, 0, 0, 0)
INSERT [dbo].[TichDiem] ([ID], [IDKhachHang], [SoDiem], [IsVip], [QuyDoiDiem], [TienQuyDoi]) VALUES (168, N'KH1000011', 0, 0, 0, 0)
INSERT [dbo].[TichDiem] ([ID], [IDKhachHang], [SoDiem], [IsVip], [QuyDoiDiem], [TienQuyDoi]) VALUES (169, N'KH1000012', 0, 0, 0, 0)
INSERT [dbo].[TichDiem] ([ID], [IDKhachHang], [SoDiem], [IsVip], [QuyDoiDiem], [TienQuyDoi]) VALUES (170, N'KH1000013', 0, 0, 0, 0)
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
