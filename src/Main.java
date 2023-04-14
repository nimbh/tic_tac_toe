import java.util.Scanner;

public class Main {
    public static boolean player1 = true;
    public static boolean player2 = true;

    public static boolean play = true;
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        char [][] desk = new char[3][3];

        // Заполнение поля
        for (int i=0; i< desk.length;i++){
            for (int j=0; j< desk.length; j++){
                desk[i][j]='-';
            }
        }

        int horisontal = 0;
        int vertical=0;


        // показ поля
        showDesk(desk);

        while (play){
                while (player1){
                    try {
                        System.out.println("ходит игрок 1");
                        //ход игрока 1
                        System.out.println("координаты по горизонтали (0, 1, 2) :");
                        horisontal = sc.nextInt();
                        System.out.println("координаты по вериткали (0, 1, 2) :");
                        vertical = sc.nextInt();
                        if (desk[horisontal][vertical]=='-'){
                            desk[horisontal][vertical]='x';
                            showDesk(desk);
                            isWon(desk);
                            break;
                        } else {
                            System.out.println("Это место уже занято! Укажите другие координаты");
                        }
                    }catch (Exception e){
                        System.out.println("Вы ввели неверное значение");
                    }
                }

                while (player2) {
                    try {
                        System.out.println("ходит игрок 2");
                        //ход игрока 2
                        System.out.println("координаты по горизонтали (0, 1, 2) :");
                        horisontal = sc.nextInt();
                        System.out.println("координаты по вериткали (0, 1, 2) :");
                        vertical = sc.nextInt();
                        if (desk[horisontal][vertical] == '-') {
                            desk[horisontal][vertical] = 'o';
                            showDesk(desk);
                            isWon(desk);
                            break;
                        } else {
                            System.out.println("Это место уже занято! Укажите другие координаты");
                        }
                    } catch (Exception e){
                        System.out.println("Вы ввели неверное значение");
                    }
                }
        }
    }

    public static void showDesk(char[][] desk){
        for (int i=0; i< desk.length;i++){
            for (int j=0; j< desk.length; j++){
                System.out.print(desk[i][j]);
            }
            System.out.println();
        }
    }

    public static void isWon(char[][] desk){
        boolean is = false;

        if (desk[0][0] == desk[1][1] && desk[2][2] == desk[0][0] && desk[1][1] != '-') {
            is=true;
            switch (desk[1][1]) {
                case 'x':
                    System.out.println("Выйграл игрок 1");
                    break;
                case 'o':
                    System.out.println("Выйграл игрок 2");
                    break;
            }
        } else if (desk[0][0] == desk[1][0] && desk[1][0] == desk[2][0] && desk[1][0] != '-') {
            is=true;
            switch (desk[0][0]) {
                case 'x':
                    System.out.println("Выйграл игрок 1");
                    break;
                case 'o':
                    System.out.println("Выйграл игрок 2");
                    break;
            }
        } else if (desk[2][0] == desk[1][1] && desk[1][1] == desk[0][2] && desk[1][1] != '-') {
            is=true;
            switch (desk[2][0]) {
                case 'x':
                    System.out.println("Выйграл игрок 1");
                    break;
                case 'o':
                    System.out.println("Выйграл игрок 2");
                    break;
            }

        } else if (desk[0][1] == desk[1][1] && desk[1][1] == desk[2][1] && desk[1][1] != '-') {
            is=true;
            switch (desk[0][1]) {
                case 'x':
                    System.out.println("Выйграл игрок 1");
                    break;
                case 'o':
                    System.out.println("Выйграл игрок 2");
                    break;
            }
        } else if (desk[0][2] == desk[1][2] && desk[1][2] == desk[2][2] && desk[1][2] != '-') {
            is=true;
            switch (desk[0][2]) {
                case 'x':
                    System.out.println("Выйграл игрок 1");
                    break;
                case 'o':
                    System.out.println("Выйграл игрок 2");
                    break;
            }
        }else if (desk[0][0] == desk[0][1] && desk[0][1] == desk[0][2] && desk[0][2] != '-') {
            is=true;
            switch (desk[0][2]) {
                case 'x':
                    System.out.println("Выйграл игрок 1");
                    break;
                case 'o':
                    System.out.println("Выйграл игрок 2");
                    break;
            }
        } else if (desk[1][0] == desk[1][1] && desk[1][1] == desk[1][2] && desk[1][2] != '-') {
            is=true;
            switch (desk[0][2]) {
                case 'x':
                    System.out.println("Выйграл игрок 1");
                    break;
                case 'o':
                    System.out.println("Выйграл игрок 2");
                    break;
            }
        } else if (desk[2][0] == desk[2][1] && desk[2][1] == desk[2][2] && desk[2][2] != '-') {
            is=true;
            switch (desk[0][2]) {
                case 'x':
                    System.out.println("Выйграл игрок 1");
                    break;
                case 'o':
                    System.out.println("Выйграл игрок 2");
                    break;
            }
        }

        if (is){
            falsePlayer();
            play = false;
        }

    }

public static void falsePlayer(){
    player1=false;
    player2=false;
}

}