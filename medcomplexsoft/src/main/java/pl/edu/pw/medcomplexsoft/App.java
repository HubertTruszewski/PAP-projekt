package pl.edu.pw.medcomplexsoft;

import javax.swing.JFrame;

import pl.edu.pw.medcomplexsoft.gui.LoginWindow;


public class App
{
    public static void main( String[] args )
    {
        JFrame login = new LoginWindow();
        login.setVisible(true);
    }
}
