import javax.swing.*;
import javax.swing.tree.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

//tạo JFrame chứa JPanel
//-->tạo JFrame
public class Folder_Java_Frame extends JFrame {
      /**
      *
      */
      private static final long serialVersionUID = 1L;
      JButton btn_open_folder, btn_add_file, btn_add_folder, btn_delete, btn_rename, btn_coppy, btn_move;
      public static JTextField txt_add, txt_rename;
      JLabel lb_add, lb_rename, lb_console;
      public static JLabel lb_type_text;
      public String fileName;
      private Container container = this.getContentPane();

      public Folder_Java_Frame(String title) {
            super(title);
            // button
            btn_open_folder = new JButton();
            btn_open_folder.setText("Open Folder");
            btn_open_folder.setVerticalAlignment(SwingConstants.CENTER);
            // btn_open_folder.setMargin(new java.awt.Insets(2, 14, 50, 14));
            btn_open_folder.setHorizontalAlignment(SwingConstants.CENTER);
            // btn_open_folder.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
            getContentPane().add(btn_open_folder);
            btn_open_folder.setBounds(200, 600, 200, 100);
            btn_open_folder.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        open_chooser();
                  }
            });
            // button thêm File
            btn_add_file = new JButton("Thêm File");
            btn_add_file.setEnabled(false);
            btn_add_file.setVerticalAlignment(SwingConstants.CENTER);
            btn_add_file.setHorizontalAlignment(SwingConstants.CENTER);
            getContentPane().add(btn_add_file);
            btn_add_file.setBounds(700, 100, 120, 30);
            btn_add_file.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        try {
                              File file_choice = new File(My_JPanel.getselect());
                              String name_file = txt_add.getText();
                              File create_file = new File(file_choice.getAbsolutePath() + "\\" + name_file);
                              Boolean haved = create_file.exists();
                              Folder_Java_Frame new_Folder_Java_Frame;

                              if (file_choice.isDirectory()) {
                                    if (!name_file.isEmpty() && name_file != "" && !haved) {
                                          create_file.createNewFile();
                                          String path_folder = create_file.getParent();
                                          // đổi thành công mở frame mới
                                          new_Folder_Java_Frame = new Folder_Java_Frame(path_folder);
                                          // hiển thị form giữa màn hình
                                          new_Folder_Java_Frame.setLocationRelativeTo(null);
                                          My_JPanel panel = new My_JPanel(path_folder);
                                          setVisible(false);

                                          new_Folder_Java_Frame.add(panel);
                                          new_Folder_Java_Frame.lb_console
                                                      .setText("Đã thêm file " + create_file.getAbsolutePath());

                                          // enable button
                                          new_Folder_Java_Frame.btn_add_file.setEnabled(true);
                                          new_Folder_Java_Frame.btn_add_folder.setEnabled(true);
                                          new_Folder_Java_Frame.btn_rename.setEnabled(true);
                                          new_Folder_Java_Frame.btn_coppy.setEnabled(true);
                                          new_Folder_Java_Frame.btn_move.setEnabled(true);
                                          new_Folder_Java_Frame.btn_delete.setEnabled(true);

                                    } else {
                                          lb_console.setText("Không thêm được file");
                                    }
                              } else {
                                    lb_console.setText("Không thêm được file");
                              }
                        } catch (Exception e) {
                              // TODO: handle exception
                              System.out.println(e.getMessage());
                        }
                  }
            });
            // button thêm folder
            btn_add_folder = new JButton("Thêm thư mục");
            btn_add_folder.setEnabled(false);

            btn_add_folder.setVerticalAlignment(SwingConstants.CENTER);
            btn_add_folder.setHorizontalAlignment(SwingConstants.CENTER);
            getContentPane().add(btn_add_folder);
            btn_add_folder.setBounds(830, 100, 120, 30);
            btn_add_folder.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        try {
                              File file_choice = new File(My_JPanel.getselect());
                              String name_file = txt_add.getText();
                              File create_file = new File(file_choice.getAbsolutePath() + "\\" + name_file);
                              Boolean haved = create_file.exists();
                              Folder_Java_Frame new_Folder_Java_Frame;

                              if (file_choice.isDirectory()) {
                                    if (!name_file.isEmpty() && name_file != "" && !haved) {
                                          create_file.mkdir();
                                          String path_folder = create_file.getParent();
                                          // đổi thành công mở frame mới
                                          new_Folder_Java_Frame = new Folder_Java_Frame(path_folder);
                                          // hiển thị form giữa màn hình
                                          new_Folder_Java_Frame.setLocationRelativeTo(null);
                                          My_JPanel panel = new My_JPanel(path_folder);
                                          setVisible(false);

                                          new_Folder_Java_Frame.add(panel);
                                          new_Folder_Java_Frame.lb_console
                                                      .setText("Đã thêm folder " + create_file.getAbsolutePath());

                                          // enable button
                                          new_Folder_Java_Frame.btn_add_file.setEnabled(true);
                                          new_Folder_Java_Frame.btn_add_folder.setEnabled(true);
                                          new_Folder_Java_Frame.btn_rename.setEnabled(true);
                                          new_Folder_Java_Frame.btn_coppy.setEnabled(true);
                                          new_Folder_Java_Frame.btn_move.setEnabled(true);
                                          new_Folder_Java_Frame.btn_delete.setEnabled(true);

                                    } else {
                                          lb_console.setText("Không thêm được folder");
                                    }
                              }
                        } catch (Exception e) {
                              // TODO: handle exception
                              System.out.println(e.getMessage());
                        }
                  }

            });
            // button xóa
            btn_delete = new JButton("Xóa");
            btn_delete.setEnabled(false);
            btn_delete.setVerticalAlignment(SwingConstants.CENTER);
            btn_delete.setHorizontalAlignment(SwingConstants.CENTER);
            getContentPane().add(btn_delete);
            btn_delete.setBounds(700, 160, 250, 30);
            btn_delete.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        try {
                              File file_delete = new File(My_JPanel.getselect());
                              Folder_Java_Frame new_Folder_Java_Frame;
                              // getTitle() là path thư mục đang mở mục gốc

                              if (file_delete.exists() && file_delete.getAbsolutePath() != getTitle()) {

                                    String file_ = file_delete.getParent();
                                    // lấy tên file đã xóa
                                    String file_deleted = file_delete.getAbsolutePath();
                                    // delete
                                    deleteFolder(file_delete);

                                    // đổi thành công mở frame mới
                                    new_Folder_Java_Frame = new Folder_Java_Frame(file_);
                                    // hiển thị form giữa màn hình
                                    new_Folder_Java_Frame.setLocationRelativeTo(null);
                                    My_JPanel panel = new My_JPanel(file_);
                                    setVisible(false);

                                    new_Folder_Java_Frame.add(panel);
                                    new_Folder_Java_Frame.lb_console.setText("Đã xóa " + file_deleted);

                                    // enable button
                                    new_Folder_Java_Frame.btn_add_file.setEnabled(true);
                                    new_Folder_Java_Frame.btn_add_folder.setEnabled(true);
                                    new_Folder_Java_Frame.btn_rename.setEnabled(true);
                                    new_Folder_Java_Frame.btn_coppy.setEnabled(true);
                                    new_Folder_Java_Frame.btn_move.setEnabled(true);
                                    new_Folder_Java_Frame.btn_delete.setEnabled(true);
                              } else {
                                    lb_console.setText("Không được xóa mục gốc");
                              }

                        } catch (Exception e) {
                              // TODO: handle exception
                              System.out.println(e.getMessage());
                        }

                  }

            });

            // button đổi tên
            btn_rename = new JButton("Đổi tên");
            btn_rename.setEnabled(false);
            btn_rename.setVerticalAlignment(SwingConstants.CENTER);
            btn_rename.setHorizontalAlignment(SwingConstants.CENTER);
            getContentPane().add(btn_rename);
            btn_rename.setBounds(700, 260, 250, 30);
            btn_rename.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {

                        try {
                              String fileName = txt_rename.getText();
                              // gọi lại MyPanel.getslect thì txt_rename.getText sẽ trở lại tên cũ
                              // nên thêm 1 biến string lấy txt_rename text trc khi thực hiện hàm
                              // MY_janel.getslect
                              String file;
                              Folder_Java_Frame new_Folder_Java_Frame;
                              File old = new File(My_JPanel.getselect());
                              txt_rename.setText("");

                              if ((fileName != old.getName()) && (!fileName.isEmpty()) && (fileName != "")) {

                                    File new_f = new File(old.getParent() + "\\" + fileName);
                                    if (old.renameTo(new_f)) {
                                          file = new_f.getParent();
                                          // đổi thành công mở frame mới
                                          new_Folder_Java_Frame = new Folder_Java_Frame(file);
                                          // hiển thị form giữa màn hình
                                          new_Folder_Java_Frame.setLocationRelativeTo(null);
                                          My_JPanel panel = new My_JPanel(file);
                                          setVisible(false);

                                          new_Folder_Java_Frame.add(panel);
                                          new_Folder_Java_Frame.lb_console.setText("Đổi tên thành công");

                                          // enable button
                                          new_Folder_Java_Frame.btn_add_file.setEnabled(true);
                                          new_Folder_Java_Frame.btn_add_folder.setEnabled(true);
                                          new_Folder_Java_Frame.btn_rename.setEnabled(true);
                                          new_Folder_Java_Frame.btn_coppy.setEnabled(true);
                                          new_Folder_Java_Frame.btn_move.setEnabled(true);
                                          new_Folder_Java_Frame.btn_delete.setEnabled(true);

                                    } else {

                                          lb_console.setText("Đổi tên thất bại");
                                    }

                              } else {
                                    lb_console.setText("Tên không hợp lệ");

                              }

                              // System.out.println(getTitle());
                              //
                              My_JPanel.reload();

                        } catch (Exception e) {
                              // TODO: handle exception
                              System.out.println(e.getMessage());
                        }

                  }
            });
            // button Coppy
            btn_coppy = new JButton("COPPY");
            btn_coppy.setEnabled(false);
            btn_coppy.setVerticalAlignment(SwingConstants.CENTER);
            btn_coppy.setHorizontalAlignment(SwingConstants.CENTER);
            getContentPane().add(btn_coppy);
            btn_coppy.setBounds(700, 320, 250, 30);
            btn_coppy.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        try {
                              // lấy file được chọn
                              File file_choice = new File(My_JPanel.getselect());

                              // coppy
                              open_chooser_coppy(file_choice);

                        } catch (Exception e) {
                              // TODO: handle exception
                              System.out.println(e.getMessage());
                        }
                  }
            });
            // button Move
            btn_move = new JButton("MOVIE");
            btn_move.setEnabled(false);
            btn_move.setVerticalAlignment(SwingConstants.CENTER);
            btn_move.setHorizontalAlignment(SwingConstants.CENTER);
            getContentPane().add(btn_move);
            btn_move.setBounds(700, 380, 250, 30);
            btn_move.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        try {
                              File file_choice = new File(My_JPanel.getselect());
                              open_chooser_move(file_choice);
                        } catch (Exception e) {
                              // TODO: handle exception
                        }
                  }
            });
            // text_add
            txt_add = new JTextField(20);
            getContentPane().add(txt_add);
            txt_add.setBounds(700, 40, 250, 30);
            // text_rename
            txt_rename = new JTextField(20);
            getContentPane().add(txt_rename);
            txt_rename.setBounds(700, 210, 250, 30);
            // label_type
            JLabel lb_type = new JLabel("Type : ");
            getContentPane().add(lb_type);
            lb_type.setBounds(600, 0, 100, 30);
            // label_type text :
            lb_type_text = new JLabel("");
            getContentPane().add(lb_type_text);
            lb_type_text.setBounds(700, 0, 100, 30);
            // label_add
            lb_add = new JLabel("New : ");
            getContentPane().add(lb_add);
            lb_add.setBounds(600, 40, 100, 30);
            // label_rename
            lb_rename = new JLabel("Rename : ");
            getContentPane().add(lb_rename);
            lb_rename.setBounds(600, 210, 100, 30);
            // label_console
            lb_console = new JLabel("");
            getContentPane().add(lb_console);
            lb_console.setBounds(520, 450, 400, 60);
            // label_name_athu
            JLabel lb_authu = new JLabel("By : Sơn Bá");
            getContentPane().add(lb_authu);
            lb_authu.setBounds(700, 650, 200, 60);

            getContentPane().setLayout(null);
            setSize(1000, 750);
            // pack();
            setVisible(true);
            // thoát
            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);// JFrame.DO_NOTHING_ON_CLOSE
            // addWindowListener(new WindowCloser());
      }

      // delete folder
      void deleteFolder(File file) {
            if (file.isDirectory()) {
                  // liet ke tat ca thu muc va file
                  String[] files = file.list();
                  for (String child : files) {
                        File childDir = new File(file, child);
                        if (childDir.isDirectory()) {
                              // neu childDir la thu muc thi goi lai phuong thuc deleteDir()
                              deleteFolder(childDir);
                        } else {
                              // neu childDir la file thi xoa
                              childDir.delete();
                              // System.out.println("File bi da bi xoa " + childDir.getAbsolutePath());
                        }
                  }
                  // Check lai va xoa thu muc cha
                  if (file.list().length == 0) {
                        file.delete();
                        // System.out.println("File bi da bi xoa " + file.getAbsolutePath());
                  }

            } else {
                  // neu file la file thi xoa
                  file.delete();
                  // System.out.println("File bi da bi xoa " + file.getAbsolutePath());
            }
      }

      void open_chooser() {
            // tạo đối tượng j chooser file để hiển thị hộp thoại mở tệp tin
            JFileChooser chooser = new JFileChooser();

            chooser.setSize(600, 600);
            // mở thư mực hiện hành
            chooser.setCurrentDirectory(new java.io.File("."));
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            // tiêu đề của hợp thoại
            chooser.setDialogTitle("open file demo");
            // nếu đã chọn tệp tin
            if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                  // lấy tệp tin đã chọn
                  fileName = chooser.getSelectedFile().getAbsolutePath();

                  System.out.println(fileName);
                  //
                  My_JPanel panel = new My_JPanel(fileName);
                  setVisible(false);
                  Folder_Java_Frame new_Folder_Java_Frame = new Folder_Java_Frame(fileName);
                  // hiển thị form giữa màn hình
                  new_Folder_Java_Frame.setLocationRelativeTo(null);
                  new_Folder_Java_Frame.fileName = fileName;
                  new_Folder_Java_Frame.add(panel);

                  // enable button
                  new_Folder_Java_Frame.btn_add_file.setEnabled(true);
                  new_Folder_Java_Frame.btn_add_folder.setEnabled(true);
                  new_Folder_Java_Frame.btn_rename.setEnabled(true);
                  new_Folder_Java_Frame.btn_coppy.setEnabled(true);
                  new_Folder_Java_Frame.btn_move.setEnabled(true);
                  new_Folder_Java_Frame.btn_delete.setEnabled(true);

            }
      }

      void open_chooser_coppy(File f) throws IOException {
            JFileChooser chooser = new JFileChooser();
            String type_file = (f.isDirectory()) ? " thư mục " : " tệp tin ";
            // File srcDir = new File("D:/Work/java");
            // File destDir = new File("D:/work/javanew");

            chooser.setSize(600, 600);
            // mở thư mực hiện hành
            chooser.setCurrentDirectory(new java.io.File("."));
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            // tiêu đề của hợp thoại
            chooser.setDialogTitle("Chọn thư mục để dán");
            // nếu đã chọn tệp tin
            if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                  // lấy tệp tin đã chọn(cần di chuyển tới)
                  // tạo đường dẫn mới
                  File destDir = new File(chooser.getSelectedFile().getAbsolutePath() + "\\" + f.getName());
                  if (!destDir.exists()) {

                        // copy
                        copydir(f, destDir);
                        // mở lại thư mục or file đã copy
                        My_JPanel panel = new My_JPanel(destDir.getAbsolutePath());
                        setVisible(false);
                        Folder_Java_Frame new_Folder_Java_Frame = new Folder_Java_Frame(destDir.getAbsolutePath());
                        // hiển thị form giữa màn hình
                        new_Folder_Java_Frame.setLocationRelativeTo(null);
                        new_Folder_Java_Frame.fileName = destDir.getAbsolutePath();
                        new_Folder_Java_Frame.add(panel);
                        // thông báo thành công
                        new_Folder_Java_Frame.lb_console.setText("sao chép thành công  " + type_file
                                    + f.getAbsolutePath() + " sang " + destDir.getAbsolutePath());

                        // enable button
                        new_Folder_Java_Frame.btn_add_file.setEnabled(true);
                        new_Folder_Java_Frame.btn_add_folder.setEnabled(true);
                        new_Folder_Java_Frame.btn_rename.setEnabled(true);
                        new_Folder_Java_Frame.btn_coppy.setEnabled(true);
                        new_Folder_Java_Frame.btn_move.setEnabled(true);
                        new_Folder_Java_Frame.btn_delete.setEnabled(true);

                  } else {
                        lb_console.setText("sao chép không thành công");
                  }
            } else {
                  lb_console.setText("sao chép không thành công");
            }
      }

      // move file or folder
      void open_chooser_move(File f) throws IOException {
            JFileChooser chooser = new JFileChooser();
            String type_file = (f.isDirectory()) ? " thư mục " : " tệp tin ";
            // File srcDir = new File("D:/Work/java");
            // File destDir = new File("D:/work/javanew");

            chooser.setSize(600, 600);
            // mở thư mực hiện hành
            chooser.setCurrentDirectory(new java.io.File("."));
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            // tiêu đề của hợp thoại
            chooser.setDialogTitle("Chọn thư mục để dán");
            // nếu đã chọn tệp tin
            if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                  // lấy tệp tin đã chọn(cần di chuyển tới)
                  // tạo đường dẫn mới
                  File destDir = new File(chooser.getSelectedFile().getAbsolutePath() + "\\" + f.getName());
                  if (!destDir.exists()) {

                        // copy
                        copydir(f, destDir);
                        // xóa file cũ (f)
                        deleteFolder(f);
                        // mở lại thư mục or file đã copy
                        My_JPanel panel = new My_JPanel(destDir.getAbsolutePath());
                        setVisible(false);
                        Folder_Java_Frame new_Folder_Java_Frame = new Folder_Java_Frame(destDir.getAbsolutePath());
                        // hiển thị form giữa màn hình
                        new_Folder_Java_Frame.setLocationRelativeTo(null);
                        new_Folder_Java_Frame.fileName = destDir.getAbsolutePath();
                        new_Folder_Java_Frame.add(panel);
                        // thông báo thành công
                        new_Folder_Java_Frame.lb_console.setText("di chuyển thành công  " + type_file
                                    + f.getAbsolutePath() + " sang " + destDir.getAbsolutePath());

                        // enable button
                        new_Folder_Java_Frame.btn_add_file.setEnabled(true);
                        new_Folder_Java_Frame.btn_add_folder.setEnabled(true);
                        new_Folder_Java_Frame.btn_rename.setEnabled(true);
                        new_Folder_Java_Frame.btn_coppy.setEnabled(true);
                        new_Folder_Java_Frame.btn_move.setEnabled(true);
                        new_Folder_Java_Frame.btn_delete.setEnabled(true);

                  } else {
                        lb_console.setText("di chuyển không thành công");
                  }
            } else {
                  lb_console.setText("di chuyên không thành công");
            }
      }

      // coppy folder
      public void copydir(File src, File dest) throws IOException {

            if (src.isDirectory()) {

                  // if directory not exists, create it
                  if (!dest.exists()) {
                        dest.mkdir();
                  }

                  // list all the directory contents
                  String files[] = src.list();

                  for (String fileName : files) {
                        // construct the src and dest file structure
                        File srcFile = new File(src, fileName);
                        File destFile = new File(dest, fileName);
                        // recursive copy
                        copydir(srcFile, destFile);
                  }

            } else {
                  // If file, then copy it
                  fileCopy(src, dest);
            }
      }

      // copy file
      private void fileCopy(File src, File dest) throws FileNotFoundException, IOException {

            InputStream in = null;
            OutputStream out = null;

            try {
                  // If file, then copy it
                  in = new FileInputStream(src);
                  out = new FileOutputStream(dest);

                  byte[] buffer = new byte[1024];

                  int length;
                  // Copy the file content in bytes
                  while ((length = in.read(buffer)) > 0) {
                        out.write(buffer, 0, length);
                  }

            } finally {
                  if (in != null) {
                        in.close();
                  }
                  if (out != null) {
                        out.close();
                  }
            }
      }

      public static void main(String s[]) {
            new Folder_Java_Frame("Chọn một thư mục").setLocationRelativeTo(null);
            // hiển thị form ra giữa màn hình

      }
}

