/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pinball2;

/**
 *
 * @author grish
 */
class Ball {
    int x_ball;
    int y_ball;
}

public class Pinball2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Ball ball1 = new Ball(), ball2 = new Ball();
        ball1.x_ball = 890;
        ball1.y_ball = 540;
        ball2.x_ball = 890;
        ball2.y_ball = 540;
        Ball[] ball;
        ball = new Ball[10];
        int x_ballmin =0;
        int y_ballmin = 0;
        int x_ballmax = 1920;
        int y_ballmax = 1080;
        int gatemin = 400;
        int gatemax = 600;
        int rico = 0;
        int rico2 = 0;
        boolean goal = false;
        int i = 0;
        int step_x = -1;
        int step_y = 1;
        int step_x2 = 1;
        int step_y2 = -1;
        while (goal == false) {
        //команда 1 шарик катется по пол.
            ball1.y_ball = ball1.y_ball + step_y;
            ball1.x_ball = ball1.x_ball + step_x;
            ball2.y_ball = ball2.y_ball + step_y2;
            ball2.x_ball = ball2.x_ball + step_x2;
            if (ball1.y_ball <= y_ballmin){ 
                step_y = 1;
                rico = rico + 1;
            }
            if (ball1.x_ball <= x_ballmin){
                step_x = 1;
                rico = rico + 1;
            }
            if (ball1.x_ball >= x_ballmax){
                step_x = -1;
                rico = rico + 1;
            }
            if (ball1.y_ball >= y_ballmax){
                step_y = -1;
                rico = rico + 1;
                }
            //==============================================
            if (ball2.y_ball <= y_ballmin){ 
                step_y2 = 1;
                rico2 = rico2 + 1;
            }
            if (ball2.x_ball <= x_ballmin){
                step_x2 = 1;
                rico2 = rico2 + 1;
            }
            if (ball2.x_ball >= x_ballmax){
                step_x2 = -1;
                rico2 = rico2 + 1;
            }
            if (ball2.y_ball >= y_ballmax){
                step_y2 = -1;
                rico2 = rico2 + 1;
            }
            
           
        // команда 2 x_ball меньше или ровно икс бол мин или икс бол равно или больше икс бол макс

            if (ball1.x_ball <= x_ballmin  && ball1.y_ball >= gatemin && ball1.y_ball <= gatemax) {
                step_x = 0;
                step_y = 0;
            }
            if (ball1.x_ball >= x_ballmax  && ball1.y_ball >= gatemin && ball1.y_ball <= gatemax) {
                step_x = 0;
                step_y = 0;
            }
            if (ball2.x_ball <= x_ballmin  && ball2.y_ball >= gatemin && ball2.y_ball <= gatemax) {
                step_x = 0;
                step_y = 0;
            }
            if (ball2.x_ball >= x_ballmax  && ball2.y_ball >= gatemin && ball2.y_ball <= gatemax) {
                step_x = 0;
                step_y = 0;
            }
            if (step_x == 0 && step_y == 0)
                goal = true;
            if (step_x2 == 0 && step_y2 == 0)
                goal = true;
        }       
        System.out.println(ball1.x_ball);
        System.out.println(ball1.y_ball);
        System.out.println(ball2.x_ball);
        System.out.println(ball2.y_ball);
        System.out.println(rico);
        System.out.println(rico2);
    }
}
            //мф забли гол
        

    