/* @author: Alexis Molina */
package com.example.hw1_facemaker;

import java.util.Random;
public class Face {
    int skinColor;
    int eyeColor;
    int hairColor;
    int hairStyle;

    public void Face(int skinColor, int eyeColor, int hairColor, int hairStyle) {
        randomize();
        if (hairStyle == 0) {
        //eyeStyle =
        }
        else if (hairStyle ==1) {
            //eyeStyle =
        }
        else if (hairStyle ==2) {
        //eyeStyle =
        }

    }

    public void randomize() {
    Random rand = new Random();
    int a = (int) Math.random()*3; //three options
    this.hairStyle = a;
    int b = (int) Math.random()*4; // 4 options for hair color
    this.hairColor= b;

    int c = (int) Math.random()*3; // three different eyecolors
    }
}