/**
 * MyJpanel
 */
class My_JPanel extends JPanel {
      /**
      *
      */
      private static final long serialVersionUID = 1L;
      public static JTree tree;
      public static String select;
      public static DefaultMutableTreeNode root;
      //
      public static DefaultTreeModel model;

      My_JPanel(String path_folder) {
            setBounds(0, 0, 500, 500);

            root = new DefaultMutableTreeNode("root", true);
            getList(root, new File(path_folder));
            setLayout(new BorderLayout()); //
            tree = new JTree(root);

            tree.setRootVisible(false);
            // thêm jscrollpane
            add(new JScrollPane((JTree) tree), "Center");
            // get select node
            tree.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        getselect();
                  }
            });
      }

      // lấy phần tử chọn
      public static String getselect() {
            TreeSelectionModel smd = tree.getSelectionModel();
            if (smd.getSelectionCount() > 0) {

                  DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree.getSelectionPath()
                              .getLastPathComponent();
                  select = selectedNode.getUserObject().toString();
                  File select_f = new File(select);
                  String type_file = select_f.isDirectory() ? "Thư mục" : "File";
                  Folder_Java_Frame.lb_type_text.setText(type_file);
                  Folder_Java_Frame.txt_rename.setText(new File(select).getName());

                  return select;
            }
            return null;

      }

      // reload tree
      public static void reload() {
            model = (DefaultTreeModel) tree.getModel();
            model.reload();
      }

      // set kich thươc tối đa
      public Dimension getPreferredSize() {
            return new Dimension(300, 600);
      }

      // getlist (tạo tree)
      public void getList(DefaultMutableTreeNode node, File f) {
            if (!f.isDirectory()) {
                  DefaultMutableTreeNode child = new DefaultMutableTreeNode(f);
                  node.add(child);
            } else {
                  DefaultMutableTreeNode child = new DefaultMutableTreeNode(f);
                  node.add(child);
                  File fList[] = f.listFiles();
                  for (int i = 0; i < fList.length; i++)
                        getList(child, fList[i]);
            }
      }

}