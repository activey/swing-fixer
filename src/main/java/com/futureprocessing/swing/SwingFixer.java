package com.futureprocessing.swing;

import java.awt.Component;

public class SwingFixer {
    
    public static void fixIt(Component component) {
        component.repaint();
        component.revalidate();
    }
}
