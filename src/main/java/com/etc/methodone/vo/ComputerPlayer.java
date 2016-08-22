package com.etc.methodone.vo;

/**
 * Created by whitewave on 2015/8/31.
 */
public class ComputerPlayer {
    private String computerName;
    private int computerScore;

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public void addScore(){
        computerScore++;
    }

    public void jianScore(){
        computerScore--;
    }
    public int show(){
        int computershoushi;
        if (3*Math.random()<1){
            computershoushi=1;
        }else if (1<3*Math.random()&&3*Math.random()<2){
            computershoushi=2;
        }else {
            computershoushi=3;
        }
        return computershoushi;

    }
//    public static void main(String[] args){
//        String aa=show();
//        System.out.print(aa);
//    }
}
