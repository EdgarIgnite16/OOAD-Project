package GUI;

import BUS.*;
import DTO.HoaDonDTO;
import DTO.KhachHangDTO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class PanelKhachHangGUI extends javax.swing.JPanel {
    private static MainFormGUI parentForm;
    private DefaultTableModel modelTable_KH;
    private DefaultTableModel modelTable_HD;

    /**
     * Creates new form PanelKhachHangGUI
     */
    public PanelKhachHangGUI() {
        initComponents();
        initTableKhachHang();
        initTableDonHang();
    }

    // khởi tạo table khách hàng
    public void initTableKhachHang() {
        String[] columnNames = new String[]{"Mã KH", "Tên KH", "Số điện thoại", "Trạng thái"};
        modelTable_KH = new DefaultTableModel();
        modelTable_KH.setColumnIdentifiers(columnNames);

        try {
            tbDanhSachKhachHang.setFont(new Font("Segoe UI", 0, 12));
            tbDanhSachKhachHang.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            tbDanhSachKhachHang.setModel(modelTable_KH);
            loadTableKH(new KhachHangBUS().getData()); // gọi lại hàm load table khách hàng để load lại table
            tbDanhSachKhachHang.setDefaultEditor(Object.class, null);
            tbDanhSachKhachHang.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    tbDanhSachKhachHangMouseListener();
                }

                @Override
                public void mouseEntered(MouseEvent e) {

                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
            _MessageDialogHelper.showErrorDialog(this, ex.getMessage(), "Error !");
        }
    }

    // khởi tạo table đơn hàng
    public void initTableDonHang() {
        String[] columnNames = new String[]{"Mã HD", "Mã NV", "Mã KH", "Mã giảm giá", "Tổng hoá đơn (VNĐ)", "Ngày bán"};
        modelTable_HD = new DefaultTableModel();
        modelTable_HD.setColumnIdentifiers(columnNames);

        tbLichSuGiaoDich.setFont(new Font("Segoe UI", 0, 12));
        tbLichSuGiaoDich.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbLichSuGiaoDich.setModel(modelTable_HD);
        tbLichSuGiaoDich.setDefaultEditor(Object.class, null);
        tbLichSuGiaoDich.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                tbLichSuGiaoDichMouseListener();
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        pnThongTinKhachHang = new javax.swing.JPanel();
        lbMaKhachHang = new javax.swing.JLabel();
        lbTenKhachHang = new javax.swing.JLabel();
        lbSoDienThoai = new javax.swing.JLabel();
        txtMaKhachHang = new javax.swing.JTextField();
        txtTenKhachHang = new javax.swing.JTextField();
        txtSoDienThoai = new javax.swing.JTextField();
        btnLamMoi = new javax.swing.JButton();
        btnTimKiemHD = new javax.swing.JButton();
        btnTimKiemKH = new javax.swing.JButton();
        btnXemCTHD = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        spDanhSachKhachHang = new javax.swing.JScrollPane();
        tbDanhSachKhachHang = new javax.swing.JTable();
        spLichSuGiaoDich = new javax.swing.JScrollPane();
        tbLichSuGiaoDich = new javax.swing.JTable();

        pnThongTinKhachHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        lbMaKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbMaKhachHang.setText("Mã khách hàng: ");

        lbTenKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbTenKhachHang.setText("Tên khách hàng");

        lbSoDienThoai.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbSoDienThoai.setText("Số điện thoại:");

        txtMaKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtTenKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtSoDienThoai.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.setToolTipText("Làm mới lại form");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnTimKiemHD.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnTimKiemHD.setText("Tìm kiếm hoá đơn");
        btnTimKiemHD.setToolTipText("Tìm kiếm hoá đơn thông qua mã hoá đơn.");
        btnTimKiemHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemHDActionPerformed(evt);
            }
        });

        btnTimKiemKH.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnTimKiemKH.setText("Tìm kiếm khách hàng");
        btnTimKiemKH.setToolTipText("Tìm kiếm khách hàng thông qua mã khách hàng. ");
        btnTimKiemKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemKHActionPerformed(evt);
            }
        });

        btnXemCTHD.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnXemCTHD.setText("Chi tiết hoá đơn");
        btnXemCTHD.setToolTipText("show chi tiết hoá đơn của hoá đơn đã chọn.");
        btnXemCTHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemCTHDActionPerformed(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnThongTinKhachHangLayout = new javax.swing.GroupLayout(pnThongTinKhachHang);
        pnThongTinKhachHang.setLayout(pnThongTinKhachHangLayout);
        pnThongTinKhachHangLayout.setHorizontalGroup(
                pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnThongTinKhachHangLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnThongTinKhachHangLayout.createSequentialGroup()
                                                .addGroup(pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(lbTenKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lbSoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lbMaKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtSoDienThoai)
                                                        .addComponent(txtMaKhachHang)
                                                        .addComponent(txtTenKhachHang))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                                        .addComponent(btnThem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(pnThongTinKhachHangLayout.createSequentialGroup()
                                                .addComponent(btnLamMoi)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnTimKiemKH, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnTimKiemHD, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnXemCTHD)))
                                .addContainerGap())
        );
        pnThongTinKhachHangLayout.setVerticalGroup(
                pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnThongTinKhachHangLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbMaKhachHang)
                                        .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnThem))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbTenKhachHang)
                                        .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnXoa))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbSoDienThoai)
                                        .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSua))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnXemCTHD)
                                        .addComponent(btnLamMoi)
                                        .addComponent(btnTimKiemHD)
                                        .addComponent(btnTimKiemKH))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        spDanhSachKhachHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N
        spDanhSachKhachHang.setViewportView(tbDanhSachKhachHang);

        spLichSuGiaoDich.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lịch sử giao dịch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N
        spLichSuGiaoDich.setViewportView(tbLichSuGiaoDich);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(spDanhSachKhachHang)
                                        .addComponent(pnThongTinKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spLichSuGiaoDich, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(spLichSuGiaoDich, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(pnThongTinKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(spDanhSachKhachHang)))
                                .addContainerGap())
        );
    }// </editor-fold>

    // xử lí btn xem cthd
    private void btnXemCTHDActionPerformed(java.awt.event.ActionEvent evt) {
        HoaDonDTO hoaDonDTO = tbLichSuGiaoDichMouseListener();
        if (hoaDonDTO != null) {
            // gọi form chi tiết hoá đơn để xuất ra hoá đơn
            new DialogChiTietHoaDonGUI(new Frame(), true, hoaDonDTO).setVisible(true);
        }
    }

    // xử lí btn thêm
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {
        StringBuilder sb = new StringBuilder();
        try {
            _DataValidator.validateEmpty(txtMaKhachHang, sb, "Vui lòng nhập mã khách hàng");
            _DataValidator.validateEmpty(txtTenKhachHang, sb, "Vui lòng nhập tên khách hàng");
            _DataValidator.validateEmpty(txtSoDienThoai, sb, "Vui lòng nhập số điện thoại");
            _DataValidator.valitdateMaKH(txtMaKhachHang, sb, "Vui lòng kiểm tra lại cú pháp!\nMã khách hàng là KH + (xxx)[STT]");
            _DataValidator.valitdatePhoneNumber(txtSoDienThoai, sb, "Số điện thoại phải đúng format gồm 10 số và không chứa ký tự!");

            if (sb.length() > 0) {
                _MessageDialogHelper.showErrorDialog(parentForm, String.valueOf(sb), "Vui lòng kiểm tra lại");
            } else {
                // tạo mới đối tượng
                KhachHangDTO khachHangDTO = new KhachHangDTO();
                khachHangDTO.setMaKH(txtMaKhachHang.getText().trim());
                khachHangDTO.setTenKH(txtTenKhachHang.getText().trim());
                khachHangDTO.setSdt(txtSoDienThoai.getText().trim());

                KhachHangBUS check = new KhachHangBUS();
                // trường hợp khách hàng đã có sẵn trong CSDL và khách hàng đang offline
                if (check.checkStatusIsClose(khachHangDTO)) {
                    if (_MessageDialogHelper.showConfirmDialog(parentForm,
                            "Khách hàng này đã tồn tại trong CSDL và đang offline!\nBạn có muốn thay đổi trạng thái của đối tượng này không?",
                            "Online đối tượng") == JOptionPane.YES_OPTION) {
                        KhachHangBUS khachHangBUS = new KhachHangBUS();
                        if (khachHangBUS.updateChangeStatus(khachHangDTO, 1)) {
                            refreshData(); // làm mới lại dữ liệu trên form
                            _MessageDialogHelper.showMessageDialog(parentForm, "Thay đổi trạng thái thành công!", "Thành công");
                        } else {
                            _MessageDialogHelper.showErrorDialog(parentForm, "Thay đổi trạng thái thất bại!", "Thất bại");
                        }
                    }
                } else { // trường hợp ngược lại
                    if (_MessageDialogHelper.showConfirmDialog(parentForm,
                            "Bạn có muốn thêm mới đối tượng này không", "Thêm đối tượng") == JOptionPane.YES_OPTION) {
                        KhachHangBUS khachHangBUS = new KhachHangBUS();
                        if (khachHangBUS.insertItem(khachHangDTO)) {
                            refreshData(); // làm mới lại dữ liệu trên form
                            _MessageDialogHelper.showMessageDialog(parentForm, "Thêm đối tượng thành công!", "Thêm thành công");
                        } else {
                            _MessageDialogHelper.showErrorDialog(parentForm, "Đối tượng đã tồn tại trong CSDL!", "Thêm thất bại");
                        }
                    }
                }
            }
        } catch (Exception ex) {
            // trong trường hợp CSDL đã có dữ liệu của đối tượng
            ex.printStackTrace();
            _MessageDialogHelper.showErrorDialog(parentForm, "Thêm đối tượng thất bại!", "Failure Query Data");
        }
    }

    // xử lí btn xoá
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {
        KhachHangDTO khachHangDTO = tbDanhSachKhachHangMouseListener();
        if (khachHangDTO != null) {
            StringBuilder sb = new StringBuilder();
            try {
                if (sb.length() > 0) {
                    _MessageDialogHelper.showErrorDialog(parentForm, String.valueOf(sb), "Vui lòng kiểm tra lại");
                } else {
                    HoaDonBUS check = new HoaDonBUS();
                    // trường hợp khách hàng đã tồn tại trong danh sách bán hàng
                    if (check.checkKhachHangExist(khachHangDTO)) {
                        KhachHangBUS check2 = new KhachHangBUS();
                        // tiếp tục với trường hợp khách hàng có tồn tại trong danh sách khách hàng hay chưa
                        if (check2.checkStatusIsClose(khachHangDTO)) {
                            _MessageDialogHelper.showErrorDialog(parentForm, "Khách hàng đã bị ẩn!",
                                    "Thao tác thất bại");
                        } else {
                            if (_MessageDialogHelper.showConfirmDialog(parentForm,
                                    "Khách hàng này đã tồn tại trong lịch sử hoá đơn, bạn không thể xoá!\nBạn có muốn ẩn khách hàng này không!",
                                    "Ẩn đối tượng") == JOptionPane.YES_OPTION) {
                                KhachHangBUS khachHangBUS = new KhachHangBUS();
                                if (khachHangBUS.updateChangeStatus(khachHangDTO, 0)) {
                                    refreshData(); // làm mới lại dữ liệu trên form
                                    _MessageDialogHelper.showMessageDialog(parentForm, "Ẩn đối tượng thành công!", "Ẩn thành công");
                                } else {
                                    _MessageDialogHelper.showErrorDialog(parentForm, "Ẩn đối tượng thất bại!", "Ẩn thất bại");
                                }
                            }
                        }
                    } else { // trường hợp ngược lại
                        if (_MessageDialogHelper.showConfirmDialog(parentForm,
                                "Bạn có xoá đối tượng này không", "Xoá đối tượng") == JOptionPane.YES_OPTION) {
                            KhachHangBUS khachHangBUS = new KhachHangBUS();
                            if (khachHangBUS.deleteItem(khachHangDTO)) {
                                refreshData(); // làm mới lại dữ liệu trên form
                                _MessageDialogHelper.showMessageDialog(parentForm, "Xoá đối tượng thành công!", "Xoá thành công");
                            } else {
                                _MessageDialogHelper.showErrorDialog(parentForm, "Xoá đối tượng thất bại!", "Xoá thất bại");
                            }
                        }
                    }
                }
            } catch (Exception ex) {
                // trong trường hợp CSDL đã có dữ liệu của đối tượng
                ex.printStackTrace();
                _MessageDialogHelper.showErrorDialog(parentForm,
                        "Xoá đối tượng thất bại!", "Failure Query Data");
            }
        }
    }

    // xử lí btn sửa
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {
        StringBuilder sb = new StringBuilder();
        try {
            _DataValidator.validateEmpty(txtMaKhachHang, sb, "Vui lòng nhập mã khách hàng");
            _DataValidator.validateEmpty(txtTenKhachHang, sb, "Vui lòng nhập tên khách hàng");
            _DataValidator.validateEmpty(txtSoDienThoai, sb, "Vui lòng nhập số điện thoại");
            _DataValidator.valitdateMaKH(txtMaKhachHang, sb, "Vui lòng kiểm tra lại cú pháp!\nMã khách hàng là KH + (xxx)[STT]");
            _DataValidator.valitdatePhoneNumber(txtSoDienThoai, sb, "Số điện thoại phải đúng format gồm 10 số và không chứa ký tự!");

            if (sb.length() > 0) {
                _MessageDialogHelper.showErrorDialog(parentForm, String.valueOf(sb), "Vui lòng kiểm tra lại");
            } else {
                if (_MessageDialogHelper.showConfirmDialog(parentForm,
                        "Bạn có muốn thay đổi thông tin đối tượng này không", "Sửa thông tin đối tượng") == JOptionPane.YES_OPTION) {
                    // tạo mới đối tượng
                    KhachHangDTO khachHangDTO = new KhachHangDTO();
                    khachHangDTO.setMaKH(txtMaKhachHang.getText().trim());
                    khachHangDTO.setTenKH(txtTenKhachHang.getText().trim());
                    khachHangDTO.setSdt(txtSoDienThoai.getText().trim());

                    KhachHangBUS khachHangBUS = new KhachHangBUS();
                    if (khachHangBUS.updateItem(khachHangDTO)) {
                        refreshData(); // làm mới lại dữ liệu trên form
                        _MessageDialogHelper.showMessageDialog(parentForm,
                                "Sửa thông tin đối tượng thành công!", "Sửa thành công");
                    } else {
                        _MessageDialogHelper.showErrorDialog(parentForm,
                                "Sửa thông tin đối tượng thất bại!", "Sửa thất bại");
                    }
                }
            }
        } catch (Exception ex) {
            // trong trường hợp CSDL đã có dữ liệu của đối tượng
            ex.printStackTrace();
            _MessageDialogHelper.showErrorDialog(parentForm, "Sửa đối tượng thất bại!", "Failure Query Data");
        }
    }

    // xử lí btn làm mới
    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {
        refreshData();
    }

    // xử lí btn tìm kiếm KH
    private void btnTimKiemKHActionPerformed(java.awt.event.ActionEvent evt) {
        new DialogTimKiemGUI(new Frame(), true, "KH").setVisible(true); // mở form tìm kiếm
        KhachHangDTO khachHangDTO = _SaveData.khachHangTimThay;
        if (khachHangDTO != null) {
            ArrayList<HoaDonDTO> listHoaDon = new HoaDonBUS().fillData(khachHangDTO.getMaKH(), "KH");
            ArrayList<KhachHangDTO> listKH = new ArrayList<>(); // tạo mới danh sách khách hàng
            listKH.add(khachHangDTO); // add khách hàng vừa tìm được vào danh sách

            loadTableKH(listKH); // khởi tạo lại table khách hàng
            loadHoaDon(listHoaDon); // load lại lịch sử mua hàng của khách hàng được chọn

            // load các thông tin của khách hàng lên text field
            loadForm(khachHangDTO);

            // reset lại data tìm kiếm trong local
            _SaveData.khachHangTimThay = null;
        }
    }

    // xử lí btn tìm kiếm HD
    private void btnTimKiemHDActionPerformed(java.awt.event.ActionEvent evt) {
        KhachHangDTO khachHangDTO = tbDanhSachKhachHangMouseListener();
        if (khachHangDTO != null) {
            new DialogTimKiemGUI(new Frame(), true, "HD").setVisible(true); // mở form tìm kiếm
            HoaDonDTO hoaDonDTO = _SaveData.hoaDonTimThay;
            if (hoaDonDTO != null) {
                ArrayList<HoaDonDTO> listHD = new ArrayList<>(); // tạo mới danh sách hoá đơn
                listHD.add(hoaDonDTO); // add hoá đơn vừa tìm được vào danh sách
                loadHoaDon(listHD); // load lại lịch sử mua hàng của khách hàng được chọn

                // reset lại data tìm kiếm trong local
                _SaveData.hoaDonTimThay = null;
            }
        }
    }

    // xử lí sự kiện click chuột vào table danh sách khách hàng => trả về đối tượng khách hàng được click
    private KhachHangDTO tbDanhSachKhachHangMouseListener() {
        try {
            int selectedRow = tbDanhSachKhachHang.getSelectedRow();
            String idKH = String.valueOf(tbDanhSachKhachHang.getValueAt(selectedRow, 0));
            KhachHangDTO khachHangDTO = new KhachHangBUS().getItemById(idKH);

            if (khachHangDTO != null) {
                // load thông tin lên field
                loadForm(khachHangDTO);

                // load lịch sử mua sắm lên tb
                loadHoaDon(new HoaDonBUS().fillData(idKH, "KH")); // load lại lịch sử mua hàng
                return khachHangDTO; // trả về khách hàng được nhấn vào
            } else {
                return null;
            }
        } catch (Exception ex) {
            _MessageDialogHelper.showErrorDialog(parentForm,
                    "Vui lòng chọn một dòng trong danh sách khách hàng!", "Yêu cầu chọn dữ liệu");
            return null;
        }
    }

    // xử lí sự kiện click chuột vào table danh sách hoá đơn => trả về đối tượng hoá đơn được click
    private HoaDonDTO tbLichSuGiaoDichMouseListener() {
        try {
            int selectedRow = tbLichSuGiaoDich.getSelectedRow();
            String idHD = String.valueOf(tbLichSuGiaoDich.getValueAt(selectedRow, 0));
            return new HoaDonBUS().getItemBymMaHD(idHD);
        } catch (Exception ex) {
            _MessageDialogHelper.showErrorDialog(parentForm,
                    "Vui lòng chọn một dòng trong lịch sử giao dịch!", "Yêu cầu chọn dữ liệu");
            return null;
        }
    }

    //===================================================================================================//
    // hàm load lại table hoá đơn
    private void loadHoaDon(ArrayList<HoaDonDTO> listHoaDon) {
        modelTable_HD.setRowCount(0);
        for (HoaDonDTO item : listHoaDon) {
            modelTable_HD.addRow(new Object[]{
                    item.getMaHD(),
                    item.getMaNV(),
                    item.getMaKH(),
                    item.getMaGiamGia(),
                    item.getTongHoaDon(),
                    item.getNgayBan(),
            });
        }
    }

    // hàm load lại table khách hàng
    private void loadTableKH(ArrayList<KhachHangDTO> listKhachHang) {
        modelTable_KH.setRowCount(0);
        for (KhachHangDTO item : listKhachHang) {
            modelTable_KH.addRow(new Object[]{
                    item.getMaKH(),
                    item.getTenKH(),
                    item.getSdt(),
                    item.getStatus() == 1 ? "Online" : "Offline"
            });
        }
    }

    // hàm load các txt
    private void loadForm(KhachHangDTO khachHangDTO) {
        txtMaKhachHang.setText(khachHangDTO.getMaKH());
        txtTenKhachHang.setText(khachHangDTO.getTenKH());
        txtSoDienThoai.setText(khachHangDTO.getSdt());
    }

    // làm mới lại text field và data
    private void refreshData() {
        txtMaKhachHang.setText(""); // refresh form mã khách hàng
        txtTenKhachHang.setText(""); // refresh form tên khách hàng
        txtSoDienThoai.setText(""); // refresh form số điện thoại
        tbDanhSachKhachHang.clearSelection(); // refresh selected danh sách khách hàng

        // set Background
        txtMaKhachHang.setBackground(Color.WHITE);
        txtTenKhachHang.setBackground(Color.WHITE);
        txtSoDienThoai.setBackground(Color.WHITE);

        // set Foreground
        txtMaKhachHang.setForeground(Color.BLACK);
        txtTenKhachHang.setForeground(Color.BLACK);
        txtSoDienThoai.setForeground(Color.BLACK);

        loadTableKH(new KhachHangBUS().getData()); // load lại khách hàng
        loadHoaDon(new ArrayList<>()); // load lại hoá đơn
    }


    // Variables declaration - do not modify
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiemHD;
    private javax.swing.JButton btnTimKiemKH;
    private javax.swing.JButton btnXemCTHD;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel lbMaKhachHang;
    private javax.swing.JLabel lbSoDienThoai;
    private javax.swing.JLabel lbTenKhachHang;
    private javax.swing.JPanel pnThongTinKhachHang;
    private javax.swing.JScrollPane spDanhSachKhachHang;
    private javax.swing.JScrollPane spLichSuGiaoDich;
    private javax.swing.JTable tbDanhSachKhachHang;
    private javax.swing.JTable tbLichSuGiaoDich;
    private javax.swing.JTextField txtMaKhachHang;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTenKhachHang;
    // End of variables declaration
}
