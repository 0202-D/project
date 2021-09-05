import java.util.*;

public class crossAndZero {
    public static int Size = 3;
    public static int Dot_ToWin = 3;
    public static final char Dot_X = 'X';
    public static final char Dot_O = 'O';
    public static final char Dot_Empty = '.';
    public static Scanner in = new Scanner(System.in);
    public static Random r = new Random();
    public static char[][] map;

    public static void main(String[] args) {
        initMap();
        printMap();
        while(true){
        humanTurn();
        printMap();
       if(checkWin(Dot_X)==false){
           System.out.println("HumanWins");break;}
            if( fullMap()==false){
                System.out.println("Ничья");break;}
        aiTurn();
        printMap();
            if(checkWin(Dot_O)==false){
                System.out.println("AIWins");break;}
           if( fullMap()==false){
               System.out.println("Ничья");break;}
        }
        System.out.println("Game over");
    }

    static void initMap() {
        map = new char[Size][Size];
        for (int i = 0; i < Size; i++) {
            for (int j = 0; j < Size; j++) {
                map[i][j] = Dot_Empty;
            }
        }
    }

    static void printMap() {
        for (int i = 0; i <= Size; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < Size; i++) {

            System.out.print(i + 1 + " ");
            for (int j = 0; j < Size; j++) {

                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void humanTurn() {
        int x,y;
        do {
        System.out.println("ВВедите координаты x y");

             x = in.nextInt() - 1;
            y = in.nextInt() - 1;}
            while (!isCell(x,y)); map[x][y]=Dot_X;

        }


    static boolean isCell(int x,int y){
        if(x<0||x>=Size||y<0||y>=Size){return false;}
        if(map[x][y]==Dot_Empty){return true;}
        else{return false;}
    }
    static void aiTurn() {
        int x,y;
        do {
            x = r.nextInt(Size) ;
            y = r.nextInt(Size) ;}
        while (!isCell(x,y));
        map[x][y]=Dot_O;
        System.out.println("AI сходил на");
    }
    static boolean checkWin(char a) {
        int sum = 0;
        for (int i = 0; i < Size; i++) {
            for (int j = 0; j < Size; j++) {
                if (map[i][j] == a) {
                    sum++;
                }
                if (sum == 3) {
                    return false;
                }
            }
            sum = 0;
        }

        for (int i = 0; i < Size; i++) {
            for (int j = 0; j < Size; j++) {
                if (i == j && map[i][j] == a) {
                    sum++;
                }
            }
        }
        if (sum == 3) {
            return false;
        }
        sum = 0;
        for (int i = 0; i < Size; i++) {
            for (int j = 0; j < Size; j++) {
                if (j == Size - 1 - i && map[i][j] == a) {
                    sum++;
                }
            }
        }
        sum = 0;
        for (int i = 0; i < Size; i++) {
            for (int j = 0; j < Size; j++) {
                if (map[j][i] == a) {
                    sum++;
                }
                if (sum == 3) {
                    return false;
                }
            }
            sum = 0;
        }
        return true;

    }
    static boolean fullMap(){for(int i =0;i<Size;i++) {

    for(int j =0;j<Size;j++) {
        if (map[i][j] == Dot_Empty) {
            return true;
        }
    }}return false;}
}