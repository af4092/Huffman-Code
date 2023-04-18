package org.example.HuffmanCode;

import java.util.Scanner;

import static org.example.HuffmanCode.Main.*;

public class HuffmanCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = input.nextLine();

        int[] counts = getCharacterFrequency(text);
        System.out.printf("%-15s%-15s%-15s%-15s\n", "ASCII Code, ",
                "Character", "Frequency", "Code");

        Main.Tree tree = getHuffmanTree(counts);
        String[] codes = getCode(tree.root);

        for(int i=0; i<codes.length; i++)
            if(counts[i] != 0)
                System.out.printf("%-15d%-15s%-15d%-15s\n",
                        i, (char)i + "", counts[i], codes[i]);
    }
}
