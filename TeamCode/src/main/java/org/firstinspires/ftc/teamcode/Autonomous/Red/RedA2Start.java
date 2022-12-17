package org.firstinspires.ftc.teamcode.Autonomous.Red;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.Autonomous.AutonomousPLUS;

@Autonomous(group = "Red", name = "Red A2 Start (Red Terminal)")
public class RedA2Start extends AutonomousPLUS {
    @Override
    public void runOpMode() {

        super.runOpMode();
        robot.startingPosition = "Red A2";

        //Do this to pass inspection.
        waitForStart();
        if (robot.parkingZone == 1){

            robot.openAndCloseClaw(0);
            prepareNextAction(100);
            moveRobotForward(1960);
            prepareNextAction(100);
            moveRobotLeft(550);
            prepareNextAction(100);
            moveArm("Up",0.25);
            prepareNextAction(100);
            robot.openAndCloseClaw(1);
            prepareNextAction(100);
            moveArm("Down",0.75);
            prepareNextAction(100);
            moveRobotBackward(50);
            prepareNextAction(100);
            moveRobotLeft(550);
            prepareNextAction(100);
            moveRobotForward(300);

        } else if (robot.parkingZone == 2){
            robot.openAndCloseClaw(0);
            prepareNextAction(100);
            moveRobotForward(1100);
            prepareNextAction(100);
            moveRobotRight(550);
            prepareNextAction(100);
            moveArm("Up",0.50);
            prepareNextAction(100);
            robot.openAndCloseClaw(1);
            prepareNextAction(100);
            moveArm("Down",0.75);
            prepareNextAction(100);
            moveRobotBackward(50);
            prepareNextAction(100);
            moveRobotLeft(550);
            prepareNextAction(100);
            moveRobotForward(300);


        } else if (robot.parkingZone == 3){

            robot.openAndCloseClaw(0);
            prepareNextAction(100);
            moveRobotForward(1100);
            prepareNextAction(100);
            moveRobotRight(1550);
            prepareNextAction(100);
            moveArm("up",0.75);
            prepareNextAction(100);
            robot.openAndCloseClaw(1);
            prepareNextAction(100);
            moveArm("down",0.75);
            prepareNextAction(100);
            moveRobotBackward(50);
            prepareNextAction(100);
            moveRobotLeft(550);
            prepareNextAction(100);
            moveRobotForward(300);

        }

    }
}


