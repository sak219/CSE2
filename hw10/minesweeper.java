//Sam Kiernan
//CSE2
//Professor Eric Fouh
//11/14/15

//MineSweeper Program
//Prints Board but is not playable


import java.util.Scanner;

public class minesweeper{
	//Setting board as a 2d String
  static String[][] board = null;
  static int n = 0;
          
  public static void main(String[] args){
	 //Getting dimensions and mines
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the size");
      n = scan.nextInt();
      board = new String[n][n];
      //Initial Fill      
      for(int x = 0; x < n; x++){
          for(int y = 0; y < n; y++){
              board[x][y] = " ";
          }
      }
      System.out.println("How many mines?");
      int mines = scan.nextInt();
      int mineX = 0;
      int mineY = 0;
      String m = "M";
      
      //Random mine placement bro
      
      for(int i = 0; i < mines; i++){
          
          mineX =(int)(Math.random()*n);
          mineY =(int)(Math.random()*n);
          
          if(board[mineX][mineY] != m){
        	  //Puts a cute lil M where theres a mine
              board[mineX][mineY] = "M";
          }
          //If theres already a mine it goes to another random position lol
          //This program took me 3 days to complete
          //Oh boy
          else if(board[mineX][mineY] == m){
              i--;
          }
      }
      
      for(int x = 0; x < n; x++){
          for(int y = 0; y < n; y++){
              if(board[x][y] == "M"){
                  updateAdj(x, y);
              }
          }
      }
      print(board);
  }
  
  public static void add(int x, int y){
      if(board[x][y] != "M"){
          if(board[x][y] == " "){
              board[x][y] = "1";
          }else if(board[x][y] == "1"){
              board[x][y] = "2";
          }else if(board[x][y] == "2"){
              board[x][y] = "3";
          }else if(board[x][y] == "3"){
              board[x][y] = "4";
          }else if(board[x][y] == "4"){
              board[x][y] = "5";
          }
      }
  }
  //Here we have about four thousand if statements checking if the mine is 
  //on the edges of the array
  public static void updateAdj(int x, int y){
      if(x > 0 && x < (n - 1)){
          
          if(y > 0 && y < n -1){
              add(x, y-1);
              add(x, y+1);
              add(x+1, y-1);
              add(x+1, y);
              add(x+1, y+1);
              add(x-1, y-1);
              add(x-1, y);
              add(x-1, y+1);
          }
          else if(y == 0){
              add(x, y+1);
              add(x+1, y);
              add(x+1, y+1);
              add(x-1, y);
              add(x-1, y+1);
          }
          else if(y == (n - 1)){
              add(x, y-1);
              add(x+1, y-1);
              add(x+1, y);
              add(x-1, y-1);
              add(x-1, y);
          }
      }
      else if(x == 0 && (n - 1) > 0){
                      
          if(y > 0 && y < n -1){
              add(x, y-1);
              add(x, y+1);
              add(x+1, y-1);
              add(x+1, y);
              add(x+1, y+1);
          }
          else if(y == 0){
              add(x, y+1);
              add(x+1, y);
              add(x+1, y+1);
          }
          else if(y == (n - 1)){
              add(x, y-1);
              add(x+1, y-1);
              add(x+1, y);
          }
      }
      else if(x == (n - 1)){
                      
          if(y > 0 && y < n -1){
              add(x, y-1);
              add(x, y+1);
              add(x-1, y-1);
              add(x-1, y);
              add(x-1, y+1);
          }
          else if(y == 0){
              add(x, y+1);
              add(x-1, y);
              add(x-1, y+1);
          }
          else if(y == (n - 1)){
              add(x, y-1);
              add(x-1, y-1);
              add(x-1, y);
          }
      }
  }
  
 //Actually printing the actual board actually
  public static void print(String[][] board){
      for(int i = 0; i < n; i++){
          for(int j = 0; j < n; j++){
              System.out.print(board[i][j] + " ");
          }
          System.out.println();
      }
  }
  
}