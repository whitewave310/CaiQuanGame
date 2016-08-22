package com.etc.methodone.service.impl;

import com.etc.methodone.service.GameService;
import com.etc.methodone.vo.ComputerPlayer;
import com.etc.methodone.vo.PersonPlayer;

/**
 * Created by whitewave on 2015/8/31.
 */
public class GameServiceImpl implements GameService{
    public String result(int computershoushi, int personshoushi) {
        ComputerPlayer computerPlayer=new ComputerPlayer();
        PersonPlayer personPlayer=new PersonPlayer();
        String jieguo=null;
        if (computershoushi==personshoushi){
            jieguo="他和你一样哦，平手";

        }else if (computershoushi==1&&personshoushi==2){
            jieguo="你输了哦";
            computerPlayer.addScore();
            personPlayer.jianScore();
        }else if (computershoushi==1&&personshoushi==3){
            jieguo="你赢了哦";
            computerPlayer.jianScore();
            personPlayer.addScore();
        }else if (computershoushi==2&&personshoushi==1){
            jieguo="你赢了哦";
            computerPlayer.jianScore();
            personPlayer.addScore();
        }else if (computershoushi==2&&personshoushi==3){
            jieguo="你输了哦";
            computerPlayer.addScore();
            personPlayer.jianScore();
        }else if (computershoushi==3&&personshoushi==1){
            jieguo="你输了哦";
            computerPlayer.addScore();
            personPlayer.jianScore();
        }else {
            jieguo="你赢了哦";
            computerPlayer.jianScore();
            personPlayer.addScore();
        }

        return jieguo;
    }
}