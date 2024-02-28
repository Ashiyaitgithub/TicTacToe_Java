// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
   static ArrayList<Integer> playerPositions = new ArrayList();
   static ArrayList<Integer> cpuPositions = new ArrayList();

   public TicTacToe() {
   }

   public static void main(String[] var0) {
      char[][] var1 = new char[][]{{' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+', '-'}, {' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+', '-'}, {' ', '|', ' ', '|', ' '}};
      printGameBoard(var1);

      while(true) {
         Scanner var2 = new Scanner(System.in);
         System.out.println("Enter your placement (1-9): ");

         int var3;
         for(var3 = var2.nextInt(); playerPositions.contains(var3) || cpuPositions.contains(playerPositions); var3 = var2.nextInt()) {
            System.out.println("Position taken! Enter a correct position");
         }

         placePiece(var1, var3, "player");
         String var4 = checkWinner();
         Random var5 = new Random();

         int var6;
         for(var6 = var5.nextInt(9) + 1; playerPositions.contains(var6) || cpuPositions.contains(cpuPositions); var6 = var5.nextInt(9) + 1) {
         }

         placePiece(var1, var6, "cpu");
         printGameBoard(var1);
         var4 = checkWinner();
         if (var4.length() > 0) {
            System.out.println(var4);
            return;
         }

         System.out.println(var4);
      }
   }

   public static void printGameBoard(char[][] var0) {
      char[][] var1 = var0;
      int var2 = var0.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char[] var4 = var1[var3];
         char[] var5 = var4;
         int var6 = var4.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            char var8 = var5[var7];
            System.out.print(var8);
         }

         System.out.println();
      }

   }

   public static void placePiece(char[][] var0, int var1, String var2) {
      byte var3 = 32;
      if (var2.equals("player")) {
         var3 = 88;
         playerPositions.add(var1);
      } else if (var2.equals("cpu")) {
         var3 = 48;
         cpuPositions.add(var1);
      }

      switch (var1) {
         case 1:
            var0[0][0] = (char)var3;
            break;
         case 2:
            var0[0][2] = (char)var3;
            break;
         case 3:
            var0[0][4] = (char)var3;
            break;
         case 4:
            var0[2][0] = (char)var3;
            break;
         case 5:
            var0[2][2] = (char)var3;
            break;
         case 6:
            var0[2][4] = (char)var3;
            break;
         case 7:
            var0[4][0] = (char)var3;
            break;
         case 8:
            var0[4][2] = (char)var3;
            break;
         case 9:
            var0[4][4] = (char)var3;
      }

   }

   public static String checkWinner() {
      List var0 = Arrays.asList(1, 2, 3);
      List var1 = Arrays.asList(4, 5, 6);
      List var2 = Arrays.asList(7, 8, 9);
      List var3 = Arrays.asList(1, 4, 7);
      List var4 = Arrays.asList(2, 5, 8);
      List var5 = Arrays.asList(3, 6, 9);
      List var6 = Arrays.asList(1, 5, 9);
      List var7 = Arrays.asList(7, 5, 3);
      ArrayList var8 = new ArrayList();
      var8.add(var0);
      var8.add(var1);
      var8.add(var2);
      var8.add(var3);
      var8.add(var4);
      var8.add(var5);
      var8.add(var6);
      var8.add(var7);
      Iterator var9 = var8.iterator();

      do {
         if (!var9.hasNext()) {
            return "";
         }

         List var10 = (List)var9.next();
         if (playerPositions.containsAll(var10)) {
            return "Congratulations you won!";
         }

         if (cpuPositions.containsAll(var10)) {
            return "CPU wins1 Sorry :(";
         }
      } while(playerPositions.size() + cpuPositions.size() != 9);

      return "CAT!";
   }
}
