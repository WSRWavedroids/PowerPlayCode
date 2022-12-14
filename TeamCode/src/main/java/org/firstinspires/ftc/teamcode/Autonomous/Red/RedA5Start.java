package org.firstinspires.ftc.teamcode.Autonomous.Red;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.Autonomous.AutonomousPLUS;

@Autonomous(group = "Red", name = "Red A5 Start (Blue Terminal)")
public class RedA5Start extends AutonomousPLUS {
    @Override
    public void runOpMode() {

        super.runOpMode();
        startingPosition = "Red A5";

        waitForStart();

        if (robot.parkingZone == 1){

            robot.openAndCloseClaw(0);
            prepareNextAction(100);
            moveRobotForward(1100);
            prepareNextAction(100);
            moveRobotLeft(1550);
            prepareNextAction(100);
            moveArm("Up",0.75);
            prepareNextAction(100);
            robot.openAndCloseClaw(1);
            prepareNextAction(100);
            moveArm("Down",0.75);
            prepareNextAction(100);
            moveRobotBackward(50);
            prepareNextAction(100);
            moveRobotRight(250);
            prepareNextAction(100);
            moveRobotForward(300);

        } else if (robot.parkingZone == 2){

            robot.openAndCloseClaw(0);
            prepareNextAction(100);
            moveRobotForward(1950);
            prepareNextAction(100);
            moveRobotLeft(550);
            prepareNextAction(100);
            moveArm("Up",0.50);
            prepareNextAction(100);
            robot.openAndCloseClaw(1);
            prepareNextAction(100);
            moveArm("Down",0.75);
            prepareNextAction(100);
            moveRobotBackward(50);
            prepareNextAction(100);
            moveRobotRight(550);
            prepareNextAction(100);
            moveRobotForward(300);


        } else if (robot.parkingZone == 3){

            moveRobotRight(2000);
            prepareNextAction(200);
            moveRobotForward(3000);
            prepareNextAction(200);

        }






    }
    //so uh yeah we totally made this for outreach
}


