package com.etc.methodone;

import com.etc.methodone.service.GameService;
import com.etc.methodone.service.impl.GameServiceImpl;
import com.etc.methodone.vo.ComputerPlayer;
import com.etc.methodone.vo.PersonPlayer;

import java.util.Scanner;

/**
 * Created by whitewave on 2015/9/1.
 */
public class PlayGame {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("+++++++++++++++欢迎进入猜拳游戏++++++++++++++++++");
        while (true) {
            System.out.println("选择你要出的手势：");
            System.out.println("1.石头   2.剪刀  3.布");
            int personshoushi = scanner.nextInt();
            if (personshoushi == 1 || personshoushi == 2 || personshoushi == 3) {
                PersonPlayer personPlayer = new PersonPlayer();
                ComputerPlayer computerPlayer = new ComputerPlayer();
                personPlayer.setPersonshoushi(personshoushi);
                int computershoushi = computerPlayer.show();
                GameService gameService = new GameServiceImpl();
                if (computershoushi == 1) {
                    System.out.println("电脑出的是石头");
                } else if (computershoushi == 2) {
                    System.out.println("电脑出的是剪刀");
                } else {
                    System.out.println("电脑出的是布");
                }
                String jieguo = gameService.result(computershoushi, personshoushi);
                System.out.print(jieguo);
                break;
            } else {
                System.out.println("输入错误，请重新输入");
            }
        }
    }

}