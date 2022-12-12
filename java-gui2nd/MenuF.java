import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

import java.awt.Frame;

class MenuF extends Frame {

    Menu file, edit, n;
    MenuBar bar;
    MenuItem save, exit, java, c;

    public MenuF() {
        setTitle("First-Menu");
        setSize(400, 500);
        bar = new MenuBar();
        setMenuBar(bar);
        file = new Menu("file");
        bar.add(file);
        edit = new Menu("edit");
        bar.add(edit);
        n = new Menu("new");
        file.add(n);
        save = new MenuItem("save");
        file.add(save);
        file.addSeparator();
        exit = new MenuItem("exit");
        file.add(exit);
        java = new MenuItem("java");
        edit.add(java);
        c = new MenuItem("c");
        edit.add(c);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new MenuF();
    }
}