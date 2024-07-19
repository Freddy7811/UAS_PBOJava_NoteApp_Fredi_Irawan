/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.asia.uas_pbojava.noteapp_fredi_irawan;

import com.asia.uas_pbojava.noteapp_fredi_irawan.db.NoteAppMenu;


/**
 *
 * @author Fredi Irawan
 */
public class Main{

    public static void main(String[] args) {
        NoteAppMenu noteapp = new NoteAppMenu("notes.db");
        noteapp.start();
    }
}
