import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class QueueSimulation extends JFrame {
    private JTable queueTable;
    private DefaultTableModel tableModel;
    private JTextField nameField;
    private JLabel statusLabel;

    // Simpan data antrian
    private ArrayList<String> queue = new ArrayList<>();

    public QueueSimulation() {
        setTitle("Simulasi Sistem Antrian");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel utama
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Label Status
        statusLabel = new JLabel("Status: Menunggu input...");
        mainPanel.add(statusLabel, BorderLayout.SOUTH);

        // Tabel untuk antrian
        String[] columnNames = {"Nama", "Status"};
        tableModel = new DefaultTableModel(columnNames, 0);
        queueTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(queueTable);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // Panel Input
        JPanel inputPanel = new JPanel(new FlowLayout());
        JLabel nameLabel = new JLabel("Nama:");
        nameField = new JTextField(15);
        JButton addButton = new JButton("Tambah");
        JButton serveButton = new JButton("Layani");
        JButton deleteButton = new JButton("Hapus");

        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(addButton);
        inputPanel.add(serveButton);
        inputPanel.add(deleteButton);
        mainPanel.add(inputPanel, BorderLayout.NORTH);

        // Tambahkan listener ke tombol
        addButton.addActionListener(e -> addCustomer());
        serveButton.addActionListener(e -> serveCustomer());
        deleteButton.addActionListener(e -> deleteCustomer());

        // Atur panel utama
        add(mainPanel);
    }

    // Tambah pelanggan ke antrian
    private void addCustomer() {
        String name = nameField.getText().trim();

        try {
            if (name.isEmpty()) {
                throw new IllegalArgumentException("Nama tidak boleh kosong!");
            }

            if (queue.contains(name)) {
                throw new IllegalArgumentException("Nama pelanggan sudah ada di antrian!");
            }

            // Tambahkan ke data antrian dan tabel
            queue.add(name);
            tableModel.addRow(new Object[]{name, "Menunggu"});
            nameField.setText("");
            statusLabel.setText("Status: Pelanggan '" + name + "' ditambahkan ke antrian.");
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Layani pelanggan pertama dalam antrian
    private void serveCustomer() {
        try {
            if (queue.isEmpty()) {
                throw new IllegalStateException("Antrian kosong! Tidak ada pelanggan yang dapat dilayani.");
            }

            // Ambil pelanggan pertama
            String name = queue.remove(0);
            tableModel.removeRow(0);
            statusLabel.setText("Status: Melayani pelanggan '" + name + "'.");
        } catch (IllegalStateException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Hapus pelanggan dari antrian
    private void deleteCustomer() {
        int selectedRow = queueTable.getSelectedRow();

        try {
            if (selectedRow == -1) {
                throw new IllegalArgumentException("Pilih pelanggan yang ingin dihapus!");
            }

            // Hapus pelanggan dari data dan tabel
            String name = (String) tableModel.getValueAt(selectedRow, 0);
            queue.remove(name);
            tableModel.removeRow(selectedRow);
            statusLabel.setText("Status: Pelanggan '" + name + "' dihapus dari antrian.");
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Selection Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            QueueSimulation app = new QueueSimulation();
            app.setVisible(true);
        });
    }
}
