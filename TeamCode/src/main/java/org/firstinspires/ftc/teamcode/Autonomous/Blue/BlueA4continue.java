package org.firstinspires.ftc.teamcode.Autonomous.Blue;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.Autonomous.AutonomousPLUS;


@Autonomous(group = "Blue", name = "Blue A4 Continue (Blue Terminal)")
public class BlueA4continue extends AutonomousPLUS {
    @Override
    public void runOpMode() {

        super.runOpMode();

        waitForStart();
        robot.openAndCloseClaw(0);
        prepareNextAction(300);
        sleepTime = 400;//return to 400
        moveArm("Up", .75);
        prepareNextAction(100);


       /* moveRobotForward(300);
        prepareNextAction(100);
        moveRobotRight(1400);
        prepareNextAction(100);
        moveRobotBackward(350);
*/


        moveRobotForward(300);
        prepareNextAction(100);
        moveRobotRight(2400);
        prepareNextAction(100);
        moveRobotBackward(350);
        prepareNextAction(100);
    }
}
