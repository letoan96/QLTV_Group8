/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

/**
 *
 * @author Admin
 */
public class ThongTinDocGia extends javax.swing.JFrame {

    /**
     * Creates new form ThongTinDocGia
     */
    public ThongTinDocGia() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PN_thongtindocgia_mainmenu = new javax.swing.JPanel();
        BT_trangchu = new javax.swing.JButton();
        BT_sach = new javax.swing.JButton();
        BT_docgia = new javax.swing.JButton();
        BT_muontrasach = new javax.swing.JButton();
        BT_thongke = new javax.swing.JButton();
        BT_hethong = new javax.swing.JButton();
        BT_taikhoan = new javax.swing.JButton();
        BT_dangxuat = new javax.swing.JButton();
        PN_thongtindocgia_menu = new javax.swing.JPanel();
        LB_docgiamenu = new javax.swing.JLabel();
        BT_lapthedocgia = new javax.swing.JButton();
        BT_thongtindocgia = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        PN_thongtinsach_info_tim4 = new javax.swing.JPanel();
        LB_cachtimkiem4 = new javax.swing.JLabel();
        LB_tutimkiem4 = new javax.swing.JLabel();
        CB_cachtimkiem4 = new javax.swing.JComboBox<>();
        TF_tutimkiem4 = new javax.swing.JTextField();
        BT_tim4 = new javax.swing.JButton();
        PN_thongtinsach_info_chitiet = new javax.swing.JPanel();
        LB_masach = new javax.swing.JLabel();
        LB_tensach = new javax.swing.JLabel();
        LB_tacgia = new javax.swing.JLabel();
        LB_soluong = new javax.swing.JLabel();
        LB_theloai = new javax.swing.JLabel();
        LB_nxb = new javax.swing.JLabel();
        LB_namxuatban = new javax.swing.JLabel();
        LB_trigia = new javax.swing.JLabel();
        TF_masach = new javax.swing.JTextField();
        SN_soluong = new javax.swing.JSpinner();
        TF_tensach = new javax.swing.JTextField();
        CB_tacgia = new javax.swing.JComboBox<>();
        CB_theloai = new javax.swing.JComboBox<>();
        TF_nxb = new javax.swing.JTextField();
        FF_namxuatban = new javax.swing.JFormattedTextField();
        FF_trigia = new javax.swing.JFormattedTextField();
        PN_thongtinsach_info_BT = new javax.swing.JPanel();
        BT_sua = new javax.swing.JButton();
        BT_xoa = new javax.swing.JButton();
        BT_luu = new javax.swing.JButton();
        BT_huy = new javax.swing.JButton();
        PN_thongtinsach_ketqua = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PN_thongtindocgia_mainmenu.setBackground(new java.awt.Color(51, 51, 255));
        PN_thongtindocgia_mainmenu.setAlignmentX(0.0F);
        PN_thongtindocgia_mainmenu.setAlignmentY(0.0F);

