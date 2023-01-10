package org.firstinspires.ftc.teamcode.Autonomous.Red;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.Autonomous.AutonomousPLUS;
import org.firstinspires.ftc.teamcode.Autonomous.Falafel;

@Autonomous(group = "Red", name = "Imposter Red A2")
public class ImposterRedA2 extends AutonomousPLUS {
    Falafel F = new Falafel();
    @Override
    public void runOpMode() {

        super.runOpMode();
        robot.startingPosition = "Red A2";


        //Do this to pass inspection.
        waitForStart();
        if (robot.parkingZone == 1){

            robot.openAndCloseClaw(0);
            F.driveStraight(0.5,24,0);
            F.turnToHeading(0.5,90);
            F.driveStraight(0.5, 6,0);
            moveArm("Up",0.25);
            robot.openAndCloseClaw(1);
            moveArm("Down", 0.75);
            F.driveStraight(0.5,-2,0);
            F.turnToHeading(0.5,90);
            F.driveStraight(0.5, 6,0);
            F.driveStraight(0.5,12,0);

       } else if (robot.parkingZone == 2){
            robot.openAndCloseClaw(0);
            F.driveStraight(0.5,24,0);
            F.turnToHeading(0.5,-90);
            F.driveStraight(0.5, 6,0);
            moveArm("Up",0.50);
            robot.openAndCloseClaw(1);
            moveArm("Down",0.75);
            F.driveStraight(0.5,-2,0);
            F.turnToHeading(0.5,90);
            F.driveStraight(0.5, 6,0);
            F.driveStraight(0.5,12,0);


       } else if (robot.parkingZone == 3){

            robot.openAndCloseClaw(0);
            F.driveStraight(0.5,24,0);
            F.turnToHeading(0.5,-90);
            F.driveStraight(0.5, 6,0);
            moveArm("Up",0.50);
            robot.openAndCloseClaw(1);
            moveArm("Down",0.75);
            F.driveStraight(0.5,-2,0);
            F.turnToHeading(0.5,90);
            F.driveStraight(0.5, 6,0);
            F.driveStraight(0.5,12,0);

        }

    }
}