        BT_trangchu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_trangchu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/trangchu.png"))); // NOI18N
        BT_trangchu.setText("Trang Chủ");
        BT_trangchu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BT_trangchu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_trangchuActionPerformed(evt);
            }
        });

        BT_sach.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_sach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sach.png"))); // NOI18N
        BT_sach.setText("Sách");
        BT_sach.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        BT_docgia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_docgia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/docgia.png"))); // NOI18N
        BT_docgia.setText("Độc Giả");
        BT_docgia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        BT_muontrasach.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_muontrasach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/muonsach.png"))); // NOI18N
        BT_muontrasach.setText("Mượn Trả Sách");
        BT_muontrasach.setAlignmentY(0.0F);
        BT_muontrasach.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        BT_thongke.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_thongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/thongke.png"))); // NOI18N
        BT_thongke.setText("Thống Kê");
        BT_thongke.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        BT_hethong.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_hethong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hethong.png"))); // NOI18N
        BT_hethong.setText("Hệ Thống");
        BT_hethong.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BT_hethong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_hethongActionPerformed(evt);
            }
        });

        BT_taikhoan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_taikhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/taikhoan.png"))); // NOI18N
        BT_taikhoan.setText("Tài Khoản");
        BT_taikhoan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        BT_dangxuat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_dangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dangxuat.png"))); // NOI18N
        BT_dangxuat.setText("Đăng Xuất");
        BT_dangxuat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout PN_thongtindocgia_mainmenuLayout = new javax.swing.GroupLayout(PN_thongtindocgia_mainmenu);
        PN_thongtindocgia_mainmenu.setLayout(PN_thongtindocgia_mainmenuLayout);
        PN_thongtindocgia_mainmenuLayout.setHorizontalGroup(
            PN_thongtindocgia_mainmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BT_sach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BT_docgia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BT_muontrasach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BT_thongke, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BT_hethong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BT_taikhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BT_dangxuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BT_trangchu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PN_thongtindocgia_mainmenuLayout.setVerticalGroup(
            PN_thongtindocgia_mainmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_thongtindocgia_mainmenuLayout.createSequentialGroup()
                .addComponent(BT_trangchu, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BT_sach, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BT_docgia, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BT_muontrasach, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BT_thongke, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BT_hethong, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BT_taikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BT_dangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PN_thongtindocgia_menu.setBackground(new java.awt.Color(102, 153, 255));

        LB_docgiamenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/docgiamain.png"))); // NOI18N

        BT_lapthedocgia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_lapthedocgia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lapthedocgia.png"))); // NOI18N
        BT_lapthedocgia.setText("Lập Thẻ Độc Giả");

        BT_thongtindocgia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_thongtindocgia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/thongtindocgia.png"))); // NOI18N
        BT_thongtindocgia.setText("Thông Tin Độc Giả");

        javax.swing.GroupLayout PN_thongtindocgia_menuLayout = new javax.swing.GroupLayout(PN_thongtindocgia_menu);
        PN_thongtindocgia_menu.setLayout(PN_thongtindocgia_menuLayout);
        PN_thongtindocgia_menuLayout.setHorizontalGroup(
            PN_thongtindocgia_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_thongtindocgia_menuLayout.createSequentialGroup()
                .addComponent(LB_docgiamenu)
                .addGap(128, 128, 128)
                .addComponent(BT_lapthedocgia)
                .addGap(197, 197, 197)
                .addComponent(BT_thongtindocgia)
                .addGap(0, 82, Short.MAX_VALUE))
        );
        PN_thongtindocgia_menuLayout.setVerticalGroup(
            PN_thongtindocgia_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_thongtindocgia_menuLayout.createSequentialGroup()
                .addComponent(LB_docgiamenu)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PN_thongtindocgia_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PN_thongtindocgia_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BT_thongtindocgia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT_lapthedocgia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        LB_cachtimkiem4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_cachtimkiem4.setText("Cách tìm kiếm");

        LB_tutimkiem4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_tutimkiem4.setText("Từ tìm kiếm");

        CB_cachtimkiem4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CB_cachtimkiem4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        TF_tutimkiem4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        BT_tim4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/thongtinsach.png"))); // NOI18N

        javax.swing.GroupLayout PN_thongtinsach_info_tim4Layout = new javax.swing.GroupLayout(PN_thongtinsach_info_tim4);
        PN_thongtinsach_info_tim4.setLayout(PN_thongtinsach_info_tim4Layout);
        PN_thongtinsach_info_tim4Layout.setHorizontalGroup(
            PN_thongtinsach_info_tim4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_thongtinsach_info_tim4Layout.createSequentialGroup()
                .addGroup(PN_thongtinsach_info_tim4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PN_thongtinsach_info_tim4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PN_thongtinsach_info_tim4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LB_cachtimkiem4)
                            .addComponent(LB_tutimkiem4))
                        .addGap(18, 18, 18)
                        .addGroup(PN_thongtinsach_info_tim4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CB_cachtimkiem4, 0, 216, Short.MAX_VALUE)
                            .addComponent(TF_tutimkiem4)))
                    .addGroup(PN_thongtinsach_info_tim4Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(BT_tim4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PN_thongtinsach_info_tim4Layout.setVerticalGroup(
            PN_thongtinsach_info_tim4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_thongtinsach_info_tim4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PN_thongtinsach_info_tim4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_cachtimkiem4)
                    .addComponent(CB_cachtimkiem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PN_thongtinsach_info_tim4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_tutimkiem4)
                    .addComponent(TF_tutimkiem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BT_tim4)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        LB_masach.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_masach.setText("Mã sách");

        LB_tensach.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_tensach.setText("Tên sách");

        LB_tacgia.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_tacgia.setText("Tác giả");

        LB_soluong.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_soluong.setText("Số lượng");

        LB_theloai.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_theloai.setText("Thể loại");

        LB_nxb.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_nxb.setText("NXB");

        LB_namxuatban.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_namxuatban.setText("Năm xuất bản");

        LB_trigia.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_trigia.setText("Trị giá");

        TF_masach.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        SN_soluong.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        TF_tensach.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        CB_tacgia.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CB_tacgia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CB_theloai.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CB_theloai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        TF_nxb.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        FF_namxuatban.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy"))));
        FF_namxuatban.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        FF_trigia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        FF_trigia.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        javax.swing.GroupLayout PN_thongtinsach_info_chitietLayout = new javax.swing.GroupLayout(PN_thongtinsach_info_chitiet);
        PN_thongtinsach_info_chitiet.setLayout(PN_thongtinsach_info_chitietLayout);
        PN_thongtinsach_info_chitietLayout.setHorizontalGroup(
            PN_thongtinsach_info_chitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_thongtinsach_info_chitietLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PN_thongtinsach_info_chitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PN_thongtinsach_info_chitietLayout.createSequentialGroup()
                        .addComponent(LB_soluong)
                        .addGap(18, 18, 18)
                        .addGroup(PN_thongtinsach_info_chitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CB_tacgia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SN_soluong))
                        .addGroup(PN_thongtinsach_info_chitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PN_thongtinsach_info_chitietLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(LB_trigia)
                                .addGap(62, 62, 62))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PN_thongtinsach_info_chitietLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LB_namxuatban)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(PN_thongtinsach_info_chitietLayout.createSequentialGroup()
                        .addGroup(PN_thongtinsach_info_chitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PN_thongtinsach_info_chitietLayout.createSequentialGroup()
                                .addGroup(PN_thongtinsach_info_chitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LB_tensach)
                                    .addComponent(LB_tacgia))
                                .addGroup(PN_thongtinsach_info_chitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PN_thongtinsach_info_chitietLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(TF_masach, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PN_thongtinsach_info_chitietLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(TF_tensach, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(LB_masach))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PN_thongtinsach_info_chitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LB_theloai)
                            .addComponent(LB_nxb))
                        .addGap(52, 52, 52)))
                .addGroup(PN_thongtinsach_info_chitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TF_nxb)
                    .addComponent(FF_namxuatban)
                    .addComponent(FF_trigia)
                    .addComponent(CB_theloai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        PN_thongtinsach_info_chitietLayout.setVerticalGroup(
            PN_thongtinsach_info_chitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_thongtinsach_info_chitietLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PN_thongtinsach_info_chitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_masach)
                    .addComponent(LB_theloai)
                    .addComponent(TF_masach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_theloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(PN_thongtinsach_info_chitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_tensach)
                    .addComponent(LB_nxb)
                    .addComponent(TF_tensach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_nxb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(PN_thongtinsach_info_chitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_tacgia)
                    .addComponent(LB_namxuatban)
                    .addComponent(CB_tacgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FF_namxuatban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(PN_thongtinsach_info_chitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_soluong)
                    .addComponent(LB_trigia)
                    .addComponent(SN_soluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FF_trigia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BT_sua.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BT_sua.setText("Sửa");

        BT_xoa.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BT_xoa.setText("Xoá");

        BT_luu.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BT_luu.setText("Lưu");

        BT_huy.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BT_huy.setText("Huỷ");

        javax.swing.GroupLayout PN_thongtinsach_info_BTLayout = new javax.swing.GroupLayout(PN_thongtinsach_info_BT);
        PN_thongtinsach_info_BT.setLayout(PN_thongtinsach_info_BTLayout);
        PN_thongtinsach_info_BTLayout.setHorizontalGroup(
            PN_thongtinsach_info_BTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_thongtinsach_info_BTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BT_sua)
                .addGap(119, 119, 119)
                .addComponent(BT_xoa)
                .addGap(117, 117, 117)
                .addComponent(BT_luu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BT_huy)
                .addContainerGap())
        );
        PN_thongtinsach_info_BTLayout.setVerticalGroup(
            PN_thongtinsach_info_BTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_thongtinsach_info_BTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PN_thongtinsach_info_BTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_sua)
                    .addComponent(BT_xoa)
                    .addComponent(BT_luu)
                    .addComponent(BT_huy))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Sách", "Tên Sách", "Thể Loại", "Tác Giả", "Số Lượng", "NXB", "Năm Sản Xuất"
            }
        ));
        PN_thongtinsach_ketqua.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PN_thongtinsach_ketqua)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PN_thongtinsach_info_tim4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PN_thongtinsach_info_chitiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PN_thongtinsach_info_BT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(PN_thongtinsach_info_tim4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PN_thongtinsach_info_chitiet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PN_thongtinsach_info_BT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PN_thongtinsach_ketqua, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PN_thongtindocgia_mainmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PN_thongtindocgia_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PN_thongtindocgia_mainmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PN_thongtindocgia_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_trangchuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_trangchuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_trangchuActionPerformed

    private void BT_hethongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_hethongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_hethongActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ThongTinDocGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongTinDocGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongTinDocGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongTinDocGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongTinDocGia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_dangxuat;
    private javax.swing.JButton BT_docgia;
    private javax.swing.JButton BT_hethong;
    private javax.swing.JButton BT_huy;
    private javax.swing.JButton BT_lapthedocgia;
    private javax.swing.JButton BT_luu;
    private javax.swing.JButton BT_muontrasach;
    private javax.swing.JButton BT_sach;
    private javax.swing.JButton BT_sua;
    private javax.swing.JButton BT_taikhoan;
    private javax.swing.JButton BT_thongke;
    private javax.swing.JButton BT_thongtindocgia;
    private javax.swing.JButton BT_tim;
    private javax.swing.JButton BT_tim1;
    private javax.swing.JButton BT_tim2;
    private javax.swing.JButton BT_tim3;
    private javax.swing.JButton BT_tim4;
    private javax.swing.JButton BT_trangchu;
    private javax.swing.JButton BT_xoa;
    private javax.swing.JComboBox<String> CB_cachtimkiem;
    private javax.swing.JComboBox<String> CB_cachtimkiem1;
    private javax.swing.JComboBox<String> CB_cachtimkiem2;
    private javax.swing.JComboBox<String> CB_cachtimkiem3;
    private javax.swing.JComboBox<String> CB_cachtimkiem4;
    private javax.swing.JComboBox<String> CB_tacgia;
    private javax.swing.JComboBox<String> CB_theloai;
    private javax.swing.JFormattedTextField FF_namxuatban;
    private javax.swing.JFormattedTextField FF_trigia;
    private javax.swing.JLabel LB_cachtimkiem;
    private javax.swing.JLabel LB_cachtimkiem1;
    private javax.swing.JLabel LB_cachtimkiem2;
    private javax.swing.JLabel LB_cachtimkiem3;
    private javax.swing.JLabel LB_cachtimkiem4;
    private javax.swing.JLabel LB_docgiamenu;
    private javax.swing.JLabel LB_masach;
    private javax.swing.JLabel LB_namxuatban;
    private javax.swing.JLabel LB_nxb;
    private javax.swing.JLabel LB_soluong;
    private javax.swing.JLabel LB_tacgia;
    private javax.swing.JLabel LB_tensach;
    private javax.swing.JLabel LB_theloai;
    private javax.swing.JLabel LB_trigia;
    private javax.swing.JLabel LB_tutimkiem;
    private javax.swing.JLabel LB_tutimkiem1;
    private javax.swing.JLabel LB_tutimkiem2;
    private javax.swing.JLabel LB_tutimkiem3;
    private javax.swing.JLabel LB_tutimkiem4;
    private javax.swing.JPanel PN_thongtindocgia_mainmenu;
    private javax.swing.JPanel PN_thongtindocgia_menu;
    private javax.swing.JPanel PN_thongtinsach_info;
    private javax.swing.JPanel PN_thongtinsach_info1;
    private javax.swing.JPanel PN_thongtinsach_info2;
    private javax.swing.JPanel PN_thongtinsach_info3;
    private javax.swing.JPanel PN_thongtinsach_info_BT;
    private javax.swing.JPanel PN_thongtinsach_info_chitiet;
    private javax.swing.JPanel PN_thongtinsach_info_tim;
    private javax.swing.JPanel PN_thongtinsach_info_tim1;
    private javax.swing.JPanel PN_thongtinsach_info_tim2;
    private javax.swing.JPanel PN_thongtinsach_info_tim3;
    private javax.swing.JPanel PN_thongtinsach_info_tim4;
    private javax.swing.JScrollPane PN_thongtinsach_ketqua;
    private javax.swing.JSpinner SN_soluong;
    private javax.swing.JTextField TF_masach;
    private javax.swing.JTextField TF_nxb;
    private javax.swing.JTextField TF_tensach;
    private javax.swing.JTextField TF_tutimkiem;
    private javax.swing.JTextField TF_tutimkiem1;
    private javax.swing.JTextField TF_tutimkiem2;
    private javax.swing.JTextField TF_tutimkiem3;
    private javax.swing.JTextField TF_tutimkiem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
